/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class ToFindRepeatedWordInAString {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String input = scn.nextLine();
    findrepeatedword(input);
    }
public static void findrepeatedword(String result)
{
    String [] Str_arr =result.split(" ");
    for(int i=0;i<Str_arr.length;i++)
    {
        for(int j=i+1;j<Str_arr.length;j++)
        {
            if(Str_arr[i].equals(Str_arr[j]))
            {
                System.out.println("the word "+Str_arr[i]+" is repeated");
            }
        }
    }
}
}
