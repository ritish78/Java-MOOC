package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name==null || name.length()==0 || name.length()>40){
            throw new IllegalArgumentException("Name should be less than 40 characters");
        }else{
            this.name = name;
        }
        
        if (age<0 || age>120){
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
