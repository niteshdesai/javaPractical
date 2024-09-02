import java.util.Scanner;

class stackDemo {
    int top = -1;
    int arr[] = new int[5];

    public void push(int value) {
        try {
            
            top++;
            arr[top] = value;
       
        } catch (Exception e) {
           System.out.println("Stack is full");
        }
      


    }

    public int pop() {
        int remEle = 0;
        if (top == -1) {
            System.out.println("stack is empty:");
        } else {
            remEle = arr[top];
            top--;
        }
        return remEle;
    }

    public void traverse() {
        for (int i = 0; i < top; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}

public class pro7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        stackDemo st = new stackDemo();
        while (true) {

            System.out.println("1:push");
            System.out.println("2:pop");
            System.out.println("3:Traverse");
            System.out.println("4:exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter value:");
                    int ele = obj.nextInt();
                    st.push(ele);
                    break;
                case 2:
                    System.out.println("Remove Element From Stack:" + st.pop());
                    break;
                case 3:
                    st.traverse();
                    break;
                case 4:
                    System.exit(1);

                default:
                    break;
            }

        }
    }
}
