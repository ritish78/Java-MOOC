
public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees();
        Person h = new Person("Pekka", Education.PHD);
        t.add(h);
        t.print();
        

    }
}
