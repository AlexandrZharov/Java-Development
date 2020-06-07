package module2.inheritance;

/**
 * Shape Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Inheritance
 *
 * 2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
public class Shape {
    private String typeOfShape;
    private String color;

    public Shape(String typeOfShape, String color) {
        this.typeOfShape = typeOfShape;
        this.color = color;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "typeOfShape='" + typeOfShape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
