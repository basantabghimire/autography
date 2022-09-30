import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-album-details',
  templateUrl: './album-details.component.html',
  styleUrls: ['./album-details.component.css']
})
export class AlbumDetailsComponent implements OnInit {

  title='Albums Details'
  title1='Edit Albums'

  fileToUpload: File | null = null;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  
  value='clear me'
  save='save me'
  albumPrivacy = new FormControl('');

  albumPrivacyList: string[] = ['Only-Me', 'Friends', 'family', 'Public'];

  album0={
    albumId:1,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
   
  }
  album1={
    albumId:1,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
    
  }
  onAlbumClick(){
    this.router.navigate(['/photo'])
  }

}
