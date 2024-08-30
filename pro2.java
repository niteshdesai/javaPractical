import java.util.*;

public class pro2
{
	public static void main(String []args)
	{
		if(args.length!=3)
		{
			System.out.println("Eneter Minimum 5 value");
			System.exit(1);
		}
		
		String[] name=new String[3];
		
		for(int i=0;i<3;i++)
		{
			name[i]=args[i];
		}
		
	    Arrays.sort(name);
		
	    System.out.println("After sorted Value:");
		for(int i=0;i<3;i++)
		{
			System.out.println(name[i]);
			
        }
	  
	}
}