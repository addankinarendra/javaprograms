	class Helloworld
	{
		public static void main (String args[])
		{
		    int rev=0,temp=0,rem=0;
		for(int num=1;num<=100;num++)
		{
		    temp=num;
		    rev=0;
		  for(int i=num;i>0;i/=10)
		  {
		      rem=i%10;
		      rev=rev*10+rem;
		  }
		    	if(temp==rev)
			{
		       System.out.println(temp);
			}
		}
	}
		}
				

