import { Component, OnInit } from '@angular/core';
import signin from '../login/signin.json';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  signin


  constructor( private login:HttpClient) {

    this.login.get('http://jsonplaceholder.typeicode.com/posts').subscribe(response=>this.signin=response)
   }

  ngOnInit() {
  }

}
