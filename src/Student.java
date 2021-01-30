/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/27/2021
 *   Time: 11:27 AM
 *   File: Student.java
 */

import java.util.Scanner;

public class Student {
    private static String Name;
    private static int RollNo;
    private static String Subject;

    public Student(String Name,int RollNo,String Subject) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Subject = Subject;
    }

    public Student() {
        this.Name = "Abc";
        this.RollNo = 2;
        this.Subject = "Java";
    }

    public Student(int nextInt, String next) {

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
        Student arr[] = new Student[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new Student(s.nextInt(),s.next());
        }
    }
}


































