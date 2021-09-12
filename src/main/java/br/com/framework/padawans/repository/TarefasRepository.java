/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.repository;

import br.com.framework.padawans.model.Tarefas;
import br.com.framework.padawans.service.TarefasService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mtskaioken
 */
@Repository
public class TarefasRepository {
    private List<Tarefas> tarefas;
    
    public TarefasRepository(){
       tarefas = new ArrayList<>();
      for(Integer id = 1; id < 17; id++){       
            Tarefas tarefas = TarefasService.buscarTarefas(id);
            add(tarefas);
        }
   }
    
    public List<Tarefas> getAllTarefas(){
        return this.tarefas;
   }
    
   public void add(final Tarefas tarefas) {
       this.tarefas.add(tarefas);
    } 

    public int incrementID() {
        return tarefas.size();
    }
}
