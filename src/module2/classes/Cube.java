package module2.classes;

import java.util.Objects;

/**
 * Cube Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Java class creation
 *
 * Create a class from the attached document according to the order in your group .  The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 */
public class Cube {

    private int side;

    //1.
    Cube(int side) {
        this.side = side;
    }

    //2.
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    //3.
    public double getPerimeter() {
        return 12* side;
    }

    public double getSideArea() {
        return Math.pow(side,2);
    }

    public double getVolume() {
        return Math.pow(side,3);
    }

    public double getSideDiagonal() {
        return Math.sqrt(Math.pow(side,2) + Math.pow(side,2));
    }

    public double getMainDiagonal() {
        double sideDiagonal = this.getSideDiagonal();
        return Math.sqrt(Math.pow(sideDiagonal,2) + Math.pow(side,2));
    }

    //4.
    @Override
    public String toString() {
        return "Cube {\n" +
                "\tside: " + side + "\n" +
                "\tperimeter: " + getPerimeter() + "\n" +
                "\tside_area: " + getSideArea() + "\n" +
                "\tvolume: " + getVolume() + "\n" +
                "\tside_diagonal: " + getSideDiagonal() + "\n" +
                "\tmain_diagonal: " + getMainDiagonal() + "\n" +
                "\t}";
    }

    //5.
    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Cube or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Cube)) {
            return false;
        }

        // typecast o to Cube so that we can compare data members
        Cube cube = (Cube) o;

        // Compare the data members and return accordingly
        return cube.getSide() == this.getSide();
    }
}
