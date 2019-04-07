
import java.util.*;
class Pattern8{

   static int c,r;
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the No of Row:");
	 int n=sc.nextInt();

	 for(r=1;r<=n;r++)
	 {
         for(c=1;c<=r;c++)
		 {
             if((r+c)%2==0)System.out.print("$ ");
			 else
				 System.out.print("* ");
		 }
			 System.out.println();
	 }



 }

 }