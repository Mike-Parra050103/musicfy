package com.mmr.musicfyhome.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador
{
    @GetMapping("/home")
    public String listarAlbum(Model model)
    {
        return "index";
    }
}
