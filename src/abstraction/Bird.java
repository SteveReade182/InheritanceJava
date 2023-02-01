package abstraction;

import java.sql.SQLOutput;

public class Bird implements Flyable {


    @Override
    public void fly() {
        System.out.println("I can Fly!!! It's a Bird!!!");
    }

}
