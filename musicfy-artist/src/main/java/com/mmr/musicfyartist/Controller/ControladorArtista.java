package com.mmr.musicfyartist.Controller;

import java.util.Optional;

import com.mmr.musicfyartist.Services.ArtistaServices;
import com.mmr.musicfymodels.Model.Artista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControladorArtista
{
    @Autowired
    private ArtistaServices service;

    @GetMapping("/artist")
    public ResponseEntity<?> listar()
    {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/artist/{id}")
    public ResponseEntity <?> ver(@PathVariable int id)
    {
        Optional <Artista> o=service.findById(id);

        if(o.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(o.get());
    }

    @PostMapping("/artist")
    public Artista guardar(@RequestBody Artista artista)
    {
        return service.save(artista);
    }

    @PutMapping("/artist/{id}")
    public ResponseEntity <?> editar(@RequestBody Artista artista, @PathVariable int id)
    {
        Optional <Artista> o=service.findById(id);

        if(o.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        Artista artistaBaseDatos = o.get();

        artistaBaseDatos.setId_artista(artista.getId_artista());
        artistaBaseDatos.setNombre_artista(artista.getNombre_artista());
        artistaBaseDatos.setTipo_artista(artista.getTipo_artista());
        artistaBaseDatos.setGenerosArtistas(artista.getGenerosArtistas());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(artistaBaseDatos));
    }


    @DeleteMapping("/artist/{id}")
    public ResponseEntity <?> eliminar(@PathVariable int id)
    {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
