package com.mmr.musicfyartist.Services;

import com.mmr.musicfymodels.Model.Artista;
import com.mmr.musicfyartist.InterfaceServices.InterfaceArtistaServices;
import com.mmr.musicfyartist.Repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaServices implements InterfaceArtistaServices
{
    @Autowired
    private ArtistaRepository data;

    @Override
    public List<Artista> listarArtista()
    {
        return (List<Artista>) data.findAll();
    }

    @Override
    public Optional<Artista> listarIdArtista(int id)
    {
        return data.findById(id);
    }

    @Override
    public int save(Artista artista)
    {
        int respuesta = 0;
        Artista artista1 = data.save(artista);

        if (!artista1.equals(null))
        {
            respuesta = 1;
        }
        return respuesta;
    }

    @Override
    public void delete(int id)
    {
        data.deleteById(id);
    }
}
