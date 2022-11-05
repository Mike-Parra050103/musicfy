import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddArtistComponent } from './add-artist/add-artist.component';
import { EditArtistComponent } from './edit-artist/edit-artist.component';
import { DeleteArtistComponent } from './delete-artist/delete-artist.component';
import { ListArtistComponent } from './list-artist/list-artist.component';



@NgModule({
  declarations: [
    AddArtistComponent,
    EditArtistComponent,
    DeleteArtistComponent,
    ListArtistComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ArtistModule { }
