package main.java.com.dhana.veera.beans;

public class Student {
    static int studentId;
    String studentName;

    static {
        studentId=12;
        System.out.println(studentId);
    }
    public Student(int studentId, String studentName) {

        this.studentId = studentId;
        this.studentName = studentName;
        System.out.println(studentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentName != null ? studentName.equals(student.studentName) : student.studentName == null;
    }

    @Override
    public int hashCode() {
        return studentName != null ? studentName.hashCode() : 0;
    }
}
