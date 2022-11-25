import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ArtistServiceService} from "../artist-service.service";
import {Artista} from "../../Model/Artista";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']
})
export class AddArtistComponent implements OnInit
{

  constructor(private router:Router, private service: ArtistServiceService) { }

  artista: Artista = new Artista();

  ngOnInit(): void
  {
  }

  guardarArtistas(nombre: string, tipo: string)
  {
    this.artista.nombre_artista=nombre;
    this.artista.tipo_artista= Number(tipo) ;

    this.service.setArtistas(this.artista).subscribe
    (
      ele=>
      {
        alert("Se agregó el artista con éxito");
        this.router.navigate((["listArtist"]));
      }
    )
  }
}
