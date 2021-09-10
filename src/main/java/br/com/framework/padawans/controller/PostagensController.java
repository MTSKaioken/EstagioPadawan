/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.controller;

import javax.validation.Valid;

import br.com.framework.padawans.model.Postagens;
import br.com.framework.padawans.repository.PostagensRepository;
import br.com.framework.padawans.service.PostagensService;
import static br.com.framework.padawans.service.PostagensService.buscarPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 *
 * @author mtskaioken
 */
@Controller
public class PostagensController {
    
    @Autowired
    private PostagensRepository repository;
    
    @GetMapping("/posts")
    public ModelAndView posts() {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("postagens");
        
        modelAndView.addObject("postagens", new Postagens());
        modelAndView.addObject("allPostagens", repository.getAllPostagens());
        return modelAndView;
    }
    
    @RequestMapping(value="/posts", method=RequestMethod.POST)
    public String createPostagem(@Valid @ModelAttribute Postagens postagens, BindingResult result, RedirectAttributes redirectAttributes){  
        if(result.hasErrors()){
         return "redirect:posts";
        }
        repository.add(postagens);
        return "redirect:posts";
        
        }
}
