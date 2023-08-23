package abstraction;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    //når du overwriter fra en abstract klasse, kan du initialisere dine metoder, og kode dem.
    public void move(String speed) {
        if (speed == "slow") {
            System.out.println(getExplicitType() + "walking");
        } else {
            System.out.println(getExplicitType() + "running");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Howling ");
        } else {
            System.out.print("VUUUF ");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }
}

