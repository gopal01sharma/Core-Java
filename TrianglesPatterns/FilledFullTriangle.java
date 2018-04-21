/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandlingandinheritanc;

import java.util.Scanner;
public class FilledFullTriangle {
  public static void main(String[] args)
  {
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the number of lines");
      int lines = scn.nextInt(); 
  for(int i=1;i<=lines;i++)
  {
  for(int j=1;j<=i;j++){
      System.out.print("$");
  }
  System.out.println();
  }
  
  
  }
    
    
    
    
    
}
