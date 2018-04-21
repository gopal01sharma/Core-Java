/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.*;
public class CountTheOccouranceOfDigits {
    public static void main (String [] arga)
    {
        Scanner scn=  new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= scn.nextInt();
        System.out.println("enter the digit");
        int d =scn.nextInt();
        for(int i=1;i<n;i++)
        {
          countOccourance1(i,d);
        }
    }

public static void countOccourance1(int a ,int b)
{
String str= ""+a;    
String dSequence=""+b;
if(str.contains(dSequence))
{
    System.out.println(a);
}
}
}
