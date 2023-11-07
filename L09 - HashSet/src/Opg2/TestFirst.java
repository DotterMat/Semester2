package Opg2;

import java.util.ArrayList;
import java.util.List;

public class TestFirst {
    public static void main(String[] args) {
        List<Integer> janGrades = new ArrayList<>();
        janGrades.add(10);
        janGrades.add(12);
        janGrades.add(7);
        janGrades.add(4);
        List<Integer> henrikGrades = new ArrayList<>();
        henrikGrades.add(10);
        henrikGrades.add(4);
        henrikGrades.add(02);
        henrikGrades.add(00);
        List<Integer> jakkaGrades = new ArrayList<>();
        jakkaGrades.add(7);
        jakkaGrades.add(4);
        jakkaGrades.add(02);
        jakkaGrades.add(10);

        College1 college = new College1("Klarrup");
        College1 college1 = new College1("JankuEpu");
        College1 college12 = new College1("Jabutu");
        Student1 student = new Student1(20, "Henrik Downy", henrikGrades);
        Student1 student1 = new Student1(20, "Jan Michaelsen", janGrades);
        Student1 student2 = new Student1(10, "Jakka", jakkaGrades);

        college.addStudent(student);
        college1.addStudent(student1);
        college12.addStudent(student2);
        System.out.println("Henrik har " + college.calcAverage());
        System.out.println("Jan har " + college1.calcAverage());
        System.out.println("Jakka har " + college12.calcAverage());

        System.out.println("Der er ingen med dette studienummer " + college.findStudent(21));
        System.out.println(college.findStudent(20).getName());
    }
}




