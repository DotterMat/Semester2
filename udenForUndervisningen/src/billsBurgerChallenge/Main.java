package billsBurgerChallenge;

public class Main {
    public static void main(String[] args) {
     /*   Item coke = new Item("Drink","Coke",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping","Avocado",1.50);
        avocado.printItem();


        Burger burger = new Burger("regular",4.00);
        burger.addToppings("BACON","CHEESE","MAYO");
        burger.printItem();


      MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
        regularMeal.setDrinkSIze("LARGE");
        regularMeal.printItemizedList();
*/
        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSIze("SMALL");
        secondMeal.printItemizedList();
    }

}
