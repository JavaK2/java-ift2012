package w05.math;

//file Rectangle.java
public class Rectangle {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

//file Calculator.java
public class Calculator  { 
    
    public static double calculate(Circle circle) {
	return circle.getArea();
    }

    public static double calculate(Triangle triangle) {
	return triangle.getArea();
    }

    public static double calculate(Square square) {
	return square.getArea();
    }

    public static double calculate(Rectangle rectangle) {
	return rectangle.getArea();
    }

}
