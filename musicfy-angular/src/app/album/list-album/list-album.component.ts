import { Component, OnInit } from '@angular/core';
import {Artista} from "../../Model/Artista";
import {ArtistServiceService} from "../../artist/artist-service.service";
import {Router} from "@angular/router";
import {Album} from "../../Model/Album";
import {AlbumServiceService} from "../album-service.service";

@Component({
  selector: 'app-list-album',
  templateUrl: './list-album.component.html',
  styleUrls: ['./list-album.component.css']
})
export class ListAlbumComponent implements OnInit {

  albums:Album[];
  constructor(private service:AlbumServiceService, private router: Router) { }

  ngOnInit(): void
  {
    this.service.getAlbums().subscribe
    (
      ele=>
      {
        this.albums=ele;
        console.log(this.albums);
      }
    )
  }


  editarAlbum(album: Album)
  {
    localStorage.setItem("id", album.id_album.toString());
    this.router.navigate(["editAlbum"]);
  }

  eliminarAlbum(album: Album)
  {
    this.service.deleteAlbum(album)
      .subscribe
      (
        data =>
        {
          this.albums = this.albums.filter(p => p! == album);
          alert("Album Eliminado");
          this.router.navigate(["listAlbum"]);
        }
      )
  }
}
