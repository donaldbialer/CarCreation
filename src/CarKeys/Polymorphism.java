package CarKeys;



class Poly {
    private String keys;

    public Poly(String keys) {
        this.keys = keys;
    }

    public String keys() {
        return "No keys here";
    }

    public String getName() {
        return keys;
    }
}

class OldCar extends Poly {
    public OldCar() {
        super("Slot Key");
    }

    public String keys() {
        return "Turn key to start car";
    }
}

class ElectricCar extends Poly {

    public ElectricCar() {
        super("Electric Car");
    }

    @Override
    public String keys() {
        return "Put key in the slot to start car";
    }
}

class ModernCar extends Poly {

    public ModernCar() {
        super("ModernCar");
    }

    @Override
    public String keys() {
        return "Push button to start car";
    }
}

class TalkCar extends Poly {
    public TalkCar() {
        super("TalkCar");
    }

    @Override
    public String keys() {
        return "Tell the car to start";
    }
}

class ToyCar extends Poly {
    public ToyCar() {
        super("ToyCar");
    }

    // No plot method
}


public class Polymorphism {

    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
             Poly cars = randomCars();
            System.out.println("Key #" + i +
                    " : " + cars.getName() + "\n" +
                    "Key Type: " + cars.keys() + "\n");
        }
    }

    private static Poly randomCars() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new OldCar();
            case 2:
                return new ElectricCar();
            case 3:
                return new ModernCar();
            case 4:
                return new TalkCar();
            case 5:
                return new ToyCar();
        }

        return null;
    }
}
