/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;
import java.util.Scanner;
public class Stringpair {
  static boolean function(String input)
   {
      if(input.charAt(0)== input.charAt(2)) 
      return true;
      else
      return false;
   }
    
    
    public static void main(String[] args)
    {
       int count=0;
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the string");
        String input = scn.nextLine();
        for(int i=0;i<input.length()-2;i++)
                {
                    if(function(input.substring(i, i+3)))
                        count++;
                }
        System.out.println(count);
     }
}

