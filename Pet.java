
class Pet
{
 private String name;
 private int age;
 private String location;
 private String type;
 Pet()
 {
 }
 Pet(String name, int age, String location, String type)
 {
 this.name=name;
 this.age=age;
 this.location=location;
 this.type=type;
 }
  public String getName() {
    return this.name;
  }

  
  public void setName(String newName) {
    this.name = newName;
  }

 public int getAge() {
    return this.age;
  }

  
  public void setAge(int Age) {
    this.age= Age;
  }
 public String getType() {
    return this.type;
  }

  
  public void setType(String Type) {
    this.type= Type;
  }
 public static void main(String[] args)
  {

  }

}