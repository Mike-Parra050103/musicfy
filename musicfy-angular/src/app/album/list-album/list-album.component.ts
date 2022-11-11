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


}
