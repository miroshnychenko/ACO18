package week1.homework.student;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by serhiim on 24-Jan-17.
 */
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("qwe", "ewq", 23);
        Student student2 = new Student("asd", "dsa", 22);
        Student student3 = new Student("zxc", "cxz", 27);
        Student student4 = new Student("rty", "yrt", 25);
        Student[] students = {student1, student2, student3, student4};
        Group group = new Group("Group1", students);

        System.out.println("******************");
        System.out.println("Print all students:");
        System.out.println("******************");
        System.out.println(group.toString());

        System.out.println("******************");
        System.out.println("Search student:");
        System.out.println("******************");
        System.out.println(group.findStudentByName("asd"));
        System.out.println();

        System.out.println("******************");
        System.out.println("Search student that does not exist:");
        System.out.println("******************");
        group.removeStudent(1);
        System.out.println(group.findStudentByName("asd"));
        System.out.println();

        System.out.println("******************");
        System.out.println("Sort Students");
        System.out.println("******************");
        group.sortStudentsByName();
        System.out.println(group.toString());
        System.out.println();

        System.out.println("******************");
        System.out.println("Add student");
        System.out.println("******************");
        Student student5 = new Student("fgh", "hgf", 25);
        group.addStudent(student5);
        System.out.println(group.toString());
        System.out.println();

        System.out.println("******************");
        System.out.println("Sort students Comparable");
        System.out.println("******************");
        group.sortStudentCompareble();
        System.out.println(group.toString());
    }
}
