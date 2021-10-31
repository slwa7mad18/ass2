
package ass2;


public class Staff extends Employee {
    String Title;

    public Staff(String Title, String office, double salary, MyDate date, String name, String phone_n, String email, address adress) {
        super(office, salary, date, name, phone_n, email, adress);
        this.Title = Title;
    }
    public String toString()
  {
  return "Staff "+ name;
  }
}
