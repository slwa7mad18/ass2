
package ass2;

public class Ass2 {

  
    public static void main(String[] args) {
   address ad1 =new address("samalut","minia","egypt");
   Person p1=new Person("salwa","011","soly",ad1);
   System.out.println(p1.toString());
   
   address ad2 =new address("mallawi","minia","egypt");
   Student s=new Student ("junoir","m7mod","010","m",ad2);
   System.out.println(s.toString());

   address ad3 =new address("banimazar","minia","egypt");
   MyDate datee=new MyDate(1999,11,18);
   Employee e=new Employee ("ss",5000.0,datee,"m","012","dd",ad3);
   System.out.println(e.toString());
   
   
   address ad4 =new address("matai","minia","egypt");
   MyDate datee2=new MyDate(1998,4,5);
   Faculty f=new Faculty (1105,"mm","ss",5000.0,datee2,"mona","012","dd",ad4);
   System.out.println(f.toString());
   
   address ad5 =new address("matai","minia","egypt");
   MyDate datee3=new MyDate(1998,6,7);
   Staff st=new Staff ("ass2","ss",5000.0,datee3,"5o5a","012","dd",ad5);
   System.out.println(st.toString());
    }
    
}
