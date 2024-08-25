package prototype.vehicle;

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("RENAULT", "CLIO", "2418BLF");

        Vehicle myCar = vehicle.clone();
        Vehicle myWifeCar = vehicle.clone();
        Vehicle mySonCar = vehicle.clone();

        System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + " " + vehicle.getId());
        System.out.println(myCar.getBrand() + " " + myCar.getModel() + " " + vehicle.getId());
        System.out.println(myWifeCar.getBrand() + " " + myWifeCar.getModel() + " " + vehicle.getId());
        System.out.println(mySonCar.getBrand() + " " + mySonCar.getModel() + " " + vehicle.getId());
    }
}
