/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/2/2021
 *   Time: 1:22 PM
 *   File: main.java
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();

        Boolean flag = true;
        while(flag) {
            System.out.println("");
            System.out.println("1   Add at first");
            System.out.println("2    add at position");
            System.out.println("3    View List");
            System.out.println("4    Exit");
            System.out.println("Entre your choice");
            int choice = s.nextInt();
            int val,pos;
            switch (choice) {
                case 1:
                    val = s.nextInt();
                    list.InsertAtfirst(val);
                    break;
                case 2:
                    pos= s.nextInt();
                    val = s.nextInt();
                    list.InsertAtPosition(val,pos);
                    break;
                case 3:
                    list.viewList();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }


    }
}