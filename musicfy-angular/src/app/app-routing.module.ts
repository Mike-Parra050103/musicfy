import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {AddArtistComponent} from "./artist/add-artist/add-artist.component";
import {DeleteArtistComponent} from "./artist/delete-artist/delete-artist.component";
import {EditArtistComponent} from "./artist/edit-artist/edit-artist.component";
import {ListArtistComponent} from "./artist/list-artist/list-artist.component";

import {AddAlbumComponent} from "./album/add-album/add-album.component";
import {DeleteAlbumComponent} from "./album/delete-album/delete-album.component";
import {EditAlbumComponent} from "./album/edit-album/edit-album.component";
import {ListAlbumComponent} from "./album/list-album/list-album.component";

const routes: Routes =
  [
    {path: 'addArtist', component: AddArtistComponent},
    {path: 'deleteArtist', component: DeleteArtistComponent},
    {path: 'editArtist', component: EditArtistComponent},
    {path: 'listArtist', component: ListArtistComponent},

    {path: 'addAlbum', component: AddAlbumComponent},
    {path: 'deleteAlbum', component: DeleteAlbumComponent},
    {path: 'editAlbum', component: EditAlbumComponent},
    {path: 'listAlbum', component: ListAlbumComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule
{

}
