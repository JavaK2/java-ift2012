public class TestEquality {
   
    Point p1 = new Point(1,1);
    Point p2 = new Point(1,1);
    Point p3 = new Point(1,2);
    Point p4 = p3;

    
    public void testEquality() {
	assertEquals( p2 == p3, ?? );
	assertEquals( p2.equals(p3), ?? );
    }
}