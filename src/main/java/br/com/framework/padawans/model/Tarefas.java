/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.model;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author mtskaioken
 */
@Getter
@Setter
@NoArgsConstructor
public class Tarefas {
    private Integer id;
    @NotBlank
    private String title;
    private boolean completed;
   
    public Tarefas(final String tituloTarefa){
        this.title = title;
    }
    public Tarefas(final Integer id, final String tituloTarefa, final boolean statusTarefa){
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
