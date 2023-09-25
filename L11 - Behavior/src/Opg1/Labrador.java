package Opg1;

import Opg1.bark.BarkBehavior;
import Opg1.bark.Growl;
import Opg1.bark.PlayfullBark;
import Opg1.diets.DietBehavior;
import Opg1.diets.NormalDiet;
import Opg1.diets.ProteinDiet;

public class Labrador extends Dog {


   public Labrador()  {
       this.setBarkBehavior(new PlayfullBark());
       this.setDietBehavior(new ProteinDiet());
   }
    @Override
    public void display() {
        System.out.println("I'm a Labrador");
    }
}