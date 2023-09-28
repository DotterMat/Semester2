package Opg2.comparator;

import Opg2.Customer;

public class NumberComparator implements CustomerCumparator {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getNumber() - o2.getNumber();
    }
}




