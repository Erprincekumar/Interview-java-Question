class Pattern2 
{
	static  int r,c,ch='A';
	public static void main(String[] args) 
	{
     java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("ENter the No of Row:");
	 int n=sc.nextInt();
	
	 for(r=1;r<=n;r++)
		{
         for(c=1;c<=r;c++)
			{
               System.out.printf("%c ",ch++);
			   if(ch=='Z') ch='A';
			}
			


		System.out.println();
		}
	}
}
