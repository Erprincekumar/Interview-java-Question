import java.util.Scanner;
class Pattern77{

	static  int  r,c;
	public static void main(String args[]){
     
	  Scanner sc=new Scanner(System.in);

	  System.out.println("Enter  the no of row:");
	  int n=sc.nextInt();

	   for(r=1;r<=n;r++)
		{
          for(c=1;c<=r;c++)
			{
              System.out.print(" "+r);
			}
			System.out.println();
		}


	}

}