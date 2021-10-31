
package ass22;

public class subject {
    private int subjectId;
    private String subjectName;
    private double subjectHours;

    public subject(int subjectId, String subjectName, double subjectHours) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(double subjectHours) {
        this.subjectHours = subjectHours;
    }

    @Override
    public String toString() {
        return  "{ subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectHours=" + subjectHours + '}';
    }

   
    

}
