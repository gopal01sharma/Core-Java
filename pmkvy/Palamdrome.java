/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;
import java.util.Scanner;
public class Palamdrome 

{
    public static void main(String[] args)
    {
        int reverse=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number to cheak wheather it is palampdrome or not ");
        int input = scn.nextInt();
        // creating a temprory variabe and stooring the input.
        int temp = input;
        while(temp > 0)// next itration the vale will be 12. accourding to example 123
        {
            int r= temp%10;
            reverse= reverse*10+r;
            temp=temp/10;//value is decreasing by 10
        }
    if(input== reverse)
    {
    System.out.println("it is a palamdrome");    
    }
    else
    {
        System.out.println("not a palamdrome");
    }
    }
    
    
}
