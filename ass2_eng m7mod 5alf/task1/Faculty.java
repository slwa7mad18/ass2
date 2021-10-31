
package ass2;

public class Faculty extends Employee {
    double workHour;
    String rank;

    public Faculty(double workHour, String rank, String office, double salary, MyDate date, String name, String phone_n, String email, address adress) {
        super(office, salary, date, name, phone_n, email, adress);
        this.workHour = workHour;
        this.rank = rank;
    }
    
    public String toString()
  {
  return "Faculty "+ name;
  }
}
