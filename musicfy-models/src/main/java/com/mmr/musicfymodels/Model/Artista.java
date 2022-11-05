package com.mmr.musicfymodels.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artista")
public class Artista
{
    public Artista()
    {

    }

    public Artista(int id_artista, String nombre_artista, int tipo_artista, List<Generos> generos)
    {
        this.id_artista = id_artista;
        this.nombre_artista = nombre_artista;
        this.tipo_artista = tipo_artista;
        this.generosArtistas = generosArtistas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_artista", nullable = false)
    private int id_artista;

    @Column(name = "nombre_artista", nullable = false)
    private String nombre_artista;

    @Column(name = "tipo_artista", nullable = false)
    private int tipo_artista;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable
            (
                    name = "artista_genero",
                    joinColumns = @JoinColumn(name = "id_artista"),
                    inverseJoinColumns = @JoinColumn(name = "id_genero")
            )
    private List<Generos> generosArtistas;

    // Getters y Setters

    public int getId_artista()
    {
        return id_artista;
    }

    public void setId_artista(int id_artista)
    {
        this.id_artista = id_artista;
    }

    public String getNombre_artista()
    {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista)
    {
        this.nombre_artista = nombre_artista;
    }

    public int getTipo_artista()
    {
        return tipo_artista;
    }

    public void setTipo_artista(int tipo_artista)
    {
        this.tipo_artista = tipo_artista;
    }

    public List<Generos> getGenerosArtistas()
    {
        return generosArtistas;
    }

    public void setGenerosArtistas(List<Generos> generosArtistas)
    {
        this.generosArtistas = generosArtistas;
    }
}
