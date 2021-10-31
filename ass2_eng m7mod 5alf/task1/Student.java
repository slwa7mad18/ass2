
package ass2;

public class Student extends Person {
    final String status;

    public Student(String status, String name, String phone_n, String email, address adress) {
        super(name, phone_n, email, adress);
        this.status = status;
    }
    public String toString()
  {
  return "Student "+ name;
  }
    
}
