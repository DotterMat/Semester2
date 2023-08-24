package Opg2;

public class Ellipse extends Figur {

    double littleAxe;
    double bigAxe;
    public Ellipse(double x, double y, double littleAxe, double bigAxe) {
        super(x,y);
        this.bigAxe = bigAxe;
        this.littleAxe = littleAxe;
    }


    public double area() {
        return 3.14 * littleAxe * bigAxe;
    }


    @Override
    public String toString() {
        String streg = "-".repeat(30);
        String streg2 = "-".repeat(30);
        System.out.println(streg);
        return super.toString() + " \nAreal: " + area() + " \nStorakse: " + bigAxe + " \nLilleakse: "+ littleAxe;
    }

}
