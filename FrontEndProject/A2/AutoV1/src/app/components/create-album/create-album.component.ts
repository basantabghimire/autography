import { Component, OnInit,Inject } from '@angular/core';
import { FormControl } from '@angular/forms';


@Component({
  selector: 'app-create-album',
  templateUrl: './create-album.component.html',
  styleUrls: ['./create-album.component.css']
})
export class CreateAlbumComponent implements OnInit {

  title='Create Albums'

  fileToUpload: File | null = null;

  albumName="aName";
  date={};

  constructor() { }
  CreateAlbumComponent(files: FileList) {
  //this.fileToUpload = files.item(0);  
}
  ngOnInit(): void {
  }
  
  RequestUpload(){

  }
  value='clear me'
  save='save me'

  albumPrivacy = new FormControl('');

  albumPrivacyList: string[] = ['Only-Me', 'Friends', 'family', 'Public'];

}


  
