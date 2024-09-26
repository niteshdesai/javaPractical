import java.util.Scanner;

class circle {
    private double x, y,r;

    circle(){
        this.x = 0;
        this.y = 0;
        this.r = 0;
    }
    circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() {
        return Math.PI* this.r * this.r;
    }

    public double circumference() {
        return 2 * Math.PI * this.r;
    }

    public double diameter() {
        return 2 * this.r;
    }

    void display() {
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("r:" + r);
    }
}

public class pro6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x value:");
        double x = obj.nextDouble();
        System.out.println("Enter y value:");
        double y = obj.nextDouble();
        System.out.println("Enter radius value:");
        double r = obj.nextDouble();
        circle c = new circle(x,y,r);
        // circle c=new circle();
        while (true) {
            System.out.println("1:Find Area of Circle");
            System.out.println("2:Find circumference of Circle");
            System.out.println("3:Find diameter of Circle");
            System.out.println("4:Display");
            System.out.println("5:exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(c.area());
                    break;
                case 2:
                System.out.println(c.circumference());
                    break;
                case 3:
                System.out.println(c.diameter());
                    break; 
                case 4:
                    c.display();
                    break;
                case 5:System.exit(0);

                default:
                    break;
            }

        }
    }
}
