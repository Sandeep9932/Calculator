import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  constructor(public http:HttpClient)
  {

  }
  num1=0;
  num2=0;
  result=0;

  add()
  {
    let url='http://localhost:8080/add'+this.num1+'and'+this.num2;
    this.http.get(url).subscribe((data:any)=>
    {
      this.result=data;
    });
    
  }

  sub()
  {
    let url='http://localhost:8080/sub'+this.num1+'and'+this.num2;
    this.http.get(url).subscribe((data:any)=>
    {
      this.result=data;
    });
  }
  mult()
  {
    let url='http://localhost:8080/mult'+this.num1+'and'+this.num2;
    this.http.get(url).subscribe((data:any)=>
    {
      this.result=data;
    });
  }
  div()
  {
    let url='http://localhost:8080/div'+this.num1+'and'+this.num2;
    this.http.get(url).subscribe((data:any)=>
    {
      this.result=data;
    });
  }
  mod()
  {
    let url='http://localhost:8080/mod'+this.num1+'and'+this.num2;
    this.http.get(url).subscribe((data:any)=>
    {
      this.result=data;
    });
  }
}
