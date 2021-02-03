/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 2/3/2021
 *   Time: 10:30 AM
 *   File: Task6.java
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of person whom you give a loan");
        int n =  s.nextInt();
        String [] arr = new String[n];
        String [] arr3 = new String[n];
        int [] arr1 = new int[n];
        System.out.println("enter the name:");
        for (int i = 0; i <n ; i++) {
            arr[i] =s.next();
        }
        System.out.println("enter the amount:");
        for (int i = 0; i <n ; i++) {
            arr1[i] =s.nextInt();
        }

        System.out.println("The list of persons that takes the loans with there amount");

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i] + " " + arr1[i]);
        }
        System.out.println("the person who returned the loan");
        String q = s.next();

        arr3[n] = arr[n];

        arr3[n-1] = q ;
        for (int i = 0; i <arr3.length-1 ; i++) {
               arr3[i] = arr3[i+1];
        }

        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr[i]);
        }



    }
}