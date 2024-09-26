package Sesiunea12;

//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three
// abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
// The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea'
// and 'CircleArea' for printing the area of rectangle, square and circle respectively.
// Create an object of class 'Area' and call all the three methods.

// test program
public class CalculateArea {
    public static void main(String... args) {
        Area area = new Area();
        double rectangleArea = area.RectangleArea(5,9);
        double squareArea = area.SquareArea(5);
        double circleArea = area.CircleArea(2.5);

        System.out.println("Area of rectangle is: " + rectangleArea);
        System.out.println("Area of square is: " + squareArea);
        System.out.println("Area of  circle is: " + circleArea);
    }
}

// abstract class and abstract methods
abstract class Shape {
    abstract double RectangleArea(double length, double breadth);

    abstract double SquareArea(double side);

    abstract double CircleArea(double radius);
}

class Area extends Shape {

    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double side) {
        return side * side;
    }

    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}