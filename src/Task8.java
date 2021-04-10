/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 2/24/2021
 *   Time: 10:12 AM
 *   File: Task8.java
 */


import java.sql.SQLOutput;

public class Task8 {
        int size;
        int Front;
        int Rear;
        int [] dequeue;

        public Task8() {
            int size = 0;
            int Front =-1;
            int Rear =-1;
            int [] dequeue = new int[size];
        }

        public void EnqueueFront(int n) {
            if(Front == 0 && Rear ==size-1 || Front==Rear+1 ) {
                System.out.println("full");
            }
            else if(Front == -1 && Rear == -1) {
                Front=Rear=0;
                dequeue[Front] = n;
            }
            else if(Front==0) {
                Front=size-1;
                dequeue[Front] =n;
            }
            else {
                Front--;
                dequeue[Front] =n;
            }
            size++;
        }


        public void enqueueRear(int n) {
            if(Front == 0 &&  Rear == size-1 || Front == Rear+1) {
                System.out.println("Full");
            }
            else if(Front == -1 && Rear ==-1) {
                Front =Rear =0;
                dequeue[Rear] =n;
            }
            else if(Rear == size-1) {
                Rear =0;
                dequeue[Rear] =n;
            }
            else {
                Rear++;
                dequeue[Rear] =n;
            }
        }

        public void dequeueFront() {
            if(Front == -1 && Rear == -1) {
                System.out.println("empty");
            }
            else if(Front == Rear) {
                Front = Rear =-1;
            }
            else if(Front == size-1) {
                Front = 0;
            }
            else {
                Front++;
            }
        }

        public void dequeueRear(){
            if(Front == -1 && Rear == -1){
                System.out.println("empty");
            }
            else if(Front == Rear){
                Front =Rear =-1;
            }
            else if(Rear == 0) {
                Rear = size-1;
            }
            else {
                Rear--;
            }
        }








        public void Display(){
            int i = Front;
            while (i!=Rear) {
                System.out.println(dequeue[i]);
                i=(i+1)%2;
            }











        }



























    }


















