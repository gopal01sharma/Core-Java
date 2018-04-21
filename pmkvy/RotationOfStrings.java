/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class RotationOfStrings {
    public static void main(String [] args)
    {
        Scanner scn  =new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = scn.nextLine();
        System.out.println("the length of string1is"+s1.length());
        System.out.println("enter the second string");
        String s2 = scn.nextLine();
        System.out.println("the length of string1is"+s2.length());
        int matchIndex = 0;
        int endIndex = 0;
        boolean result =false;
        if(s1.length()==s2.length())
       {
           for(int i =0;i<s1.length();i++)
           {
            if(s1.charAt(i)==s2.charAt(0))
            {
                matchIndex=1;
                break;
            }   
           }
       }
    System.out.println("the matchindex is"+ matchIndex);
    
    }
}
