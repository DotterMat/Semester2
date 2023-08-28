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
        int last_name_comparation = this.last_name.compareTo(o.getLast_name());
        if (last_name_comparation != 0) {
            return last_name_comparation;
        }
        //hvis efternavnene er ens, sammenlignes fornavnene.
        int first_name_comparation = this.first_name.compareTo(o.getFirst_name());
        if (first_name_comparation != 0) {
            return first_name_comparation;
        }
        //hvis både efternavnene og fornavnene er ens, sammenlignes alderen.
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return super.toString() + getLast_name() + " " + getLast_name() + " " + getLast_name();
    }
}

