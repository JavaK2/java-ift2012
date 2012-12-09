package w05.math;

public class Circle implements Shape {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

public class Triangle implements Shape {
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}

public class Square implements Shape{
    public void double getArea() { /*body*/ }
    public void double getPerimeter() { /*body*/ }
}


public class Calculator  { 
    
    public static double calculateArea(Shape shape) {
	return shape.getArea();
    }

}
