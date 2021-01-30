/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/27/2021
 *   Time: 10:36 AM
 *   File: Array.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = s.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] =s.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i <n ; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("difference between largest and smallest " +diff);
    }
}