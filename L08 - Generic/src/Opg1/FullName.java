package Opg1;

public class FullName implements NameComparable<FullName>{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(FullName o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
