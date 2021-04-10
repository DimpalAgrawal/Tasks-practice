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
            System.out.println(" ");
            System.out.println("1   Add at first");
            System.out.println("2    add at position");
            System.out.println("3    add at last");
            System.out.println("4    delete at first");
            System.out.println("5    delete at last");
            System.out.println("6    delete at position");
            System.out.println("7    View List");
            System.out.println("8    Reverse");
            System.out.println("9    insert at doubly");
            System.out.println("10    delete  at position doubly");
            System.out.println("11     StackByLinkedList");
            System.out.println("12     Exit");
            System.out.println("Entre your choice");
            int choice = s.nextInt();
            int val,pos;
            switch (choice) {
                case 1:
                    System.out.println("enter the value insert at first");
                    val = s.nextInt();
                    list.InsertAtfirst(val);
                    break;
                case 2:
                    System.out.println("enter the position where you want to enter");
                    pos= s.nextInt();
                    System.out.println("enter the value");
                    val = s.nextInt();
                    list.InsertAtPosition(pos,val);
                    break;
                case 3:
                    System.out.println("enter the value");
                    val = s.nextInt();
                    list.insertAtLast(val);
                     break;
                case 4:
                    list.DeleteAtfirst();
                    break;
                case 5:
                    list.DeleteAtLast();
                    break;
                case 6:
                    System.out.println("enter the position ehere u want to delete the element");
                    pos = s.nextInt();
                    list.DeleteAtPos(pos);
                    break;
                case 7:
                    list.viewList();
                    break;
                case 8:
                    list.Reverse();
                    break;
                case 9:
                    System.out.println("enter the value");
                    int n = s.nextInt();
                    list.InsertAtDoubly(n);
                    break;
                case 10:
                    System.out.println("enter the position");
                    int n1 = s.nextInt();
                    list.DeleteAtPosition(n1);
                    break;

                case 12:
                    flag = false;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }


    }
}