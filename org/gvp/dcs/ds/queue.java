package org.gvp.dcs.ds;

public class queue {

    private int rear,front;
    private int que[];

    public queue(int size)
    {
        rear=front=-1;
        que=new int[size];
    }


public void insert(int value)

{

    
    if (rear==que.length)
    {
        System.out.println("Stack is overflow");
    }
    else
    {
        

        if (rear == -1 && front == -1)
        {
            front = rear = 0;
            que[rear] = value;
        }
        else
        {
            rear++;
            que[rear] = value;
        }
    }
}

public void rem()
{
    if (front == -1)
    {
        System.out.println("Stack is underflow");
    }
    else if (front == rear)
    {
     
        System.out.println("Reamove element:"+que[front]);
        front = rear = -1;
    }
    else
    {
      
        System.out.println("Reamove element:"+que[front]);
        front++;
    }
}

public void display()
{
    if(front==-1&&rear==-1)
    {
        System.out.println("queue is empty:");
    }
    else
    {
    for(int i=front;i<=rear;i++)
    {
        System.out.println(que[i]+" ");
    }
}
}

}
