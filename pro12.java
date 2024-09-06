import java.util.Scanner;
class stackException extends Exception
{
    public stackException(String o)
    {
        super(o);
    }
    public stackException(String u,String help)
    {
        super(u);
    }
}
class stackDemo {
    int top = -1;
    int arr[];
     stackDemo(int x)
     {
          arr=new int[x];
     }
    public void push(int value) {
        try {
            
            if(top!=arr.length-1)
            {
                top++;
                arr[top] = value;
            }
            else
            {
                throw new stackException("Stack is Overflow");
            }
            
       
        } catch (stackException e) {
           System.out.println(e.getMessage());
        }
    }

    public int pop() {
        int remEle = 0;
       try
       {
        if (top == -1) {
            throw new stackException("Stack is Underflow","help");
        } else {
            remEle = arr[top];
            top--;
        }
    }
    catch(stackException e )
    {
        System.out.println(e.getMessage());
    }

        return remEle;
    }

    public void traverse() {
        for (int i = 0; i < top+1; i++) {
            System.out.print(" " + arr[i]);
        }
        System.err.println();
    }

}

public class pro12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.err.println("Enter Stack Length:");
        int x=obj.nextInt();
        stackDemo st = new stackDemo(x);
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

