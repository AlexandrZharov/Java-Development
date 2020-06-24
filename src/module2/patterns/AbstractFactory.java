package module2.patterns;

import module2.polymorphism.Cube;
import module2.polymorphism.ThreeDimensionalObject;

import java.util.Map;

/**
 * CubeFactory class
 *
 * Version info 1
 *
 * Copyright (c) Aleksandr Zharov KHNEU
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 *
 * 2. Abstract factory.
 */
public class AbstractFactory {

    /**
     *
     * @param type - type of three dimensional object(cube, cone, ...)
     * @param params - parameters of object(width, height, angles, ...)
     * @return new object
     */
    public static ThreeDimensionalObject create(String type, Map<String, Object> params) {
        if(type.equals("Cube")) return new Cube(params);
        else return null;
    }
}
