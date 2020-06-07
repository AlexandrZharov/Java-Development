package module2.inheritance;

/**
 * Rectangle Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Inheritance
 *
 * 1. Create a child from the class Rectangle.
 */
public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int height, int width, String color) {
        super("Rectangle", color);
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width*height;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
    }
}
