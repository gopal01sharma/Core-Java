/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ToCheckIfTheTWoStringsAreEqualOrNot {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the two strings");
        String input1 = scn.nextLine();
        String input2 = scn.nextLine();
        compare(input1,input2);
    }
public static  void compare(String a, String b)
{
    if(a.equals(b))
    {
        System.out.println("String 1 and 2 are equal");
    }
    else{
    System.out.println("String 1 and 2 are not equal");
        }
}
}
