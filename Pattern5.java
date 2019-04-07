 import java.util.Scanner;
class Pattern5{
	  static int c,r,a=1,ch='A';
	public static void main(String args[]){
		System.out.println("Enter the Row:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(r=1;r<=n;r++)
		{
           for(c=1;c<=r;c++)
			{
                if(r%2==1)System.out.print(" "+a);
				else
					System.out.printf(" %c",ch);
			}
			if(r%2==0)
			{
				ch++;
			}
			else a++;
			System.out.println();
	
			
		}


	}

}