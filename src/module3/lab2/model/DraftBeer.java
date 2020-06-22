package module3.lab2.model;

import module3.lab2.Beer;
import module3.lab2.BeerType;

/**
 * DraftBeer class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 */
public class DraftBeer implements Beer {

    String name;
    double volume;
    String manufacturer;
    BeerType type;
    double alcohol;
    double pricePerLitre;

    public DraftBeer() {
    }

    public DraftBeer(String name, double volume, String manufacturer, BeerType type, double alcohol, double pricePerLitre) {
        this.name = name;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.type = type;
        this.alcohol = alcohol;
        this.pricePerLitre = pricePerLitre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    @Override
    public String toString() {
        return "DraftBeer{" +
                "name='" + name + '\'' +
                ", volume=" + volume + " litre" +
                ", manufacturer='" + manufacturer + '\'' +
                ", type=" + type +
                ", alcohol=" + alcohol + "%" +
                ", pricePerLitre=" + pricePerLitre + " USD" +
                '}';
    }

    @Override
    public double getPrice() {
        return this.volume * this.pricePerLitre;
    }
}
