import java.util.*;

class Utility {
    public static long factorial(long ele) {
        long fact = 1;
        
        for (int i = 1; i <= ele; i++) {
            fact = fact * i;
        }
   
        return fact;
    }

    public static boolean isPrime(int value) {
        
        for(int i=2;i<value;i++)
        {
            if(value%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }
    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

}

public class pro3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        while (true) {

            System.out.println("1:Factorial");
            System.out.println("2:prime Number");
            System.out.println("3:even Number");
            System.out.println("4:odd number");
            System.out.println("5:Exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element:");
                    long el = obj.nextLong();
                    long factorialValue = Utility.factorial(el);
                    System.out.println("factorial of " + el + " is: " + factorialValue);

                    break;
                case 2:
                    System.out.println("Enter value:");
                    int val = obj.nextInt();
                    boolean b = Utility.isPrime(val);
                    System.out.println(b);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter value:");
                    val = obj.nextInt();
                    b = Utility.isEven(val);
                    System.out.println(b);
                    System.out.println(" ");
                    break;
                case 4:System.out.println("Enter value:");
                       val = obj.nextInt();
                       b = Utility.isOdd(val);
                       System.out.println(b);
                       System.out.println(" ");
                       break;
                case 5:System.exit(1);

                default:
                    break;
            }

        }
    }

}