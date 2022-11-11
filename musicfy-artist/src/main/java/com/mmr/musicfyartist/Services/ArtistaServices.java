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
    private ArtistaRepository repository;

    @Override
    public Iterable<Artista> findAll()
    {
        return repository.findAll();
    }

    @Override
    public Optional<Artista> findById(int id)
    {
        return repository.findById(id);
    }

    @Override
    public Artista save(Artista artista)
    {
        return repository.save(artista);
    }

    @Override
    public void deleteById(int id)
    {
        repository.deleteById(id);
    }
}
