package Opg2C;

import java.util.List;

public class Student3 {
    private int studentNo;
    private String name;
    private List<Integer> grades;
    private College3 college;

    public Student3(int studentNo, String name, List<Integer> grades) {
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
