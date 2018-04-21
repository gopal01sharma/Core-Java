/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrianglesPatterns;
import java.util.Scanner;
public class HalfTrianglePatternPrint {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int input = scn.nextInt();
        drawTriangle(input);
    }
    public static void drawTriangle(int result)
    {
        for(int i=1 ;i<=result;i++)
        {
            for(int j=result;j>i;j--)
                System.out.print(" ");
            for(int k=0;k<i;k++)
            {
                System.out.print("$");
            }
            System.out.println();
        }

    }   
}
