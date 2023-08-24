package Opg2;

public class Cirkel extends Figur{

    public Cirkel(double x, double y) {
        super(x, y);
    }


    @Override
    public double area() {
        return 3.14 * Math.pow(getX(),2);
    }

    @Override
    public String toString() {
        String streg = "-".repeat(30);
        return super.toString() + " \nAreal: " + area() + "\n" + streg;
    }
}
