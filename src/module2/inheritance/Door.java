package module2.inheritance;

/**
 * Door Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Inheritance
 *
 * 1. Create a child from the class Rectangle.
 */
public class Door extends Rectangle {

    private String material;
    private double weight;
    private double price;
    private String manufacturer;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Door(int height, int width, String material, double weight, double price, String manufacturer, String color) {
        super(height, width, color);
        this.material = material;
        this.weight = weight;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
