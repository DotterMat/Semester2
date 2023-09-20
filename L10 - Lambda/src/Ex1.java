import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        Predicate<Person> filter = person -> person.getAge() == 44;
        Person result = findFirst(persons, filter);
        if (result != null) {
            System.out.println("First person with age 44: " + result.getName());
        }
        Predicate<Person> filter1 = person -> person.getName().charAt(0) == 'S';
        Person result1 = findFirst(persons, filter1);
        System.out.println(result1.getName());

        Predicate<Person> filter2 = person -> person.getName().chars().filter(ch -> ch == 'i').count() > 1;
        Person result2 = findFirst(persons,filter2);
        System.out.println(result2.getName());

        Predicate<Person> filter3 = person -> person.getName().length() == person.getAge();
        Person result3 = findFirst(persons,filter3);
        System.out.println(result3.getName());


    }


    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }
}
