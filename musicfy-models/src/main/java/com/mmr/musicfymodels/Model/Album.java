package com.mmr.musicfymodels.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "album")
public class Album
{
    public Album()
    {

    }

    public Album(int id_album, String nombre_album, int tipo_album, String fecha_salida, String duracion, List<Generos> generosAlbumes)
    {
        this.id_album = id_album;
        this.nombre_album = nombre_album;
        this.tipo_album = tipo_album;
        this.fecha_salida = fecha_salida;
        this.duracion = duracion;
        this.generosAlbumes = generosAlbumes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_album", nullable = false)
    private int id_album;

    @Column(name = "nombre_album", nullable = false)
    private String nombre_album;

    @Column(name = "tipo_album", nullable = false)
    private int tipo_album;

    @Column(name = "fecha_salida", nullable = false)
    private String fecha_salida;

    @Column(name = "duracion", nullable = false)
    private String duracion;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable
            (
                    name = "album_genero",
                    joinColumns = @JoinColumn(name = "id_album"),
                    inverseJoinColumns = @JoinColumn(name = "id_genero")
            )
    private List<Generos> generosAlbumes;

    // Getters y Setters

    public int getId_album()
    {
        return id_album;
    }

    public void setId_album(int id_album)
    {
        this.id_album = id_album;
    }

    public String getNombre_album()
    {
        return nombre_album;
    }

    public void setNombre_album(String nombre_album)
    {
        this.nombre_album = nombre_album;
    }

    public int getTipo_album()
    {
        return tipo_album;
    }

    public void setTipo_album(int tipo_album)
    {
        this.tipo_album = tipo_album;
    }

    public String getFecha_salida()
    {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida)
    {
        this.fecha_salida = fecha_salida;
    }

    public String getDuracion()
    {
        return duracion;
    }

    public void setDuracion(String duracion)
    {
        this.duracion = duracion;
    }

    public List<Generos> getGenerosAlbumes()
    {
        return generosAlbumes;
    }

    public void setGenerosAlbumes(List<Generos> generosAlbumes)
    {
        this.generosAlbumes = generosAlbumes;
    }
}
