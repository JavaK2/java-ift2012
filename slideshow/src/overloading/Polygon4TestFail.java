public class OverrideTest {

    public void overrideTest() {
		
	Square square = new Square();
	
	assertEquals( square.corners , 4 ); // 4


	Square square3d = new Square3d();
	assertEquals(square3d.corners, 8 ); // 8


	square = new Square3d();
	assertEquals(square.corners, 4); // at compile time


	
    }
}