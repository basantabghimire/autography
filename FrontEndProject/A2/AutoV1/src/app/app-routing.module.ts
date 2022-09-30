import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlbumDetailsComponent } from './components/album-details/album-details.component';
import { CreateAlbumComponent } from './components/create-album/create-album.component';
import { LoginComponent } from './components/login/login.component';
import { MyAlbumsComponent } from './components/my-albums/my-albums.component';
import { PhotoDetailsComponent } from './components/photo-details/photo-details.component';
import { ProfileComponent } from './components/profile/profile.component';
import { UploadPictureComponent } from './components/upload-picture/upload-picture.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  { path:'',redirectTo:'/login', pathMatch:'full'},
  {path:'profile', component:ProfileComponent},
  {path:'albums',component:MyAlbumsComponent},
  {path:'create', component: CreateAlbumComponent},
  {path:'album', component: AlbumDetailsComponent},
  {path:'upload', component: UploadPictureComponent},
  {path:'photo', component: PhotoDetailsComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
