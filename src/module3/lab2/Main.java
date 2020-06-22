package module3.lab2;

import module3.lab2.model.BottledBeer;
import module3.lab2.model.DraftBeer;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * LaboratoryWork2 Main class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example. A point for each one.
 *
 * Creative approaches are welcome.
 *
 * Variant 3: Beer draft  and  bottled.
 */
public class Main {
    public static void main(String[] args) {

        DraftBeer draftBeer1 = new DraftBeer("DraftBeer1", 5, "M1", BeerType.LIGHT, 12, 10);
        DraftBeer draftBeer2 = new DraftBeer("DraftBeer2", 7, "M2", BeerType.DARK, 10, 8);
        DraftBeer draftBeer3 = new DraftBeer("DraftBeer3", 2, "M3", BeerType.DARK_LIGHT, 19, 17);
        DraftBeer draftBeer4 = new DraftBeer("DraftBeer4", 12, "M4", BeerType.DARK, 0, 5);
        DraftBeer draftBeer5 = new DraftBeer("DraftBeer5", 6, "M5", BeerType.LIGHT, 11, 9);

        BottledBeer bottledBeer1 = new BottledBeer("BottledBeer1", 2, "M5", BeerType.DARK_LIGHT, 8, 16);
        BottledBeer bottledBeer2 = new BottledBeer("BottledBeer2", 1, "M4", BeerType.DARK, 10, 11);
        BottledBeer bottledBeer3 = new BottledBeer("BottledBeer3", 1.5, "M3", BeerType.LIGHT, 12, 15);
        BottledBeer bottledBeer4 = new BottledBeer("BottledBeer4", 1, "M2", BeerType.DARK, 14, 12);
        BottledBeer bottledBeer5 = new BottledBeer("BottledBeer5", 2, "M1", BeerType.DARK_LIGHT, 16, 20);

        List<Beer> beerList = new ArrayList<>();
        beerList.add(draftBeer1);
        beerList.add(draftBeer2);
        beerList.add(draftBeer3);
        beerList.add(draftBeer4);
        beerList.add(draftBeer5);

        beerList.add(bottledBeer1);
        beerList.add(bottledBeer2);
        beerList.add(bottledBeer3);
        beerList.add(bottledBeer4);
        beerList.add(bottledBeer5);

        // Calculate total price

        double salary = beerList.stream().mapToDouble(Beer::getPrice).sum();

        // Find the highest price beer

        Beer highestPriceBeer = beerList.stream()
                .max(Comparator.comparingDouble(Beer::getPrice)).
                        orElse(null);
        System.out.println("Highest Price Beer is " + highestPriceBeer.toString() + " with price "  + highestPriceBeer.getPrice() + " USD");

        // Find the lowest price beer

        Beer lowestPriceBeer  = beerList.stream()
                .min(Comparator.comparingDouble(Beer::getPrice)).
                        orElse(null);
        System.out.println("Lowest Price Beer is " + lowestPriceBeer.toString() + " with price "  + lowestPriceBeer.getPrice() + " USD");

        // The average price of beer

        double avg = beerList.stream().mapToDouble(Beer::getPrice)
                .average().orElse(0);
        System.out.println("The average price of beer is " + avg + " USD");

        // What beer expensive: draft beer or bottled beer

        double draftBeerPrice = beerList.stream().filter(el -> el instanceof DraftBeer)
                .mapToDouble(Beer::getPrice).sum();

        double bottledBeerPrice = beerList.stream().filter(el -> el instanceof BottledBeer)
                .mapToDouble(Beer::getPrice).sum();

        if (draftBeerPrice > bottledBeerPrice) {
            System.out.println("Draft beer more expensive than draft beer");
        } else if (draftBeerPrice < bottledBeerPrice) {
            System.out.println("Bottled beer more expensive than draft beer.");
        } else {
            System.out.println("They are equal.");
        }
    }
}
