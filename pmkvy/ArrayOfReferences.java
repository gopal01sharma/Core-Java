

package pmkvy;
import java.util.Scanner;
public class ArrayOfReferences {
 public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
Student stu []= new Student[3];
for(int i=0;i<stu.length;i++)
{
 System.out.println("enter the name");
 String name= scn.next();
 System.out.println("enter the course");
 String course= scn.next();
 System.out.println("enter the roll number");
 int roll =scn.nextInt();
 //object creation and initialization 
 stu[i]= new Student(name,course,roll);

   }
for(int i=0;i<stu.length;i++)
{
    stu[i].displayDetails();
}
    
}

}   

class Student
{
String name;
String course;
int roll;   
    Student()
    {
    name="Gopal";
    course="java";        
    roll=10;
    }
    Student(String name,String course,int roll)  
    {
       this.name=name;
       this.course=course;
       this.roll=roll;
    }
      void displayDetails()
      {
          System.out.println("the name of student is"+ name);
          System.out.println("the course of student is"+ course);
          System.out.println("the roll number of student is"+ roll);
      }
}