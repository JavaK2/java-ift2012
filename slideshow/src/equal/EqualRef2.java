public class TestEquality {
   
    Point p1 = new Point(1,1);
    Point p2 = new Point(1,1);
    Point p3 = new Point(1,2);
    Point p4 = p3;

    
    public void testEquality() {
	assertEquals( p3 == p4, true );
	assertEquals( p3.equals(p4), true );
    }
}