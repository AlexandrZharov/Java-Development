package module3.lab2.model;

import module3.lab2.Beer;
import module3.lab2.BeerType;

/**
 * BottledBeer class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 */
public class BottledBeer implements Beer {

    String name;
    double bottleVolume;
    String manufacturer;
    BeerType type;
    double alcohol;
    double price;

    public BottledBeer() {
    }

    public BottledBeer(String name, double bottleVolume, String manufacturer, BeerType type, double alcohol, double price) {
        this.name = name;
        this.bottleVolume = bottleVolume;
        this.manufacturer = manufacturer;
        this.type = type;
        this.alcohol = alcohol;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BeerType getType() {
        return type;
    }

    public void setType(BeerType type) {
        this.type = type;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottledBeer{" +
                "name='" + name + '\'' +
                ", bottleVolume=" + bottleVolume + " litre" +
                ", manufacturer='" + manufacturer + '\'' +
                ", type=" + type +
                ", alcohol=" + alcohol + "%" +
                ", price=" + price + " USD" +
                '}';
    }
}
