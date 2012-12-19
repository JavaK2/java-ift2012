public class OverrideTest {

    public void overrideTest() {

	
	Polygon polygon = new Square();
	
	Square square = new Square();
 
	String toStringPolygon = polygon.toString();
	String toStringSquare = square.toString();

	assertEquals( toStringPolygon, "polygon" ); // false
	assertEquals( toStringSquare, "square" ); // true

    }
}