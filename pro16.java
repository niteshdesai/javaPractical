import org.gvp.dcs.ds.*;
import org.gvp.dcs.shapes.*;
import java.util.*;
public class pro16 {
    public static void main(String[] args) {

       Scanner sn=new Scanner(System.in);
       int choice,size,value;
        while (true) {
  
        System.out.println("1.stack operations");
        System.out.println("2.Queue operations");
        System.out.println("3.Sphere operations");
        System.out.println("4.Cube operations");

        System.out.println("Enter your choice:");
         choice=sn.nextInt();


         switch (choice) {
            case 1:
                   System.out.println("1.Push");
                   System.out.println("2.Pop");
                   System.out.println("3.Display");
                   choice=sn.nextInt();
                   System.out.println("Enter size of array");
                   size=sn.nextInt();
                   stack s=new stack(size);
                    switch (choice) {
                        case 1:
                             System.out.println("Enter value:");
                             value=sn.nextInt();
                             s.push(size);
                                
                            break;
                    
                        default:
                            break;
                    }
                
                break;
         
            default:
                break;
         }
        }


    }
}
