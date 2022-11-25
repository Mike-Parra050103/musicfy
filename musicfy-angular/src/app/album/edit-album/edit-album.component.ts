import { Component, OnInit } from '@angular/core';
import {Album} from "../../Model/Album";
import {Router} from "@angular/router";
import {AlbumServiceService} from "../album-service.service";

@Component({
  selector: 'app-edit-album',
  templateUrl: './edit-album.component.html',
  styleUrls: ['./edit-album.component.css']
})
export class EditAlbumComponent implements OnInit {

  album: Album = new Album();
  constructor(private router: Router, private service: AlbumServiceService) { }

  ngOnInit(): void
  {
    this.editarAlbum();
  }

  editarAlbum()
  {
    let id = localStorage.getItem("id");
    // @ts-ignore
    this.service.getAlbumByID(+id)
      .subscribe
      (
        data =>
        {
          this.album = data;
        }
      )
  }
}
