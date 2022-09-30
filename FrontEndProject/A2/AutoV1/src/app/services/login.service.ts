import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url="http://localhost:4200"

  constructor(private http:HttpClient) { }

  //ccalling server
  generateToken(credentials:any){
    //profile generate
    return this.http.post(`${this.url}/profile`,credentials)


  }
  //for login user
  loginUser(profile: string){
    localStorage.setItem("token", profile);
    return true;
  }
  //checked user is login or not
  isLoggedIn(){
    let profile = localStorage.getItem("profile");
    if(profile==undefined||profile==''||profile==null){
      return false;
    }else{
      return true;
    }
  }
  //checked user is logout
  logout(){
    localStorage.removeItem('profile');
    return true;
  }
  // for get token
  getProfile(){
    return localStorage.getItem("profile");
  }
}
