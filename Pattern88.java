
import java.util.*;
class Pattern88{

   static int c,r,ch='A',a=1;

 public static void main(String args[])
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the No of Row:");
	 int n=sc.nextInt();

	 for(r=1;r<=n;r++)
	 {
         for(c=1;c<=r;c++)
		 {
             if((r+c)%2==0)System.out.printf("  %c",ch++);
			 else
				 System.out.print("  "+a++);
		 }
			 System.out.println();
			 if(c>r) ch='A';
	 }



 }

 }