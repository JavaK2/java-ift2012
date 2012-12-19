public class OverrideTest {

    public void overrideTest() {
		
	Square square = new Square();
	String toStringSquare  = square.toString();
	assertEquals( toStringSquare, "square" ); // true


	Square square3d = new Square3d();
	assertEquals(square3d.toString,
		     "square3"); // true


	square = new Square3d();
	assertEquals(square.calculateArea(), ??); // 10.0
	assertEquals(square.calculateVolumn(), ??); // error

	assertEquals(
	     (Square3d)square).calculateVolumn(), ??);
	
    }
}