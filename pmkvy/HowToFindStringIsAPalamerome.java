/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class HowToFindStringIsAPalamerome {
   public static void main(String [] args)
   {
       Scanner scn= new Scanner(System.in);
       System.out.println("enter the string");
       String input = scn.nextLine();
       checkpalamdrome(input);   
   }
public static void checkpalamdrome(String result)
{
 for(int i=0;i<=(result.length()-1)/2;i++)
 {
     if(result.charAt(i)!= result.charAt(result.length()-i-1))
     {
     System.out.println("the String is not palamdrome");
     System.exit(0);
     }
  }
 
     System.out.println("the string is Palindrome");
           


           
}
}