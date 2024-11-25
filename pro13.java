class oddThread extends Thread
{
    public void run()
    {
          try {
               
            for(int i=1;i<=100;i+=2)
            {
                System.out.println("odd Number:"+i);
                sleep(500);
            }
            

          } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
          }
    }

}

 class PrimeThread implements Runnable
 {
    public void run()
    {
        int i,j;

        try {
            
      
        for(i=1;i<=100;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                Thread.sleep(1000);
                System.out.println("prime number:"+i);
                
            }
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
            e.printStackTrace();
    }
     
    }
    
}
public class pro13 {
    public static void main(String[] args) {
        
        oddThread od=new oddThread();
        PrimeThread pr=new PrimeThread();
        Thread prt=new Thread(pr);

        od.start();
        prt.start();
    }
}
