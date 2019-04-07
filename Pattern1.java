import java.util.Scanner;
class Pattern1{


    static int n,r,c,a=1,ch='A';
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter how many row:");
	   n=sc.nextInt();
	   for(r=1;r<=n;r++)
	  {
		   for(c=1;c<=r;c++)
		  {
			   if(c==1||r==1||r==c)
			   System.out.printf(" %c"+ch++);
			   else
				   System.out.print(" \t"+a++);
          }
		  System.out.println();
	  }
}

}