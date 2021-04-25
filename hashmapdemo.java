import java.util.*;
public class HashMapDemo
{
  public static void main(String[] args)
  {
   Scanner scn=new Scanner(System.in);
   HashMap<String, String> map = new HashMap<>();
   map.put("Accord","Honda");
   map.put("Prius","Toyota");
   map.put("Motor","Toyota");
   map.put("Civic","Honda");
   System.out.println("Enter the model of the car");
   String model=scn.next();
  int flag=0;
   //Iterator mapIterator = map.entrySet().iterator();
     for(Map.Entry m:map.entrySet()){ 
      String CarModel=(String)m.getKey();
      if(CarModel.equals(model))
      {
        System.out.println("Oh, you're looking for a "+m.getKey()+"? Our "+m.getValue()+" a selection is right over here...");
        flag=1; 
      }

     } 
   if(flag!=1)
  {
  System.out.println("Oh Sorry , Sir ,that model is Unavailble right , Please check some more one");
  }  
   
  }
}