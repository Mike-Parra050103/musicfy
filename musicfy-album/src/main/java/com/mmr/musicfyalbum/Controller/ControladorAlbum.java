package com.mmr.musicfyalbum.Controller;

import com.mmr.musicfymodels.Model.Album;
import com.mmr.musicfyalbum.InterfaceServices.InterfaceAlbumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ControladorAlbum
{
    @Autowired
    private InterfaceAlbumServices albumService;

    @GetMapping("/listarAlbum")
    public String listarAlbum(Model model)
    {
        List<Album> album = albumService.listarAlbumes();
        model.addAttribute("album", album);
        return "albumPagina";

    }

    @GetMapping("/nuevoAlbum")
    public String agregarArtista(Model model)
    {
        model.addAttribute("album", new Album());
        return "albumForm";
    }

    @PostMapping("/guardarAlbum")
    public String guardarAlbum(@Valid Album album, Model model)
    {
        albumService.save(album);
        return "redirect:/listarAlbum";
    }

    @GetMapping("/editarAlbum/{id_album}")
    public String editarAlbum(@PathVariable int id_album, Model model)
    {
        Optional<Album> album = albumService.listarIdAlbumes(id_album);
        model.addAttribute("album", album);
        return "albumForm";
    }

    @GetMapping("/eliminarAlbum/{id_album}")
    public String eliminarAlbum(Model model, @PathVariable int id_album)
    {
        albumService.delete(id_album);
        return "redirect:/listarAlbum";
    }
}
