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
public class Albuns {

   private Integer albumId;
   private Integer id;
   @NotBlank
   private String title;
   @NotBlank
   private String url;
   @NotBlank   
   private String thumbnailUrl;

    public Albuns(Integer albumId, Integer id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }
   
   
}
