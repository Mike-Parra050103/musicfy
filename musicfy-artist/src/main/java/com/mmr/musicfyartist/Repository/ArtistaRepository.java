package com.mmr.musicfyartist.Repository;

import com.mmr.musicfymodels.Model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Integer>
{
}
