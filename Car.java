class Car
{
 private String name;
 private String brand;
 private String ownername;
 Car(String name, String brand) 
 {
   this.name=name;
   this.brand=brand;
 } 
Car(String name, String brand, String ownername) 
 {
   this.name=name;
   this.brand=brand;
   this.ownername=ownername;
 } 
 
  public String getName() {
    return this.name;
  }

  
  public void setName(String newName) {
    this.name = newName;
  }
 
  public String getBrand() {
    return this.brand;
  }

  
  public void setBrand(String newbrand) {
    this.brand= newbrand;
  }


  public String getownerName() {
    return this.ownername;
  }

  
  public void setOwnerName(String ownerName) {
    this.ownername = ownerName;
  }
public static Boolean M1(String Name)
{
 if(Name.equals("Santa"))
 return true;
else
 return false;
}
 public static String M2(String Name)
{
 String s="Father";
 String s2="Uncle";
 if(Name.equals("Ramu"))
 return s;
else
 return s2;
}
 public static void main(String [] args)
{
 System.out.println(M1("Santa"));
 System.out.println(M2("Ramu"));
}
}