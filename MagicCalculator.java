import java.util.*;
class MagicCalculator extends Calculator
{
	public static void Fact(int x)
	{
	    int fact=1;
	    for(int i=1;i<=x;i++)
	    {
	
	    	fact=fact*i;
 
 	    }
	    System.out.println(fact);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	  System.out.println("1. Square");
	  System.out.println("2. Sin");
	  System.out.println("3. Cosine");
	  System.out.println("4. tangent");
	  System.out.println("5. factorial");
	  System.out.println("Enter the choice");
	  int choice=sc.nextInt();
	  
	   switch(choice)
	   {
	   case 1:
		   //System.out.println("Please enter the 2 number");
		   int a = sc.nextInt();
		   int b=sc.nextInt();
		   Calculator.Squares(a,b);
		   break;
	   case 2:
		   System.out.println("Please enter number");
		   int p=sc.nextInt();
		   double b1 = Math.toRadians(p);
		   
	        System.out.println(Math.sin(b1));
		   
		   break;
	   case 3:
		   System.out.println("Please enter the 2 number");
		   int s=sc.nextInt();
		   double b2 = Math.toRadians(s);
		   
	        System.out.println(Math.cos(b2));
		   
		   break;
	   case 4:
		   System.out.println("Please enter the 2 number");
		   int d=sc.nextInt();
		   double b3 = Math.toRadians(d);
		   
	        System.out.println(Math.cos(b3));
		   break;
	   case 5:
		   System.out.println("Please enter the 2 number");
		   int x=sc.nextInt();
		   Fact(x);
		   break;
	   
	   
	   }

	 }
	  
}