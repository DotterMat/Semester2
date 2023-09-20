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
        if (this.lastName.compareTo(o.lastName) != 0) {
            return this.lastName.compareTo(o.lastName);
        } else {
            return this.firstName.compareTo(o.firstName);
        }
    }
    @Override
    public String toString() {
        return getName();
    }
}
