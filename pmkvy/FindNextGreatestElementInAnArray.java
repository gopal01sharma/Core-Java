/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmkvy;
public class FindNextGreatestElementInAnArray {
    public static void main(String [] args)
    {
     int arr [] ={24,2,34,12,43,23};
             findGreatest(arr);
    } 
public static void findGreatest(int [] a )
{
    for(int i= 0;i<a.length;i++)
    {
       for(int j=i+1;j<a.length;j++) 
       {
        if(a[j]>a[i])
        {
            System.out.println("the next greatest elemennt of "+ a[i]+"->"+ a[j]);
        break;
        }
       }
    }
       
}


}
