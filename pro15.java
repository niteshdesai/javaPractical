import java.io.*;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class pro15 {

    public static void main(String[] args) {
        
        try {
               
                 
                
                 BufferedReader fi=new BufferedReader(new FileReader("demo.txt"));

                 String data=fi.readLine();
                 System.out.println("  Roll No"+"     "+"Name"+"     "+"Sub1"+"  "+"Sub2"+"  "+"Sub3"+"  "+"Percentage");
                 System.out.println("");
                 while (data !=null ) 
                 {

                    String info[]=data.split("\t");
                    
                    int sum=Integer.parseInt(info[2])+Integer.parseInt(info[3])+Integer.parseInt(info[4]);

                    Double total=sum/3.0;

                    System.out.println(info[0]+"  "+info[1]+"    "+info[2]+"    "+info[3]+"    "+info[4]+"    "+total);
                     data=fi.readLine();
                    
                 }

        } catch (Exception e) {
            // TODO: handle exception
        }

     }
}