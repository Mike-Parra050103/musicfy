package com.mmr.musicfyartist.Controller;

import com.mmr.musicfyartist.Services.ArtistaServices;
import com.mmr.musicfymodels.Model.Artista;
import com.mmr.musicfyartist.InterfaceServices.InterfaceArtistaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/artist"})
public class ControladorArtista
{
    @Autowired
    private ArtistaServices artistaService;

    @GetMapping("/listarArtista")
    public List<Artista> listarArtista()
    {
        return (List<Artista>) artistaService.listarArtista();
    }

    @GetMapping("/nuevoArtista")
    public String agregarArtista(Model model)
    {
        model.addAttribute("artista", new Artista());
        return "artistaForm";
    }

    @PostMapping("/guardarArtista")
    public String guardarArtista(@Valid Artista artista, Model model)
    {
        artistaService.save(artista);
        return "redirect:/listarArtista";
    }

    @GetMapping("/editarArtista/{id_artista}")
    public String editarArtista(@PathVariable int id_artista, Model model)
    {
        Optional<Artista> artista = artistaService.listarIdArtista(id_artista);
        model.addAttribute("artista", artista);
        return "artistaForm";
    }

    @GetMapping("/eliminarArtista/{id_artista}")
    public String eliminarArtista(Model model, @PathVariable int id_artista)
    {
        artistaService.delete(id_artista);
        return "redirect:/listarArtista";
    }
}
