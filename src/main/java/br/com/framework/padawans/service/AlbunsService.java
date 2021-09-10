/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.service;

import br.com.framework.padawans.model.Albuns;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author mtskaioken
 */
public class AlbunsService {
        static String webService = "https://jsonplaceholder.typicode.com/photos/";
        static int codigoSucesso = 200;
        
        public static Albuns buscarAlbuns(Integer id)  {
        
        try {
        
        
            URL url = new URL(webService+id);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            if (conexao.getResponseCode() != codigoSucesso) {
                    throw new RuntimeException("HTTP error code : "+ conexao.getResponseCode());
            }	

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

             Gson gson = new Gson();
             Albuns albuns = gson.fromJson(jsonEmString, Albuns.class);
             
             conexao.disconnect();
             return albuns;

        }   
        catch (Exception e) { 
        }
           
     return null;   
    }        
           
}

