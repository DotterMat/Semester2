package Opg2;

import java.util.List;

public class Student1 {
    private int studentNo;
    private String name;
    private List<Integer> grades;
    private College1 college1;

    public Student1(int studentNo, String name, List<Integer> grades) {
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
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                ", college=";
    }
}
