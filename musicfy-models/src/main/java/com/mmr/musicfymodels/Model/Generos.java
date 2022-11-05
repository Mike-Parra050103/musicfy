package com.mmr.musicfymodels.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "generos")
public class Generos
{
    public Generos()
    {

    }

    public Generos(int id_genero, String nombre_genero)
    {
        this.id_genero = id_genero;
        this.nombre_genero = nombre_genero;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero", nullable = false)
    private int id_genero;

    @Column(name = "nombre_genero", nullable = false)
    private String nombre_genero;

    @ManyToMany(mappedBy = "generosArtistas")
    private List<Artista> generosArtistas;

    @ManyToMany(mappedBy = "generosAlbumes")
    private List<Album> generosAlbumes;

    // Getters y Setters

    public int getId_genero()
    {
        return id_genero;
    }

    public void setId_genero(int id_genero)
    {
        this.id_genero = id_genero;
    }

    public String getNombre_genero()
    {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero)
    {
        this.nombre_genero = nombre_genero;
    }
}
