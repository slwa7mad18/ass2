
package ass2;
import java.util.*;
public class Employee extends Person {
    String office;
    double salary;
    MyDate date;

    public Employee(String office, double salary, MyDate date, String name, String phone_n, String email, address adress) {
        super(name, phone_n, email, adress);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }
    public String toString()
  {
  return "Employee "+ name;
  }
    
}
