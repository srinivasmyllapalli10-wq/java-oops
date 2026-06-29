class Students {
    void greet(String name) {
        System.out.println("Hello" + name);
    }
}
public class MethodParameters{
    public static void main(String[]args){
        Students s1 = new Students();
        s1.greet("srinivas");
        s1.greet("sudheeshna");
        s1.greet("likitha");
    }
}
