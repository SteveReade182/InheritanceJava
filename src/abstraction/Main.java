package abstraction;

import Vehicles.Plane;

public class Main {
    public static void main(String[] args) {

        Flyable[] flyableThings = {new Plane(true), new Bird()};

        for (Flyable f:flyableThings){
            f.fly();
        }

    }
}