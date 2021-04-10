/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 3/3/2021
 *   Time: 10:26 AM
 *   File: Task9.java
 */

import java.util.Scanner;

public class TowerTask9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        shift(n, 'A', 'A', 'D');
    }

    public static void shift(int n, char s, char a, char d) {

        if (n >= 1) {

            shift(n - 1, s, d, a);
            System.out.println(n + " " + s + "  " + d);
            shift(n - 1, a, s, d);

        }
    }
}








