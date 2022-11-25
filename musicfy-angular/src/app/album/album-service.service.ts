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

  setAlbum(album: Album)
  {
    return this.http.post<Album[]>(this.Url, album);
  }

  getAlbumByID(id: number)
  {
    return this.http.get<Album>(this.Url + "/" + id);
  }

  updateAlbum(album: Album)
  {
    return this.http.put<Album>(this.Url + "/" + album.id_album, album);
  }

  deleteAlbum(albun: Album)
  {
    return this.http.delete<Album>(this.Url + "/" + albun.id_album);
  }
}
