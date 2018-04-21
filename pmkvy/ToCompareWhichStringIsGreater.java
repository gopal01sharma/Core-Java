/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ToCompareWhichStringIsGreater {
    public static void main(String [] args)
    {
      Scanner scn =new Scanner(System.in);
      System.out.println("enter the two strings");
      String input1 = scn.nextLine();
      String input2 = scn.nextLine();
      compareStrings(input1,input2);
    }
public static void compareStrings(String a, String b)
{
    int result = a.compareTo(b);
    System.out.println(result);
}
}
