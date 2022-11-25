package com.mmr.musicfyalbum.Controller;

import java.util.Optional;

import com.mmr.musicfyalbum.Services.AlbumServices;
import com.mmr.musicfymodels.Model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorAlbum
{
    @Autowired
    private AlbumServices service;

    @GetMapping("/album")
    public ResponseEntity<?> listar()
    {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/album/{id}")
    public Optional<Album> ver(@PathVariable int id)
    {
        return service.findById(id);
    }

    @PostMapping("/album")
    public ResponseEntity <?> guardar(@RequestBody Album album)
    {
        Album albumBaseDatos = service.save(album);
        return ResponseEntity.status(HttpStatus.CREATED).body(albumBaseDatos);
    }

    @PutMapping("/album/{id}")
    public ResponseEntity <?> editar(@RequestBody Album album, @PathVariable int id)
    {
        Optional <Album> o=service.findById(id);

        if(o.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        Album albumBaseDatos = o.get();

        albumBaseDatos.setId_album(album.getId_album());
        albumBaseDatos.setNombre_album(album.getNombre_album());
        albumBaseDatos.setTipo_album(album.getTipo_album());
        albumBaseDatos.setGenerosAlbumes(album.getGenerosAlbumes());
        albumBaseDatos.setDuracion(album.getDuracion());
        albumBaseDatos.setFecha_salida(album.getFecha_salida());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(albumBaseDatos));
    }


    @DeleteMapping("/album/{id}")
    public Optional<Album> eliminar(@PathVariable int id)
    {
        return service.deleteById(id);
    }

}
