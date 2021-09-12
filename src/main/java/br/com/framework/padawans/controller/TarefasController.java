/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.padawans.controller;

import br.com.framework.padawans.model.Tarefas;
import br.com.framework.padawans.repository.TarefasRepository;
import javax.validation.Valid;
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
public class TarefasController {
    
    @Autowired
    private TarefasRepository repository;
    
    @GetMapping("/tarefas")
    public ModelAndView tarefas(){
     final ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("tarefas");
     
     modelAndView.addObject("allTarefas", repository.getAllTarefas());
     return modelAndView;
    }
    
    @PostMapping("/tarefas")
    public String createTarefa(@Valid @ModelAttribute Tarefas tarefas, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
        redirectAttributes.addFlashAttribute("message", "Campo(s) vazio(s)!");
        return "redirect:tarefas";
        }
         tarefas.setId(repository.incrementID()+1);
        repository.add(tarefas);        
        return "redirect:tarefas";
        }
}
