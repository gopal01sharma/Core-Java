/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class RemoveOneBetweenZeros {
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the number");
    String input = scn.nextLine();
    removeone(input); 
  }
public static void  removeone(String result)
{
    String empty ="";
    empty = empty+result.charAt(0);
    boolean flag = true;
   for( int i=1;i<result.length()-1;i++)
   {
       if(result.charAt(i)=='1')
       {
           
           if((result.charAt(i+1)=='0') && (result.charAt(i-1)=='0'))
           {
               flag = false;
           }
       }
           if(flag)
           {
               System.out.println(result.charAt(i));
               empty =empty + result.charAt(i);
           }
           
 
   }
 empty= empty+ result.charAt(result.length()-1);
System.out.println("the final output is "+empty);
}
}
