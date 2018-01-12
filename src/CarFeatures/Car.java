package CarFeatures;

/*
 Start with a Car class as base class.
 Finally, create another class, a specific type of Car that inherits
 from the Car class. You should be able to hand steering, changing gears,
 and moving (speed in other words).You will want to decide where to
 put the appropriate state and behaviors (fields and methods).As mentioned
 above, changing gears, increasing/decreasing speed should be included.
 For you specific type of vehicle you will want to add something
 specific for that type of car.
 */

public class Car {

        private int speed;
        private String steering;
        private String gears;
        //private String stop;


        public Car(int speed, String steering, String gears) {
            this.speed = speed;
            this.steering = steering;
            this.gears = gears;
            //this.stop = stop;

        }

        public void travel() {
            System.out.println("Car.travel() road");
        }

        public void travel(int miles) {
            System.out.println("Car.distance() called.  Car is going to drive " + miles + "miles");
        }

        public int getSpeed() {
        return speed;
    }

        public String getSteering() {
            return steering;
        }

        public String getGears() {
            return gears;
        }



}