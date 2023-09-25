package Opg1.diets;

import java.sql.SQLOutput;

public class ProteinDiet implements DietBehavior{
    @Override
    public void diet() {
        System.out.println("Eating a protein diet");
    }
}
