package module2.polymorphism;

import java.util.Map;

/**
 * Cube class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Polymorphism
 *
 * Create and implement two interfaces for your class
 */
public class Cube implements ThreeDimensionalObject,Printable {

    private int side;

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }

    Cube(int side) {
        this.side = side;
    }

    public Cube(Map<String, Object> params) {
        this.side = (int) params.get("side");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 12* side;
    }

    public double getSideArea() {
        return Math.pow(side,2);
    }

    public double getSideDiagonal() {
        return Math.sqrt(Math.pow(side,2) + Math.pow(side,2));
    }

    public double getMainDiagonal() {
        double sideDiagonal = this.getSideDiagonal();
        return Math.sqrt(Math.pow(sideDiagonal,2) + Math.pow(side,2));
    }

    @Override
    public String toString() {
        return "Cube {\n" +
                "\tside: " + side + "\n" +
                "\tperimeter: " + getPerimeter() + "\n" +
                "\tside_area: " + getSideArea() + "\n" +
                "\tvolume: " + calculateVolume() + "\n" +
                "\tside_diagonal: " + getSideDiagonal() + "\n" +
                "\tmain_diagonal: " + getMainDiagonal() + "\n" +
                "\t}";
    }
}
