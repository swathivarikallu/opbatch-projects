//cpackage com.sathya.java.exception;
import java.util.*;
public class CountOfFive {

	public static void main(String[] args)
	{
		int count=0;
		for (int i = 0; i <=100; i++) 
		{
			int temp=i;
			while(temp>0)
			{
				int rem=temp%10;
				if(rem==5) 
				{
					count++;
				}
				temp=temp/10;
			}
		}
System.out.println(count);
	}

}
