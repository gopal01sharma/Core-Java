/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ToCompareTheLengthOfTwoStrings {
    public static void main(String [] args)
    {
        ToCompareTheLengthOfTwoStrings L = new ToCompareTheLengthOfTwoStrings();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the strings");
        String input1 = scn.nextLine();
        String input2 = scn.nextLine();
        L.compareLength(input1, input2);
    }
public void compareLength(String input1, String input2)
{
    int result;
    if(input1.length()>input2.length())
    {
        System.out.println("Frist string is Greater");
    }
    else if(input1.length()==input2.length())
    {
      System.out.println("Both strings are equal");  
    }
    else 
    {
        System.out.println("Second string is Greater");
    }
}
}
