/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/27/2021
 *   Time: 11:05 AM
 *   File: DuplicateElements.java
 */

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
         int n = s.nextInt();

         int [] arr = new int [n];

        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }

        int c = 0;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]) {
                    c=c+1;
                    System.out.println(arr[j]);
                }
            }
        }
        System.out.println("number of duplicates "+c);
    }
}