public class OverrideTest {

    public void overrideTest() {

	
	Polygon polygon = new Polygon(); //abstract class
	
	String toStringPolygon = polygon.toString();

	assertEquals( toStringPolygon, "polygon" );


    }
}