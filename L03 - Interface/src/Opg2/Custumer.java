package Opg2;

public class Custumer implements Comparable<Custumer> {
    private String first_name;
    private String last_name;
    private int age;

    public Custumer(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Custumer o) {
        if (this.last_name.compareTo(o.getLast_name()) == 0) {
            return this.first_name.compareTo(o.getFirst_name());
        } else {
            return this.last_name.compareTo(o.getLast_name());
        }
    }

}

