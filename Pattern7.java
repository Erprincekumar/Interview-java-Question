import java.util.Scanner;
class Pattern7{

	static  int  r,c;
	public static void main(String args[]){
     
	  Scanner sc=new Scanner(System.in);

	  System.out.println("Enter  the no of row:");
	  int n=sc.nextInt();

	   for(r=1;r<=n;r++)
		{
          for(c=1;c<=r;c++)
			{
              System.out.printf("%c ",r+64);
			}
			System.out.println();
		}


	}

}