import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {AddArtistComponent} from "./artist/add-artist/add-artist.component";
import {DeleteArtistComponent} from "./artist/delete-artist/delete-artist.component";
import {EditArtistComponent} from "./artist/edit-artist/edit-artist.component";
import {ListArtistComponent} from "./artist/list-artist/list-artist.component";
import {ArtistServiceService} from '../app/artist/artist-service.service'

import {AddAlbumComponent} from "./album/add-album/add-album.component";
import {DeleteAlbumComponent} from "./album/delete-album/delete-album.component";
import {EditAlbumComponent} from "./album/edit-album/edit-album.component";
import {ListAlbumComponent} from "./album/list-album/list-album.component";
import {AlbumServiceService} from '../app/album/album-service.service';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,

    AddArtistComponent,
    DeleteArtistComponent,
    EditArtistComponent,
    ListArtistComponent,

    AddAlbumComponent,
    DeleteAlbumComponent,
    EditAlbumComponent,
    ListAlbumComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ArtistServiceService, AlbumServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
