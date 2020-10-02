package com.salesianostriana.ToDoList.controller;

import com.salesianostriana.ToDoList.model.Tarea;
import com.salesianostriana.ToDoList.service.TareaService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/toDoList")
public class ControllerPpal {

    @Autowired
    private final TareaService servicioTarea;

    @GetMapping("/")
    public String inicioTareas(Model model){
        model.addAttribute("tareas",servicioTarea.findAll());
        return "index";
    }

    @GetMapping("/newTarea/")
    public String nuevaTarea(Model model){
        model.addAttribute("tarea", new Tarea());
        return "newTarea";
    }

    @PostMapping("/newTarea/submit")
    public String nuevaTareaSubmit(@ModelAttribute("tarea") Tarea tarea){
        servicioTarea.save(tarea);
        return "redirect:/toDoList/";
    }

    @GetMapping("/editTarea/{idTarea}")
    public String editarTarea(@PathVariable long idTarea, Model model){
        Tarea tarea = servicioTarea.findById(idTarea);
        model.addAttribute("tarea", tarea);
        return "newTarea";
    }

    @PostMapping("/editTarea/submit")
    public String editarTareaSubmit(@ModelAttribute("tarea") Tarea tarea){
        servicioTarea.edit(tarea);
        return "redirect:/toDoList/";
    }

}
