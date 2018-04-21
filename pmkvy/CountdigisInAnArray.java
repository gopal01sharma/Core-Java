/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;

import java.util.Scanner;
public class CountdigisInAnArray
{
    public static void main(String [] args)
        {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String input = scn.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++)
            {
            //0=48,9=57
               if (((input.charAt(i))>=48)&&((input.charAt(i))<=57))
               {
                   count++;
                
            }
                
            }
System.out.println("the number of digis in a string is "+ count);
        }
}