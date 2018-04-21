/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;
import java.util.*;
import java.lang.Math;
public class HeronsFormula {
    public static void main(String[] args)
        {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the sides of triangle");
        double s;
        double area;
        double side1= scn.nextDouble();
        double side2= scn.nextDouble();
        double side3= scn.nextDouble();
        
        s = (side1+side2+side3)/2;
        area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("the area of triangle is "+ area);
        }
}
