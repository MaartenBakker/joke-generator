package com.maartenmusic.jokegenerator.controllers;

import com.maartenmusic.jokegenerator.services.GetJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    // === fields ===

    private GetJokeService getJokeService;

    // ===  constructors ===

    public JokesController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    // === handler methods ===

    @GetMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", getJokeService.getJoke());
        return "chucknorris";
    }
}
