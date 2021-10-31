
package ass22;

public class Ass22 {

    public static void main(String[] args) {
        address a=new address("27nn","Samalut","Egypt");
        subject s=new subject(1,"software development",3.0);
        student st=new student("salwa",18,2.83,s,a);
        st.print();
    }
    
}
