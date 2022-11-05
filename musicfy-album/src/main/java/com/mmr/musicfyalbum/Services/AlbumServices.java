package com.mmr.musicfyalbum.Services;

import com.mmr.musicfymodels.Model.Album;
import com.mmr.musicfyalbum.InterfaceServices.InterfaceAlbumServices;
import com.mmr.musicfyalbum.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServices implements InterfaceAlbumServices
{
    @Autowired
    private AlbumRepository data;

    @Override
    public List<Album> listarAlbumes()
    {
        return (List<Album>) data.findAll();
    }

    @Override
    public Optional<Album> listarIdAlbumes(int id)
    {
        return data.findById(id);
    }

    @Override
    public int save(Album album)
    {
        int respuesta = 0;
        Album album1 = data.save(album);

        if (!album1.equals(null))
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
