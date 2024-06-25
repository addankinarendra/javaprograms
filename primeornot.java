class Helloworld
{
	public static void main (String args[])
	{
		int num=2,count=0,start=1;
		while(start<=num/2)
		{
			if(num%start==0)
			{
				count++;
			}start++;
				
		}
		System.out.println(count==1?"prime":"not prime");
	}
}