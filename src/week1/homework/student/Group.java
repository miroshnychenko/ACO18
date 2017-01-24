package week1.homework.student;

/**
 * Created by serhiim on 23-Jan-17.
 */

public class Group {
    private String name;
    private Student[] students;

    public Group() {
    }

    public Group(String name, Student[] students) {
        if (name == null || name.isEmpty()) return;
        if (students == null) return;
        this.name = name;
        this.students = students;
    }

    public void setStudents(Student[] students) {
        if (students == null) return;
        this.students = students;
    }


    public String groupToString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                continue;
            }
            builder.append(students[i].studentToString());
            builder.append("\n");
        }
        return builder.toString();
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (student == null){
            return;
        }
        Student[] temp = new Student[students.length+1];
        System.arraycopy(students, 0, temp,0, students.length);
        temp[temp.length-1] = student;
        students = temp;

    }

    public void removeStudent(int studentNumber) {
        if (studentNumber < 0 && studentNumber> students.length-1){
            return;
        }
        Student[] temp = new Student[students.length-1];
        System.arraycopy(students, studentNumber+1, temp, 0, temp.length-studentNumber);
        System.arraycopy(students, 0, temp, temp.length-studentNumber, studentNumber);
        students = temp;
    }

    public String findStudentByName(String studName) {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equals(studName)) {
                return students[i].studentToString();
            }
        }
        return "No such Student";
    }

    public void sortStudentsByName() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < students.length -1; i++) {
                if (students[i].getName().codePointAt(0) > students[i + 1].getName().codePointAt(0)) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}