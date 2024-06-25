class Helloworld{
	public static void main (String args[]){
	int a=32;
	String m="married",g="male";
	if(m=="married")
	{
		System.out.println("married insurance applicable");
	}
	else if(m=="unmarried" && g=="male" && a>30)
	{
       		System.out.println("unmarried not appicable for insurance");
	}
	else if(m=="unmarried" && g=="female" && a>25)
	{
		System.out.println("unmarried not appicable for insurance");
	}
	}
	}