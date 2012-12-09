package w05.math;

//file Circle.java
public class Circle {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

//file Triangle.java
public class Triangle {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

//file Square.java
public class Square {
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

}
