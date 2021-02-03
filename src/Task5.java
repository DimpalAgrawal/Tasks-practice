/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/27/2021
 *   Time: 11:27 AM
 *   File: Student.java
 */

import java.util.Scanner;

public class Task5 {
    private static String Name;
    private static int RollNo;
    private static String Subject;

    public Task5(String Name, int RollNo, String Subject) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Subject = Subject;
    }

    public Task5() {
        this.Name = "Abc";
        this.RollNo = 2;
        this.Subject = "Java";
    }

    public Task5(int nextInt, String next) {

    }

    public static String getName() {
        return Name;
    }

    public static int getRollNo() {
        return RollNo;
    }

    public static String getSubject() {
        return Subject;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public static void setSubject(String subject) {
        Subject = subject;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Task5 arr[] = new Task5[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new Task5(s.nextInt(),s.next());
        }
    }
}


































