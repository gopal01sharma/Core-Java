/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmkvy;

import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter element in Array : ");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
