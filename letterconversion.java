class Helloworld{
    public static void main(String args[]){
	char ch='Z';
	if(ch>='A' && ch<='Z')
	{
	int z=(int)ch;
	int c=z+32;
	char re=(char)c;
	System.out.println(re);
	}
	else if(ch>='a' && ch<='z')
	{
	int z=(int)ch;
	int c=z-32;
	char re=(char)c;
	System.out.println(re);
	}
	}
}