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
        return super.toString();
    }
}
