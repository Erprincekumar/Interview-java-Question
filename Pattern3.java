import java.util.Scanner;
class Pattern3
{
    static int r,c,a=1,ch='A';
     public static void main(String argd[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Row no:");
		 int n=sc.nextInt();

		 for(r=1;r<=n;r++)
		 {
            for(c=1;c<=r;c++)
			 {
                if(c==1||c==r||r==n)
				 {
				System.out.printf("  %c",ch++);
				  if(ch=='Z') ch='A';
				 }
				else
				System.out.print("  "+a++);
		 }
		 System.out.println();
		 }
}

 }