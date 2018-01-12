package CarFeatures;

public class BMW extends Car  {

    private String stick;
    private int doors;
    private int odometer;
    private String SteeringWheel;
    private String Convertable;

    public BMW(int speed, String steering, String gears) {
        super(44, steering, gears);
        this.stick = stick;
        this.doors = doors;
        this.odometer = odometer;
        this.SteeringWheel = SteeringWheel;
        this.Convertable = Convertable;
    }

    private void shift() {
        System.out.println("car.shift() called");
    }


    public void gears() {
        System.out.println("car.gears() called");
        shift();
        super.speed(getSpeed());
    }

}
