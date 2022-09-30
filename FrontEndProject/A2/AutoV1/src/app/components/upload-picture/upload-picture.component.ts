import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-upload-picture',
  templateUrl: './upload-picture.component.html',
  styleUrls: ['./upload-picture.component.css']
})
export class UploadPictureComponent implements OnInit {

  title="Upload Photo"

  constructor() { }

  ngOnInit(): void {
  }
  value='clear me'
  save='upload picture'

  upload='upload pictures';

  albumPrivacy = new FormControl('');

  albumPrivacyList: string[] = ['Only-Me', 'Friends', 'family', 'Public'];

  uPicture(){
    this.uPicture;
  }

}
