class Helloworld{
	public static void main (String args[]){
	int num=6,start=1,count=0;
		while(start<num)
		{
			if(num%start==0)
		
		{
			System.out.println(start);
		        count++;
		}
			start++;
		}
			System.out.println("no of factors of "+ num + "are" +count);
			if(count==2)
			System.out.println("prime number");
			else
		{
			System.out.println("not prime");
		}
		}
		}

