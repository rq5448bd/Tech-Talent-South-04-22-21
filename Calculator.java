import java.util.*;
class Calculator
{
	public static void Add(int a, int b)
	{
	 System.out.println(a+b);
	}
	
	public static void Sub(int a, int b)
	{
	 System.out.println(a-b);
	}
	
	public static void Mul(int a, int b)
	{
	 System.out.println(a*b);
	}

	public static void Div(int a, int b)
	{
	 System.out.println(a/b);
	}
	public static void Squares(int a, int b)
	{
	 System.out.println(Math.pow(a, b));
	}

	
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
 
  System.out.println("1. Add");
  System.out.println("2. Sub");
  System.out.println("3. Mul");
  System.out.println("4. Divide");
  System.out.println("5. Square");
  System.out.println("Enter the choice");
   int choice=sc.nextInt();
   switch(choice)
   {
   case 1:
	   System.out.println("Please enter the 2 number");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   Add(a,b);
	   break;
   case 2:
	   System.out.println("Please enter the 2 number");
	   int p=sc.nextInt();
	   int q=sc.nextInt();
	   Sub(p,q);
	   break;
   case 3:
	   System.out.println("Please enter the 2 number");
	   int s=sc.nextInt();
	   int t=sc.nextInt();
	   Mul(s,t);
	   break;
   case 4:
	   System.out.println("Please enter the 2 number");
	   int d=sc.nextInt();
	   int e=sc.nextInt();
	   Div(d,e);
	   break;
   case 5:
	   System.out.println("Please enter the 2 number");
	   int x=sc.nextInt();
	   int o=sc.nextInt();
	   Squares(x,o);
	   break;
   
   
   }

 }

}