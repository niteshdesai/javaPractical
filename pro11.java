class Exceptionsent extends Exception
{
	public Exceptionsent(String a)
	{
		super(a);
		
	}
}
public class pro11 {
    public static void main(String[] args) {
        
		int number[]=new int[args.length];
        try
        {
        for(int i=0;i<args.length;i++)
        {
            
			number[i]=Integer.parseInt(args[i]);
			if(number[i]<0)
		     {
				 
				 throw new Exceptionsent(number[i]+" Is Negative Number ");
				  
			 }
			 System.out.println(number[i]);
        }
        }
		
		catch(Exceptionsent e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }
}