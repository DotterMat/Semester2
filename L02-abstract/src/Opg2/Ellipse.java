package Opg2;

import java.time.Year;

public class Ellipse extends Figur {


    public Ellipse(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 3.14 * getX() * getY();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
