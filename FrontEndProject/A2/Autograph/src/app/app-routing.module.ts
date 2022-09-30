import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlbumDetailsComponent } from './Components/album-details/album-details.component';
import { CreateAlbumComponent } from './Components/create-album/create-album.component';
import { LoginComponent } from './Components/login/login.component';
import { MyAlbumsComponent } from './Components/my-albums/my-albums.component';
import { PhotoDetailsComponent } from './Components/photo-details/photo-details.component';
import { ProfileComponent } from './Components/profile/profile.component';
import { UploadPictureComponent } from './Components/upload-picture/upload-picture.component';
import { ToolbarComponent } from './Components/toolbar/toolbar.component';

const routes: Routes = [
  {path:'profile', component: ProfileComponent},
  {path:'login', component: LoginComponent},
  {path:'albums', component: MyAlbumsComponent},
  {path:'create', component: CreateAlbumComponent},
  {path:'album', component: AlbumDetailsComponent},
  {path:'upload', component: UploadPictureComponent},
  {path:'photo', component: PhotoDetailsComponent},
  {path:'', redirectTo:'/login', pathMatch:'full'},
  {path:'ToolbarComponent',component:ToolbarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
