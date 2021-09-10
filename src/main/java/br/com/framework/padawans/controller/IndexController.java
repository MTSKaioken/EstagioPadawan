/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.controller;

import br.com.framework.padawans.model.Postagens;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mtskaioken
 */
@Controller
public class IndexController {
    
    @GetMapping("/")
    public ModelAndView index(){
     final ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("index");
     return modelAndView;
    }
    
}
