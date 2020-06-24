Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str=str.toLower();
int count=0;
for(char i:str)
{
	if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
	{
		count++;
	}
	System.out.println(count);
}