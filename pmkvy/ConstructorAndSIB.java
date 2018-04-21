/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;

public class ConstructorAndSIB 
{
String name;
int roll;
char sex;
public void print()
{
  System.out.println(name);
  System.out.println(roll);
  System.out.println(sex);
}
static
        {
         System.out.println("this will execute first even befre object creation because this is static block");
        }
ConstructorAndSIB()
    {
        name="shabd";
        roll=1;
        sex='m';
    }
    public static void main(String [] args)
    {
    ConstructorAndSIB object =new ConstructorAndSIB();
    object.print();
                
            
    }
}
