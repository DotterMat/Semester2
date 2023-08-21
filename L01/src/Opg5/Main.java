package Opg5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle c1 = new Car("Toyota", "Corolla", 22, 63200, 4);
        Vehicle c2 = new Car("Suzuki", "Kuki", 23, 251500.25, 2);
        Vehicle c3 = new Car("Mercedes", "c9", 3, 25000, 4);

        Vehicle m1 = new Mortorcycle(200, "Harley", "Davidson", 2, 463200.51);
        Vehicle m2 = new Mortorcycle(300, "Donald", "Track", 3, 400);

        Vehicle t1 = new Truck("Pensy", "Octavia", 20, 1300, 2000);


        ArrayList<Car> cars = new ArrayList<>();
        cars.add((Car) c1);
        cars.add((Car) c2);
        cars.add((Car) c3);
        for (Car c : cars) {
            c.displayInfo();
        }
        c1.start();
        c1.stop();
        c1.action();
        System.out.println();
        ArrayList<Mortorcycle> mortorcycles = new ArrayList<>();
        mortorcycles.add((Mortorcycle) m1);
        mortorcycles.add((Mortorcycle) m2);
        for (Mortorcycle m : mortorcycles) {
            m.displayInfo();
        }
        m1.start();
        m1.stop();
        m1.action();
        System.out.println();
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add((Truck) t1);
        for (Truck t : trucks) {
            t.displayInfo();
        }
        t1.start();
        t1.stop();
        t1.action();
    }
}



