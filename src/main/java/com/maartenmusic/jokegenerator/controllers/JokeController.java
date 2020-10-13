package com.maartenmusic.jokegenerator.controllers;

import com.maartenmusic.jokegenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    // === fields ===

    private JokeService jokeService;

    // ===  constructors ===

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    // === handler methods ===

//    @RequestMapping({"/", ""})
    @GetMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}

