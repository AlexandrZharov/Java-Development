package module2.patterns;

import module2.polymorphism.Cube;
import module2.polymorphism.ThreeDimensionalObject;

import java.util.Map;

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
 * 2. Abstract factory.
 */
public class AbstractFactory {

    public static ThreeDimensionalObject create(String type, Map<String, Object> params) {
        if(type.equals("Cube")) return new Cube(params);
        else return null;
    }
}
