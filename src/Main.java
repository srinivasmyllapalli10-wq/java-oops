class Student {
     int id;
     String name;
}

 public class Main {
    public static void main(String[]args){

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "ravi";

        System.out.println(s1.id);

        System.out.println(s1.name);
    }
 }