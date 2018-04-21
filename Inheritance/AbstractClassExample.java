/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.*;

//Normal class
class Dob
{
    String day;
    String month;
    int year;
    
}
// 
//abstract method should have atleast one abstract method.
//The methods cant be 1.static 2.private 3.final
// It can have non static methods also.
//No implementation of the abstract methods inside the abstract class.
abstract class child
{
String name;
abstract void sex();
void printname()
{
    System.out.println("the name is");
}

 child()
 {   
System.out.println("this is class child constructor");
}
class Boy extends child
{
    float weight;
    void sex()
    {
        System.out.println("this is boy");
    }
    void schoolAdress()
    {
        System.out.println("not needed");
    }
    Boy()
    {
        super();
        weight= 3.5f;
        System.out.println("this is boy class constructor");
    }
}
}


public class AbstractClassExample {
   public static void main(String [] args)
   {
     child c = new Boy();  
       
   }

}