import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-photo-details',
  templateUrl: './photo-details.component.html',
  styleUrls: ['./photo-details.component.css']
})
export class PhotoDetailsComponent implements OnInit {

  constructor(private router:Router) { }
  viewCount=0;

  ngOnInit(): void {
  }

  title='Photo'

  value='clear me'
  save='save me'
  albumPrivacy = new FormControl('');

  albumPrivacyList: string[] = ['Only-Me', 'Friends', 'family', 'Public'];

  album0={
    albumId:1,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
    button0:'Delete',
    button1:'change photo'
  }
  album1={
    albumId:1,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
    button1:'Delete',
  }
  onAlbumClick(){
    this.router.navigate(['/photo'])
  }

  likeCount(){
    this.viewCount++;
  }

}
