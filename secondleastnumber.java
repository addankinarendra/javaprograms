import java.util.Scanner;
	class Helloworld
	{	public static void main (String args[])
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int num=s.nextInt();
	 int high=0,ls=0,temp=num;
			for(;num>0;num/=10)
			{
			int rem=num%10;
			if(rem>high)
			{
			high=rem;
			}
			}
			num=temp;
			System.out.println(high);
			for(;num>0;num/=10)
			{
			int rem=num%10;
			
				if(rem<high)
				{
				if(rem>ls)
				ls=rem;
				}
	}
		System.out.println(ls);
		}
			}

		
