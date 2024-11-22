package org.gvp.dcs.ds;
public class stack {

      private int top;
      private int arr[];

    public stack(int size)
    {
        top=-1;
        arr=new int[size];
    }

    public void push(int value) {
        try {
            
            top++;
            arr[top] = value;
       
        } catch (Exception e) {
           System.out.println("Stack is full");
        }
      


    }

    public void pop() {
        int remEle = 0;
        if (top == -1) {
            System.out.println("stack is empty:");
        } else {
            System.out.println("Remove Element:"+arr[top]);
            top--;
        }
        
    }

    public void traverse() {
        for (int i = 0; i < top; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}

