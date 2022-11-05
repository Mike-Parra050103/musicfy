import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddAlbumComponent } from './add-album/add-album.component';
import { ListAlbumComponent } from './list-album/list-album.component';
import { DeleteAlbumComponent } from './delete-album/delete-album.component';
import { EditAlbumComponent } from './edit-album/edit-album.component';



@NgModule({
  declarations: [
    AddAlbumComponent,
    ListAlbumComponent,
    DeleteAlbumComponent,
    EditAlbumComponent
  ],
  imports: [
    CommonModule
  ]
})
export class AlbumModule { }
