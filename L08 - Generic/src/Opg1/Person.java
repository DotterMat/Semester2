package Opg1;

public class Person<t extends Comparable<t>> implements Comparable<Person<t>> {
    private t name;

    public Person(t name ) {
        this.name = name;
    }
    @Override
    public int compareTo(Person<t> o) {
        return this.name.compareTo(o.name);
    }


    @Override
    public String toString() {
        if(name instanceof FullName) {
            return ((FullName) name).toString();
        }
        return name.toString();
    }
}
