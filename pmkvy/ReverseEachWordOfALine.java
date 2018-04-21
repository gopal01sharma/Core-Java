
package pmkvy;
import java.util.Scanner;
public class ReverseEachWordOfALine {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the line");
        String input = scn.nextLine();
        splitAndReverse(input);
    }
public static void splitAndReverse(String input)
{
    String [] s1 = input.split(" ");
    for(int i= s1.length-1;i>=0;i--)
        System.out.print(s1[i]+" ");
}

}
