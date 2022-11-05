import { Component } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'musicfy-angular';

  constructor(private router:Router) {
  }

  //---Artistas---
  listarArtistas()
  {
    this.router.navigate(["listArtist"]);
  }

  anadirArtistas()
  {
    this.router.navigate(["addArtist"]);
  }

  editarArtistas()
  {
    this.router.navigate(["editArtist"]);
  }

  eliminarArtistas()
  {
    this.router.navigate(["deleteArtist"]);
  }
  //---Artistas---

  //---Album---
  listarAlbum()
  {
    this.router.navigate(["listAlbum"]);
  }

  anadirAlbum()
  {
    this.router.navigate(["addAlbum"]);
  }

  editarAlbum()
  {
    this.router.navigate(["editAlbum"]);
  }

  eliminarAlbum()
  {
    this.router.navigate(["deleteAlbum"]);
  }
  //---Album---
}
