package Opg2B;

import java.util.LinkedHashSet;
import java.util.List;

public class College2 {
    private String name;
    private LinkedHashSet<Student2> students;

    public College2(String name) {
        this.name = name;
        this.students = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student2 student) {
        students.add(student);
    }

    public void removeStudent(Student2 student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for(Student2 student : students) {
            List<Integer> grades = student.getGrades();
            for (int j = 0; j < grades.size(); j++) {
                totalSum += grades.get(j);
                totalCount++;
            }
        }
        return totalSum / totalCount;
    }


    public Student2 findStudent(int studentNo) {
        for(Student2 student : students) {
         if(student.getStudentNo() == studentNo) {
             return student;
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
