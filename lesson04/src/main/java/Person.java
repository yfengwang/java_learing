import lombok.Data;
@Data
public class Person {
    private  String name;
    private int age;
    private  String Gender;
  public  String GetPersonName()
  {
      return  this.name;
  }
}

