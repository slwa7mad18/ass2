
package ass22;


public class student {
    String name;
    private int studentId;
    private double studentGPA;
    subject sb;
    address ad;

    public student(String name, int studentId, double studentGPA, subject sb, address ad) {
        this.name = name;
        this.studentId = studentId;
        this.studentGPA = studentGPA;
        this.sb = sb;
        this.ad = ad;
    }
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
   public void print ()
   {
   System.out.println("student name is "+name+".... student id is " +studentId+".... student gpa is  "+studentGPA+"  //// student subject is "+sb+" /////  student address is "+ad);
   }

    @Override
    public String toString() {
        return  "name=" + name ;
    }
   
}
