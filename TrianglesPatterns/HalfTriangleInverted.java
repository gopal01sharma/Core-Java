

package TrianglesPatterns;
import java.util.Scanner;
public class HalfTriangleInverted 
{
    public static void main(String[] args)
    {
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the number of lines");
      int input =scn.nextInt();
      for(int i=1;i<=input;i++)
              
      {
          for(int j=input;j>=i;j--)
          {
            System.out.print("$");   
          }
      System.out.println();
      }
     
        
    }
}
