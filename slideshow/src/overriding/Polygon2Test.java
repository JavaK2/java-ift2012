public class OverrideTest {

    public void overrideTest() {
		
	Square square = new Square();
	String toStringSquare  = square.toString();
	assertEquals( toStringSquare, "square" ); // ??


	Square square3d = new Square3d();
	assertEquals(square3d.toString,
		     "square3"); // ??


	square = new Square3d();
	assertEquals(square.calculateArea(), ??); // ??
	assertEquals(square.calculateVolumn(), ??); // ??
	
    }
}