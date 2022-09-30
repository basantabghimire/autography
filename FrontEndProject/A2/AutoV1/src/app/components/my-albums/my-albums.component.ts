import { getLocaleDateFormat } from '@angular/common';
import { AfterViewInit, Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';



@Component({
  selector: 'app-my-albums',
  templateUrl: './my-albums.component.html',
  styleUrls: ['./my-albums.component.css']
})
export class MyAlbumsComponent implements OnInit {
  
  title='Album'

  album0={
    albumId:0,
    albumName:'Create Album',
    createAlbum:'create_new_folder',
  }
  
  album1={
    albumId:1,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
  }
   
  album2={  
    albumId:2,
    albumName:'Party Time',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
  }
  album3={
    albumId:3,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
  }
     
  album4= {  
    albumId:4,
    albumName:'SunnyDay',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
  }

  album5={
    albumId:5,
    albumName:'familyFun',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
  }
       
  album6= {  
    albumId:6,
    albumName:'SunnyDay',
    imageUrl:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeOI_0kO1QhPn5BWc-D8QWvny8OaGuQP_h2K6MXCVty-KeiHvyZ1LBN973PzK3NIhhWjA&usqp=CAU',
    }

  constructor(
    private router:Router    
    ) { } //using private router:Router for routing
  ngOnInit(): void {
  }
  onPhotoClick(){
    //this.router.navigateByUrl('/photo'); //using navigateByUrl
    this.router.navigate(['/album']); //using navigate
  }
  onAlbumClick(){
    this.router.navigate(['/create'])
  }

}
