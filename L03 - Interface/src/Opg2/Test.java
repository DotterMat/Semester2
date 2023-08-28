package Opg2;


import Opg3.Customer;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Custumer c1 = new Custumer("Lise Olderrup", "Nielsen", 35);
        Custumer c2 = new Custumer("Erik", "Monika", 47);
        Custumer c3 = new Custumer("Jens Egedahl", "Sygdahl", 40);
        Custumer c4 = new Custumer("Jybbe", "Ekon", 45);
        Custumer c5 = new Custumer("Jens", "Berggren", 42);

        Custumer[] arr = {c3, c4, c5};
        Custumer biggest = biggestCustomer(arr);
        Custumer[] biggerCustomers = biggerThanCustomer(arr, c1);
        for (Custumer c : biggerCustomers) {
            System.out.println(c.getFirst_name() + " " + c.getLast_name());
        }


        if (biggest != null) {
            System.out.println("Navnet på den største kunder er:  " + biggest.getFirst_name() + " " + biggest.getLast_name());
        } else {
            System.out.println("Ingen kunder i listen");
        }
    }

    public static Custumer biggestCustomer(Custumer[] customers) {
        if (customers.length == 0) {
            return null;
        }
        Custumer biggest = customers[0];
        for (int i = 1; i < customers.length; i++) {
            if (customers[i].compareTo(biggest) > 0) {
                biggest = customers[i];
            }
        }
        return biggest;
    }

    public static Custumer[] biggerThanCustomer(Custumer[] custumers, Custumer custumer) {
        Custumer[] arr = new Custumer[custumers.length];
        int count = 0;
        for (int i = 0; i < custumers.length; i++) {
            if (custumers[i].compareTo(custumer) > 0) {
                arr[count] = custumers[i];
                count++;
            }
        }
        //count = alle kunder der opfylder betingelsen
        Custumer[] result = new Custumer[count];
        for (int i = 0; i < count; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
