package module2.patterns;

import module2.classes.Cube;

/**
 * CubeFactory class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 *
 * 1. Factory.
 */
public class CubeFactory {
    public static Cube create (int side) {
        if(side <= 0) {
            System.out.println("Error! Side of cube must be > 0!");
            return null;
        }
        Cube newCube = new Cube(side);
        return newCube;
    }
}
