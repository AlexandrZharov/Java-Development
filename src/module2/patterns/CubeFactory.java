package module2.patterns;

import module2.classes.Cube;

/**
 * CubeFactory class
 *
 * @author Aleksandr Zharov
 * @version 1
 *
 * Copyright (c) Aleksandr Zharov KHNEU
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 *
 * 1. Factory.
 */
public class CubeFactory {
    /**
     *
     * @param side - side of cube
     * @return new Cube object
     */
    public static Cube create (int side) {
        if(side <= 0) {
            System.out.println("Error! Side of cube must be > 0!");
            return null;
        }
        Cube newCube = new Cube(side);
        return newCube;
    }
}
