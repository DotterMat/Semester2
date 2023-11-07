package Opg3;

import java.util.List;
import java.util.Objects;


public class Student4 implements Comparable<Student4> {


    private int studentNo;
    private String name;
    private List<Integer> grades;
    private College4 college;

    public Student4(int studentNo, String name, List<Integer> grades) {
        this.studentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public int compareTo(Student4 o) {
        return Integer.compare(this.studentNo, o.studentNo);
    }

    public int compare(Student4 s1, Student4 s2) {
        return s1.getName().compareTo(s2.getName());
    }

    @Override
    public int hashCode() {
        return studentNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student4 s)) return false;
        return studentNo == s.studentNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                ", college=";
    }
}
