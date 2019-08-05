import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent implements OnInit {
  employees=
  [
    {empId:1001,empName:"Rahul",empSal:9000,empDep:"Java"},
    {empId:1002,empName:"Sachin",empSal:19000,empDep:"OraApps"},
    {empId:1003,empName:"Vikash",empSal:29000,empDep:"BI"},
    ];
    angle


  constructor() { }

  ngOnInit() {
  }
  add(form){
    this.employees.push(form);

  }
  delete(i)
  {
    this.employees.splice(i,1);
  }
  updation(i)
  {
    this.angle=i;
  }
  update(form)
  {
 if(form.empId!=null){
  this.employees[this.angle].empId=form.empId;
 }if(form.empName!=null)
 {
  this.employees[this.angle].empName=form.empName;
 }
 if(form.empSal!=null)
 {
  this.employees[this.angle].empSal=form.empSal;
 }
 if(form.empDep!=null)
 {
 this.employees[this.angle].empDep=form.empDep;
  }
  }
}
