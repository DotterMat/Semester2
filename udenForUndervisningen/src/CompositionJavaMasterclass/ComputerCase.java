package CompositionJavaMasterclass;

public class ComputerCase extends Product{
    private String PSU;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String PSU) {
        super(model, manufacturer);
        this.PSU = PSU;
    }
    public void pressPowerButtom() {
        System.out.println("Power button pressed");
    }
}
