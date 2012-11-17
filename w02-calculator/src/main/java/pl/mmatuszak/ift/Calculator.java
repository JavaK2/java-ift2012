package pl.mmatuszak.ift;


public class Calculator 
{
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x + neg(y);
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        throw new UnsupportedOperationException("to do");
    }


    public int neg(int x) {
        if (x > 0) {
            return -x;
        }
        return x;
    }

}
