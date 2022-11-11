import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Artista} from "../Model/Artista";
import {Album} from "../Model/Album";

@Injectable({
  providedIn: 'root'
})
export class AlbumServiceService
{
  constructor(private http:HttpClient) { };

  Url = 'http://localhost:8991/album/album';

  getAlbums()
  {
    return this.http.get<Album[]>(this.Url);
  }
}
