package com.mmr.musicfyartist.InterfaceServices;
import com.mmr.musicfymodels.Model.Album;
import com.mmr.musicfymodels.Model.Artista;

import java.util.List;
import java.util.Optional;

public interface InterfaceArtistaServices
{
    public Iterable <Artista> findAll();
    public Optional <Artista> findById(int id);
    public Artista save(Artista artista);
    public void deleteById(int id);
}
