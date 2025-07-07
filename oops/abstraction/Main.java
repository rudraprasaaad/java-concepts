package abstraction;

abstract class Appliance {
    abstract void turnOn();

    void showStatus() {
        System.out.println("Appliance is ready...");
    }
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is spinning");
    }
}

public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.showStatus();
    }
}
