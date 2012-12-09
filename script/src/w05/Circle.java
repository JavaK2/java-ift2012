package w05.math;

public class Circle {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

public class Triangle {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

public class Square {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}


public class Calculator  { 
    
    public static double calculateArea(Circle circle) {
	return circle.getArea();
    }

    public static double calculateArea(Triangle triangle) {
	return triangle.getArea();
    }

    public static double calculateArea(Square square) {
	return square.getArea();
    }

}
