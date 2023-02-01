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

    private static void garageBill(Vehicle... garageVehicles) {
        int totalBill = 0;

        for (Vehicle vehicle : garageVehicles){

            int cost = vehicle.getBill();
            totalBill += cost;
            System.out.println(vehicle.getMake() + " Total cost: £" + cost);


        }
        System.out.println();
        System.out.println("Total Bill: " + totalBill);
    }
}
