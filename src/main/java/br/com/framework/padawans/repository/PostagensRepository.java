/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.repository;

import br.com.framework.padawans.model.Postagens;
import br.com.framework.padawans.service.PostagensService;
import static br.com.framework.padawans.service.PostagensService.buscarPosts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mtskaioken
 */
@Repository
public class PostagensRepository {
   private List<Postagens> postagens;   
  
   public PostagensRepository() {
       postagens = new ArrayList<>();
       for(Integer id = 1; id < 17; id++){       
            Postagens postagens = PostagensService.buscarPosts(id);
            add(postagens);
        }
   }
            
   public List<Postagens> getAllPostagens(){
        return this.postagens;
   }
   
    public void add(final Postagens postagens) {
       this.postagens.add(postagens);
    }
}
