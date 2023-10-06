package Opg3;

import Opg2.College1;
import Opg2.Student1;
import Opg2C.College3;
import Opg2C.Student3;

import java.util.ArrayList;
import java.util.List;

public class Test {
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

        College3 college = new College3("Klarrup");
        College3 college1 = new College3("JankuEpu");
        College3 college12 = new College3("Jabutu");
        Student3 Henrik = new Student3(20, "Henrik Downy", henrikGrades);
        Student3 Jan = new Student3(20, "Jan Michaelsen", janGrades);
        Student3 Jakka = new Student3(10, "Jakka", jakkaGrades);

        college.addStudent(Henrik);
        college1.addStudent(Jan);
        college12.addStudent(Jakka);
        System.out.println("Henrik har " + college.calcAverage());
        System.out.println("Jan har " + college1.calcAverage());
        System.out.println("Jakka har " + college12.calcAverage());

        System.out.println("Der er ingen med dette studienummer " + college.findStudent(21));
        System.out.println(college.findStudent(20).getName());
        System.out.println(Jan.equals(Jan));


    }
}




