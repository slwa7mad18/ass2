
package ass2;


public class Person {
  String name,phone_n,email;
  address adress;
  
    public Person(String name, String phone_n, String email, address adress) {
        this.name = name;
        this.phone_n = phone_n;
        this.email = email;
        this.adress = adress;
    }
  public String toString()
  {
  return "Person "+ name;
  }
}
