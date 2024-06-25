class Ex1
{
	public static void main(String[] args)
	{
		for(int num=1;num<=5;num++)
		{
			for(int start=1;start<=num;start++)
			{
				if(num%start==0)
				System.out.println(start);
			}
		}
	}
}