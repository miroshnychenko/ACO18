package week1.homework.student;

/**
 * Created by serhiim on 23-Jan-17.
 */
public class Student {

    private String name;
    private String surname;
    private int age;
    private double averageMark;


    public Student (){

    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public String studentToString() {
        return String.format("Student name - %s, student surname - %s, age - %d", name, surname, age);
    }



}
