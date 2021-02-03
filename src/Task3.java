/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/30/2021
 *   Time: 10:50 AM
 *   File: CommonElements.java
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("enter the size of an array");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int j = 0; j < n; j++) {
            arr2[j] = s.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i] == arr2[j]) {
                    System.out.println("common elements are " + arr[i]);
                }
            }

        }
    }
}