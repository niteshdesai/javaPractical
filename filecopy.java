import java.io.*;
public class filecopy {
    public static void main(String[] args) {
  
        try {

            FileInputStream fi=new FileInputStream(args[0]);
     
            FileOutputStream fo=new FileOutputStream(args[1]);

            int data=fi.read();

           
            while(data!=-1)
            {
                fo.write(data);
              
                data=fi.read();
            }

            fi.close();
            fo.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        



    }
   

}
