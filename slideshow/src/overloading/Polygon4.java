public class Square extends Polygon {
    
    protected int corners = 4;
    
    public double calculateArea() {
	return 2.0;
    }

    public String toString() { 
	return "square"; 
    }
}

public class Square3d extends Square {

    protected int corners = 8;

    public double calculateArea() {
	return 10.0;
    }
    
    public double calculateVolumn() {
	return 20.0;
    }

    public double toString() {
	return "square3d";
    }
}
