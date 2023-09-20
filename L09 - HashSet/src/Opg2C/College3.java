package Opg2C;

import java.util.*;

public class College3 {
    private String name;
    private Map<Integer, Student3> students = new LinkedHashMap<Integer, Student3>();

    public College3(String name) {
        this.name = name;
        this.students = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student3 student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student3 student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for(Student3 s : students.values()) {
            List<Integer> grades = s.getGrades();
            for (int g : grades) {
                totalSum += grades.size();
                totalCount++;
            }
        }
        return totalSum / totalCount;
    }


    public Student3 findStudent(int studentNo) {
        for (Student3 s : students.values()) {
            if (s.getStudentNo() == studentNo) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
