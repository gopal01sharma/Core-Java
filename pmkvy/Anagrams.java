/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the word");
        String s1 = scn.nextLine();
        System.out.println("enter the word");
        String s2 =scn.nextLine();
        anagrams(s1,s2);
    }
public static void anagrams(String one, String two)
{
    boolean result =false;
    
    if(one.length()==two.length())
    {
      result= true;
    for(int i=0;i<one.length();i++)
    {
      if(count(one.charAt(i),one)!=count(one.charAt(i),two))
      {
          result=false;
          break;
      }
   
 
}
}
System.out.println(result);
}
public static int count(char c,String s)
{
  int count =0;  
for(int i=0;i<s.length();i++)
{
    if(c==s.charAt(i))
    {
        count++;
    }
}
return count;
}
}