package Opg1;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
    private T name;
    private T age;

    public Person(T name) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person<T> o) {
        return this.name.compareTo(o.name);
    }


    public T getAge() {
        return age;
    }

    @Override
    public String toString() {
        if(name instanceof FullName ) {
            return ((FullName) name).toString();
        }
        return name.toString();
    }
}
