/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ReverseTheString {
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the string");
        String input= scn.nextLine();
        printReverse(input);
    
    }
public static void printReverse(String input)
{
   char [] ch = input.toCharArray() ;
   for(int i = ch.length-1;i>=0;i--)
   {
    System.out.print(ch[i]);  
   }
  
}
}
