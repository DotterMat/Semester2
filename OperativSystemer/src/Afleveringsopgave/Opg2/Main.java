package Afleveringsopgave.Opg2;

public class Main {

    private static int turn;
    private static boolean[] flag;
    public static void main(String[] args) {

        flag = new boolean[2];
        flag[0] = false;
        flag[1] = false;
        turn = 1;


    Faelles faelles = new Faelles();
    MyThread object = new MyThread("tid",faelles);
    MyThread2 object2 = new MyThread2("tid2",faelles);

      try {
          object.start();
          object2.start();
        object.join();
        object2.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println(faelles.getGlobalCounter());
}

    public static boolean getFlag(int index) {
        return flag[index];
    }

    public static void setFlag(int index, boolean b) {
        flag[index] = b;
    }

    public static int getTurn() {
        return turn;
    }
    public static void setTurn(int setValue) {
        turn = setValue;
    }
}

