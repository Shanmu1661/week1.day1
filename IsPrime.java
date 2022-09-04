package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
			
			int num=13,count=0;
			for (int i = 2; i <= num-1; i++) 
			{
				if (num%i==0) 
				{
					
					count=count+1;
				}
			}
			if (count>0) 
			{
				System.out.println(num + " is not a prime number");
			}
			else
			{
				System.out.println(num + " is a prime number");
			}
		}

	
	}


