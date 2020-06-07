
public class AdaLovelace {

    public static void main(String[] args) {
        // Write your program here
        //System.out.println("Ada Lovelace");
        Student student = new Student("Kenny", 23, 140);

        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }
}
