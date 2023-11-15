package Opg2;

import java.io.*;

public class MyTimeTest {
    public static void main(String[] args) {
        MyTime tiden = new MyTime();

        tiden.increase();
        tiden.increase();

        tiden.saveTime();
        System.out.println(tiden.getTime());

        String filename = "/Users/mathiasskrivernordentoft/Documents/GitHub/Semester2/L18 - Serilaization/src/Opg2/MyTime.ser";
        try(FileOutputStream f_out = new FileOutputStream(filename);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {
            obj_out.writeObject(tiden);
            System.out.println("Tiden er gemt:" + " " + tiden.getTime());
        } catch (IOException ex) {
            System.out.println("Error serializing object");
            System.out.println(ex);
        }

        String filename1 = "/Users/mathiasskrivernordentoft/Documents/GitHub/Semester2/L18 - Serilaization/src/Opg2/MyTime.ser";
        try (FileInputStream f_in = new FileInputStream(filename1);
             ObjectInputStream obj_in = new ObjectInputStream(f_in)
        ) {
            Object obj = obj_in.readObject();
            tiden = (MyTime) obj;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing object");
            System.out.println(ex);
            return;
        }

        System.out.println("Tiden er hentet:" + " " + tiden.getTime());
    }
}






