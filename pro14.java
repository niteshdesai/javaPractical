import java.io.*;

class pro14
{
    public static void main(String[] args) {
        
        try {

            FileInputStream fi=new FileInputStream(args[0]);
            FileOutputStream fo=new FileOutputStream(args[1]);

            int c=fi.read();

            while(c!=-1)
            {
                fo.write(c);
                c=fi.read();
            }

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
       

    }
}