!SLIDE 

##Defining classes 


!SLIDE smaller

##Class overview 
	
	@@@JAVA
	
	class MyClass {				
		//field
		//constructor
		//method declaration
	}

!SLIDE smaller

##Class example

	@@@JAVA
	
	public class  {
		//fields
		double re;
		double im;

		//constructor
		Complex(double re, double im) { }
		
		//access method
		double real() { return re; }
		double imag() { return im; }
	}
	
	
!SLIDE smaller 

# access modifiers
* private 
* protected
* _default_ (!!)
* public

# legal modifiers
* top-level class: public || _default_
* fields: private || protected || _default_ || public
* methods: private || protected || _default_ || public

!SLIDE smaller

img(img4/access01.png)


!SLIDE smaller

	@@@JAVA
	
	//package math.complex;
	public class ComplexNumber { }
	public class ComplexRationalNumber { }
	class ComplexNumberFormatter { }  //default access
	
	//package math.rational;
	public class RationalNumber { } 
	public RationalNumberFormatter { } //default access
	
!SLIDE smaller

img(img4/access02.png)
	


