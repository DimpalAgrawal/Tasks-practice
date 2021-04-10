/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 2/17/2021
 *   Time: 11:18 AM
 *   File: Main1.java
 */


import java.util.Scanner;

public class Main1 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter tne array size");
            int n = s.nextInt();
            Task8 obj = new Task8();
            obj.EnqueueFront(n);
        }

    }
