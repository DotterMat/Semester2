package Opg2;

import java.util.logging.XMLFormatter;

public class Kvardrat extends Figur{

    public Kvardrat(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return Math.pow(getX(),2);
    }

    @Override
    public String toString() {
        String streg = "-".repeat(30);
        String streg2 = "-".repeat(30);
        System.out.println(streg);
        return super.toString() +  " \nAreal: " + area() + "\n" + streg2;
    }
}
