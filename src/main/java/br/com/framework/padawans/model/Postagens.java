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

@Setter
@Getter
@NoArgsConstructor
public class Postagens {
    private Integer id;
    @NotBlank
    private String title;
    @NotBlank
    private String body;
    
    public Postagens(final String title){
        this.title = title;

    }
    
    public Postagens(final Integer id, final String title, final String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
