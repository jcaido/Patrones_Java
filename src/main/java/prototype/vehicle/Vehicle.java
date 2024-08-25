package prototype.vehicle;

public class Vehicle {

    private String brand;
    private String model;
    private String id;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String id) {
        this.brand = brand;
        this.model = model;
        this.id = id;
    }

    public Vehicle(Vehicle vehicle) {
       this.brand = vehicle.getBrand();
       this.model = vehicle.getModel();
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getId() {
        return id;
    }

    public Vehicle setId(String id) {
        this.id = id;
        return this;
    }

    public Vehicle clone() {
        return new Vehicle(this);
    }
}
