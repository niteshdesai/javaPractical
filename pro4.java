import java.util.*;
class Number {
     double value;

    // Constructor to initialize the value
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
   
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    // Method to check if the number is even
    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    // Method to calculate the factorial of the number
    public double getFactorial(long value) {
        long fact = 1;
        
        for (int i = 1; i <= value;i++) {
            fact = fact * i;
        }
   
        return fact;
        
    }
}

public class pro4 {
   
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter element:");
        double el = obj.nextDouble(); 
        Number num = new Number(el);
        while (true) {

            System.out.println("1:isZero");
            System.out.println("2:sPositive");
            System.out.println("3:isNegative");
            System.out.println("4:isOdd");
            System.out.println("5:isEven");
            System.out.println("6:getFactorial");
            System.out.println("7:exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:System.out.println("Is Zero: " + num.isZero());
                    break;
                case 2:System.out.println("Is Positive: " + num.isPositive());
                        break;
                case 3:System.out.println("Is Negative: " + num.isNegative());
                        break;
                case 4: System.out.println("Is Odd: " + num.isOdd());
                        break;
                case 5: System.out.println("Is Even: " + num.isEven());
                        break;
                case 6:  System.out.println("Enter value for factorial:");
                         long fact = obj.nextLong();
                         System.out.println("Factorial: " + num.getFactorial(fact));
                         break;  
                case 7:System.exit(1);

                default:
                    break;
            }

        }
    }
    
}
