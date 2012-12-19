public class OverrideTest {

    public void overrideTest() {

	
	Polygon polygon = new Polygon();
	
	String toStringPolygon = polygon.toString();

	assertEquals( toStringPolygon, "polygon" );


    }
}