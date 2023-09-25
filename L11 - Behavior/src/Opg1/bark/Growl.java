package Opg1.bark;

public class Growl implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Growl! Growl! ");
    }
}
