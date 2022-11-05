package com.mmr.musicfyartist.InterfaceServices;
import com.mmr.musicfymodels.Model.Artista;

import java.util.List;
import java.util.Optional;

public interface InterfaceArtistaServices
{
    public List<Artista> listarArtista();
    public Optional<Artista> listarIdArtista(int id);
    public int save(Artista artista);
    public void delete(int id);
}
