package Opg2;

import java.util.ArrayList;
import java.util.List;

public class College1 {
    private String name;
    private List<Student1> students;

    public College1(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public void removeStudent(Student1 student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < students.size(); i++) {
        List<Integer> grades = students.get(i).getGrades();
            for (int j = 0; j < grades.size(); j++) {
                totalSum += grades.get(j);
                totalCount++;
            }
        }
        return totalSum / totalCount;
    }


    public Student1 findStudent(int studentNo) {
        for (int i = 0; i < students.size() ; i++) {
         Student1 currentstudent = students.get(i);
         if(currentstudent.getStudentNo() == studentNo) {
             return currentstudent;
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
