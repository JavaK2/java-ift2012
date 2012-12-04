package math.complex;

/**
 * User: Marcin Matuszak
 * Date: 11/26/12
 */
public class ComplexNumber {

    double re;
    double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber that) {
        double real = this.re + that.re;
        double img = this.re + that.im;

        return new ComplexNumber(real, img);
    }

    public ComplexNumber minus(ComplexNumber that) {
        double real = this.re - that.re;
        double img = this.re - that.im;

        return new ComplexNumber(real, img);
    }



}
