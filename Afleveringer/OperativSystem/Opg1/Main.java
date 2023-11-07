package Opg1;

import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Faelles faelles = new Faelles();
        MyThread object = new MyThread("tid", faelles);
        MyThread object2 = new MyThread("tid2", faelles);
        object.start();
        object2.start();

    }
}