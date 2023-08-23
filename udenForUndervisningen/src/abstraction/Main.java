package abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Du kan ikke initialisere abstrakte klasser;
        Dog dog = new Dog("Wolf", "Medium", 68);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepard", "Big", 150));
        animals.add(new Fish("Goldfish", "Small", 2));
        animals.add(new Fish("Barracude", "Big", 26));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale","large",1000));
        for (Animal a : animals) {
            doAnimalStuff(a);
            if(a instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");


    }
}

