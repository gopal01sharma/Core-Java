/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ConvertUpperIntoLowerCaseAndLowerIntoUPPerCase {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the input string");
        String input = scn.nextLine();
        String result= convert(input);
        System.out.println(result);
    }
public static String convert(String s)
{
    String a="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)>=65 && s.charAt(i)<=91)
        {
         a = a+ (char)( s.charAt(i)+32);   
        }
        else if(s.charAt(i)>=97 && s.charAt(i)<=122)
        {
            a= a+ (char)(s.charAt(i)-32);
        }
        else 
        {
            a= a+ s.charAt(i);
        }
    }
return(a);
}
}
