import java.util.Scanner;
class Pattern10 
{public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,r,m,sum=0,s;
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
         System.out.print("EXample Inputs:");
		n=sc.nextInt();
	   while(n!=0){  //n=123
           r=n%10;
           sum= sum*10+r;   
           n=n/10;
		}//While
		m=sum;
		System.out.print("Transformed String\t:");
		while(m!=0){
         r=m%10;
		 m=m/10;
		 switch(r)
			{
               case 1: System.out.print("  \"One\""); break;
			  case 2: System.out.print("  \"Two\""); break;
			  case 3: System.out.print("  \" Three\""); break;
			  case 4: System.out.print("  \" Four\""); break;
			  case 5: System.out.print("  \" Five\""); break;
			  case 6: System.out.print("  \" Six\""); break;
			  case 7: System.out.print("  \" Seven\""); break;
			  case 8: System.out.print("  \" Eight\""); break;
			  case 9: System.out.println("  \" Nine\""); break;
			}
           }
		   System.out.println();
           System.out.print("Sorted String\t\t:");
		    s=sum;
		   while(s!=0){
           r=s%10;
		    s=s/10;
		 switch(r)
			{
               case 1: System.out.print("  \"Eight\"");a=8; break;
			  case 2: System.out.print("  \"Five\"");b=5; break;
			  case 3: System.out.print("  \" Four\""); c=4;break;
			  case 4: System.out.print("  \" Nine\"");d=9; break;
			  case 5: System.out.print("  \" One\""); e=1;break;
			  case 6: System.out.print("  \" Seven\"");f=7; break;
			  case 7: System.out.print("  \" Six\""); g=6;break;
			  case 8: System.out.print("  \" Three\""); h=3;break;
			  case 9: System.out.println("  \" Two\""); i=2;break;
			}
           }
		   System.out.println();
		System.out.println(" Outputs\t\t:"+a+""+b+""+c+""+d+""+e+""+f+""+g+""+h+""+i);
		
       
	}
}
