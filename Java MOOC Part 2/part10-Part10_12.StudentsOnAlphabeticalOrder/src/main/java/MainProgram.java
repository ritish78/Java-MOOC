
import java.util.ArrayList;
import java.util.Collections;



public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("zebra");
        Student second = new Student("apple");
        ArrayList<Student> student= new ArrayList<Student>();
        student.add(first);
        student.add(second);
        Collections.sort(student);
        System.out.println(student);
        
    }
}
