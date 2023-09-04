package Opg5;

import java.io.File;
import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        scanDir("/Users/mathiasskrivernordentoft/Documents/GitHub/Semester2/L05 - Rekursive metoder");
    }
    public static void scanDir(String path) {
        File in =  new File(path);
        if(in.isDirectory()) {
            System.out.println(in.getName());
            for (File fil : in.listFiles()) {
                scanDir(fil.getAbsolutePath());
            }
        }
    }
}
