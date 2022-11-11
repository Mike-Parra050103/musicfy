import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ArtistServiceService} from "../artist-service.service";
import {Artista} from "../../Model/Artista";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']
})
export class AddArtistComponent implements OnInit {

  constructor(private router:Router, private service: ArtistServiceService) { }

  ngOnInit(): void
  {
  }

  guardarArtistas(artista: Artista)
  {
    this.service.setArtistas(artista).subscribe
    (
      ele=>
      {
        alert("Se agregó el artista con éxito");
        this.router.navigate((["listArtist"]));
      }
    )
  }
}
