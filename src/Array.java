/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/27/2021
 *   Time: 10:36 AM
 *   File: Array.java
 */

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a[] = {7,3,6,4,5};

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        int c = a[a.length-1];
        int a1 = a[0];
        int b1 = c;
        int q = b1-a1;

        System.out.println(" The differnce between both largest nad smallest numbers ");
        System.out.print(q);

    }
}