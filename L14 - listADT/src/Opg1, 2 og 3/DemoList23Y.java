package Opg1;

import java.util.Iterator;

public class DemoList23Y {

    public static void main(String[] args) {
        Opg1.City paris = new Opg1.City("Paris", 12_000_000);
        Opg1.City rom = new Opg1.City("Rom", 9_000_000);
        Opg1.City london = new Opg1.City("London", 9_000_000);
        Opg1.City amsterdam = new Opg1.City("Amsterdam", 7_000_000);
        Opg1.City oslo = new Opg1.City("Oslo", 1_200_000);

       // ArrayList23Y<City> list = new ArrayList23Y<>();

//        SingleLinkedList23Y<City> list = new SingleLinkedList23Y<>();
       Opg1.DoubleLinkedList23Y<Opg1.City> list = new Opg1.DoubleLinkedList23Y<>();
        list.add(0,paris);
        System.out.println(list);
        list.add(1,amsterdam);
        System.out.println(list);
        list.add(2,london);
        list.add(rom);
        list.add(oslo);

        System.out.println(list);

        System.out.println("Size: " + list.size());
        System.out.println();

        list.remove(rom);
        list.remove(0);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();

        //---------------------------------------------------------------------

        System.out.println("Print list with iterator:");
        Iterator<Opg1.City> it = list.iterator();
        while (it.hasNext()) {
            Opg1.City city = it.next();
            System.out.println(city);
        }
        System.out.println();

        System.out.println("Print list with for-each:");
        for (Opg1.City city : list) {
            System.out.println(city);
        }
    }
}
