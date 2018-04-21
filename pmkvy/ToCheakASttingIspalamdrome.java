/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;
import java.util.Scanner;
public class ToCheakASttingIspalamdrome 
{
    public static void main(String [] args)
    {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the string to cheak whether it is palamdrome or not");
    String input= scn.nextLine();
    for(int i=0;i<input.length()/2;i++)
    {
        if(input.charAt(i)!=input.charAt(input.length() -i-1))
        {
            System.out.println("not a palamdrome");
            return;
        }
    }
    System.out.println("it is a palamdromr");
    }
}
