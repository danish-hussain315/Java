import java.util.*;
class Person{
String name=null;
double weight=0;
int age=0;
void display(){
System.out.print("Name: "+name+ "\nWeight: "+weight+"\nAge: "+age);
}
void init(){
Scanner input=new Scanner(System.in);
name=input.nextLine();
weight=input.nextDouble();
age=input.nextInt();
}
}