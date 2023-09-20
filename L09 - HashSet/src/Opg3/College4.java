package Opg3;

import Opg2C.Student3;

import java.util.LinkedHashMap;
import java.util.List;

public class College4 {
    private String name;
    private LinkedHashMap<Integer, Student4> students;

    public College4(String name) {
        this.name = name;
        this.students = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student4 student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student4 student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for(Student4 s : students.values()) {
            List<Integer> grades = s.getGrades();
            for (int g : grades) {
                totalSum += grades.size();
                totalCount++;
            }
        }
        return totalSum / totalCount;
    }




    public Student4 findStudent(int studentNo) {
        for (Student4 s : students.values()) {
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
