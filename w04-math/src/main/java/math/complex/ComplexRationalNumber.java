package math.complex;

import math.rational.RationalNumber;

/**
 * User: Marcin Matuszak
 * Date: 11/27/12
 */
public class ComplexRationalNumber {

    RationalNumber re;
    RationalNumber im;



    public ComplexRationalNumber(RationalNumber re, RationalNumber im) {
        this.re = re;
        this.im = im;
    }


    public ComplexRationalNumber plus(ComplexRationalNumber that) {
        RationalNumber real = this.re.plus(that.re);
        RationalNumber img = this.im.plus(that.im);

        return new ComplexRationalNumber(real, img);
    }


    public ComplexRationalNumber minus(ComplexRationalNumber that) {
        RationalNumber real = this.re.minus(that.re);
        RationalNumber img = this.im.minus(that.im);

        return new ComplexRationalNumber(real, img);
    }

}
