/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class PrintWhetherANumberIsevenOrOdd
{
    public static void main(String [] args)
    {
   Scanner scn = new Scanner(System.in);
   System.out.println("enter the number");
   int input = scn.nextInt();
   checkEvenOrodd(input);
    }
   public static void checkEvenOrodd( int input)
{
    if(input%2==0)
    {
        System.out.println("the number is even");
    }
    else 
    {
       System.out.println("the number is odd");  
    }
}
}