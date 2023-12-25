abstract class Car {
    public abstract void drive();

    public abstract void flying();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

abstract class WagnoR extends Car {

    public void drive() { // If you extends the abstract class it is compulsory to define the abstract
                          // method
        System.out.println("I am Driving");

    }
}

class AdvanceWagonR extends WagnoR { // These classes are called conceret class
    
    public void flying() {
        System.out.println("This car is flying...");
    }
}

public class AbstractKeyword {
    // Car car = new Car(); We can't instantiate the abstract class

    public static void main(String[] args) {

        Car car = new AdvanceWagonR();
        car.drive();
        car.playMusic();
        car.flying();
    }
}
