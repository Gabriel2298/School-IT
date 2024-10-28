package Sesiunea16;

//Implement the equals() and hashCode() methods for a Rectangle class with width and height fields.
// Test that two instances with the same width and height return true for equals() and have the same hash code.

import java.util.Objects;

public class RectangleTest {
    public static void main(String... args) {
        Rectangle r1 = new Rectangle(12, 5);
        Rectangle r2 = new Rectangle(12, 5);
        Rectangle r3 = new Rectangle(10, 7);

        System.out.println("Test if rectangle there are equals or no, first test:  " + r1.equals(r2) +
                "\n Second test: " + r1.equals(r3));

        System.out.println("Test hashCode -> " + (r1.hashCode()==r2.hashCode()));
        System.out.println("Test hashCode -> " + (r1.hashCode()==r3.hashCode()));
    }

}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;

    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

}


