package Opg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyTimeTest {
    public static void main(String[] args) {
        MyTime tiden = new MyTime();

        tiden.increase();
        tiden.increase();

        System.out.println(tiden.getTime());

        String filename = "/Users/mathiasskrivernordentoft/Documents/GitHub/Semester2/L18 - Serilaization/src/MyTimeTest";
        try (FileInputStream f_in = new FileInputStream(filename);
             ObjectInputStream obj_in = new ObjectInputStream(f_in)
        ) {
            Object obj = obj_in.readObject();
            tiden = (MyTime) obj;

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing object");
            System.out.println(ex);
            return;
        }
        System.out.println("Person er hentet: " + tiden);

    }
}
