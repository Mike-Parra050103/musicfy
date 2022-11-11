package com.mmr.musicfyalbum.InterfaceServices;

import com.mmr.musicfymodels.Model.Album;
import java.util.Optional;

public interface InterfaceAlbumServices {
    public Iterable <Album> findAll();
    public Optional <Album> findById(int id);
    public Album save(Album album);
    public void deleteById(int id);

}