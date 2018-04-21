/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrianglesPatterns;
import java.util.Scanner;
public class PrintHalfTriangleInvertedOpposite {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the height of the triangle");
        int input = scn.nextInt();
        for(int i=0;i<input;i++)
        {
            for(int k=0;k<i;k++)
            {
             System.out.print(" ");
            }
            for(int j=input;j>i;j--)
            {
              System.out.print("$");  
            }
         System.out.println();
        }
   
    }
}
