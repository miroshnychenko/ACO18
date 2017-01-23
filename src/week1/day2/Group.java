package week1.day2;

import week1.day1.Student;

/**
 * Created by serhiim on 22-Jan-17.
 */
public class Group {
    private String name;
    private Student[] students;

    // Method return string all students


    public Group() {
    }

    public Group(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void setStudents(Student[] students) {
        if (students == null) return;
        this.students = students;
    }

    public void groupToString (){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].studentToString());

        }
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
}
