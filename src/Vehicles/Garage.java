package Vehicles;

public class Garage {
    public static void main(String[] args){

//        cars
        Car ford = new Car("Ford","Mustang","Black",0,3,false);
//        System.out.println(ford);

        Car ferrari = new Car("Ferrari","488 GTB","Yellow",0,3,false);
//        System.out.println(ferrari);

        Car vauxhall = new Car("Vauxhall","Astra","Red",0,5,false);
//        System.out.println(vauxhall);

//        bikes
        Bike ducati = new Bike("Ducati", "60", "Red", 0, 0,true );
//        System.out.println(ducati);

        Bike ducati2 = new Bike("Ducati", "1198S", "Black", 0, 0,false );
//        System.out.println(ducati2);

        Bike ducati3 = new Bike("Ducati", "Berliner Apollo", "Blue", 0, 0,false );
//        System.out.println(ducati3);

        Plane cessna = new Plane("Cessna", "Skyjawk 172", "White", 0,2,false);
//        System.out.println(cessna);


        garageBill(ford, ferrari, vauxhall, ducati, ducati2, ducati3, cessna);


    }

    private static void garageBill(Car ford, Car ferrari, Car vauxhall, Bike ducati, Bike ducati2, Bike ducati3, Plane cessna) {
        Vehicle[] garageVehicles = {ford, ferrari, vauxhall, ducati, ducati2, ducati3, cessna};
        for (Object vehicle : garageVehicles){
            int totalCost = 0;

            if (vehicle instanceof Car){
                totalCost += 250;
            } else if (vehicle instanceof Bike){
                totalCost += 150;
                if (((Bike) vehicle).getHasSideCar()){
                    totalCost += 400;
                }
            } else if (vehicle instanceof  Plane){
                totalCost += 1000;
                if (((Plane) vehicle).getHasWings() == false){
                    totalCost += 10000;
                }
            }
            System.out.println(((Vehicle) vehicle).getMake() + " Total cost: £" + totalCost);
        }
    }
}
