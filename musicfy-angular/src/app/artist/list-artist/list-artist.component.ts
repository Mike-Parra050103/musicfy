import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ArtistServiceService} from "../../artist/artist-service.service"
import {Artista} from "../../Model/Artista";

@Component({
  selector: 'app-list-artist',
  templateUrl: './list-artist.component.html',
  styleUrls: ['./list-artist.component.css']
})
export class ListArtistComponent implements OnInit {

  artistas:Artista[];
  constructor(private service:ArtistServiceService, private router: Router) { }

  ngOnInit(): void
  {
    this.service.getArtistas().subscribe
    (
      ele=>
      {
        this.artistas=ele;
        console.log(this.artistas);
      }
    )
  }
}
