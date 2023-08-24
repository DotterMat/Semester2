package Opg2;

public abstract class Figur {
    private String navn = getClass().getSimpleName();
    private double x;
    private double y;

    public Figur(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    @Override
    public String toString() {
        return String.format("%s",navn + " " + area());
    }
}








