package org.gvp.dcs.ds;

public class queue {

    int rear, front;
    int que[];

    public queue(int size) {
        rear = -1;
        front = -1;
        que = new int[size];
    }

    public void insert(int value)

    {
        try {

            if (rear == que.length-1) {
                System.out.println("queue is full");

            } else {
                if (rear == -1 && front == -1) {
                    front = 0;
                    rear = 0;
                    que[rear] = value;
                } else {
                    rear++;
                    ;
                    que[rear] = value;
                }
            }
        } catch (Exception e) {
            System.out.println("queue is full");
        }
    }

    public void rem() {

        try {

            if (front == -1) {
                System.out.println("queue is empty");
            } else if (front == rear) {

                System.out.println("Remove Element:" + que[front]);
                front = -1;
                rear = -1;
            } else {

                System.out.println("Remove Element:" + que[front]);
                front++;
            }
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
    }

    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(que[i] + " ");
            }
        }
    }

}
