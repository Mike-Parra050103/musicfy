import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Artista} from "../../Model/Artista";
import {Album} from "../../Model/Album";
import {AlbumServiceService} from "../album-service.service";

@Component({
  selector: 'app-add-album',
  templateUrl: './add-album.component.html',
  styleUrls: ['./add-album.component.css']
})
export class AddAlbumComponent implements OnInit {

  constructor(private router:Router, private service: AlbumServiceService) { }

  album: Album = new Album();

  ngOnInit(): void
  {
  }

  guardarAlbum(nombre: string, tipo: string, fecha: string, duracion: string)
  {
    this.album.nombre_album = nombre;
    this.album.tipo_album = Number(tipo);
    this.album.fecha_salida= fecha;
    this.album.duracion= duracion;

    this.service.setAlbum(this.album).subscribe
    (
      ele=>
      {
        alert("Se agregó el album con éxito");
        this.router.navigate((["listAlbum"]));
      }
    )
  }

}
