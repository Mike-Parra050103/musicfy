import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Artista } from '../Model/Artista'

@Injectable({
  providedIn: 'root'
})
export class ArtistServiceService
{
  constructor(private http:HttpClient) { };

  Url = 'http://localhost:8991/artist/artist';

  getArtistas()
  {
    return this.http.get<Artista[]>(this.Url);
  }

  setArtistas(artista:Artista)
  {
    return this.http.post<Artista[]>(this.Url, artista);
  }
}
