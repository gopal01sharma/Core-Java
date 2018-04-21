/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
import java.util.Scanner;
public class StringBufferIntroducton {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the atring");
        StringBuffer sb = new StringBuffer(scn.nextLine());
    sb.append( " sharma");
    System.out.println(sb);
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    System.out.println(sb.replace (0, 5, "shabd"));
    System.out.println(sb.reverse());
    }
}
