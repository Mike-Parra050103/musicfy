package com.mmr.musicfyalbum.Services;

import java.util.Optional;

import com.mmr.musicfyalbum.InterfaceServices.InterfaceAlbumServices;
import com.mmr.musicfyalbum.Repository.AlbumRepository;
import com.mmr.musicfymodels.Model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServices implements InterfaceAlbumServices
{
    @Autowired
    private AlbumRepository repository;
    @Override
    public Iterable<Album> findAll()
    {
        return repository.findAll();
    }

    @Override
    public Optional<Album> findById(int id)
    {
        return repository.findById(id);
    }

    @Override
    public Album save(Album album)
    {
        return repository.save(album);
    }

    @Override
    public Optional<Album> deleteById(int id)
    {
        return Optional.empty();
    }

    /*
    @Override
    public Optional<Album> deleteById(int id)
    {

    }
    */
 }

