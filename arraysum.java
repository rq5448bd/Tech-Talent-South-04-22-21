//1.Write a program to sum all the values of a given Array in Java.

import java.util.*;
public class ArraySum
{
  public static void main(String[] args)
  {
   Scanner scn=new Scanner(System.in);
   int[] arr = new int[20];
   for(int i=0;i<5;i++) 
   {  
     arr[i]=scn.nextInt();
   }
  int sum=0;
  for(int i=0;i<5;i++) 
   {  
     sum+=arr[i];
   }
   System.out.println(sum);
  }
}