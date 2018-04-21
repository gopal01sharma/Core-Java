/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class SplitFunctionOfString {
    public static void main(String [] args)
    {
       Scanner scn = new Scanner(System.in);
       System.out.println("enter the string");
       String input =scn.nextLine();
       splitFnction(input);
    }
public static void  splitFnction(String input)
        {
    //you can put any character between (" between ")
       String [] result = input.split(" ");
        for(String s: result)
        {
            System.out.println(s);
        }
        }
     
}
