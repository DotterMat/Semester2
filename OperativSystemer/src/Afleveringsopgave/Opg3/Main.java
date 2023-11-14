package Afleveringsopgave.Opg3;

public class Main {
    public static void main(String[] args) {
        Faelles faelles = new Faelles();
        MyThread object = new MyThread("tid", faelles);
        MyThread2 object2 = new MyThread2("tid2", faelles);
        object.start();
        object2.start();

    }
}