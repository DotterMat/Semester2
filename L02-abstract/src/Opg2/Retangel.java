package Opg2;

public class Retangel extends Figur{


    public Retangel(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return getX() * getY();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
