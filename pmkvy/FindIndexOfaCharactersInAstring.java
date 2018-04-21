/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class FindIndexOfaCharactersInAstring {
     static Scanner scn = new Scanner(System.in);
    public static void main(String [] args)
    {
      
       System.out.println("enter the string");
       String input =scn.nextLine();
       findIndex(input);
    }
public static void findIndex(String s){
    System.out.println("enter the the desired piece of string");
    String input =scn.nextLine();
    int index = s.indexOf(input);
    int index1 = s.lastIndexOf(input);
    System.out.println("the desires index from last = " +index1);
    System.out.println("the desires index = " +index);
}

}
