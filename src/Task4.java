/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/30/2021
 *   Time: 10:32 AM
 *   File: Insertion.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("enter the size of an array");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] arr = new int [n];

        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("enter the position where you want to insert the elemrnt ");
        int pos = s.nextInt();
        System.out.println("enter the element that you want to insert");
        int e = s.nextInt();
        for (int i = n-1; i < pos-1 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = e;
        System.out.println("after insertion");
        System.out.println(Arrays.toString(arr));

    }
}