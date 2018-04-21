/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class PrintEachCharacterofAstring {
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the string");
        String input=scn.nextLine();
        printstring(input);
    }
public static void printstring(String s)
{
   for(int i= 0;i<s.length();i++)
    {
    System.out.println(s.charAt(i)); 
    }

}
}