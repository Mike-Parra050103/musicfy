package com.mmr.musicfyalbum.InterfaceServices;
import com.mmr.musicfymodels.Model.Album;

import java.util.List;
import java.util.Optional;

public interface InterfaceAlbumServices
{
    public List<Album> listarAlbumes();
    public Optional<Album> listarIdAlbumes(int id);
    public int save(Album album);
    public void delete(int id);
}
