//Student Management System->program helps to pratice
Class,Object,Fields,Constructor,this,Method
class Student{
    // String name;
int rollNo;
String branch;

Student(String name,int rollNo,String branch){
    this.name=name;
    this.rollNo=rollNo;
    this.branch=branch;
}
 void display(){
    System.out.println("Student name:"+name);
    System.out.println("Roll Number:"+rollNO);
    System.out.println("Branch:"+branch);

 }