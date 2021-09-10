/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.repository;

import br.com.framework.padawans.model.Albuns;
import br.com.framework.padawans.service.AlbunsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mtskaioken
 */
@Repository
public class AlbunsRepository {
    private List<Albuns> albuns;
    
    public AlbunsRepository(){
       albuns = new ArrayList<>();
       for(Integer id = 1; id < 17; id++){       
            Albuns albuns = AlbunsService.buscarAlbuns(id);
            add(albuns);
        }
   }
     
    public List<Albuns> getAllAlbuns(){
        return this.albuns;
   }
    
   public void add(final Albuns albuns) {
       this.albuns.add(albuns);
    } 
    
}
