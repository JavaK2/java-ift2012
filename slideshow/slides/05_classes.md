!SLIDE 

# Defining classes #


!SLIDE smaller

# Class overview #
	
	@@@JAVA
	
	class MyClass {				
		//field
		//constructor
		//method declaration
	}

!SLIDE smaller

# Class example #

	@@@JAVA
	
	public class Complex {
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

# fields == variables #

* instance variables (non-static fields)
* class variables (static fields)
* local variables
* parameters


!SLIDE smaller 

# instance variables (non-static)  #

* objects store their individual states in "non-static fields"
* instances variables values are unique to each instance of a class
* can not be accessed from static methods / blocks
* are declared in a class, but outside a method, constructor or any block
* have default values: primitives => 0, boolean => false, reference => null

!SLIDE smaller

# instance variables #

	@@@JAVA
	
	public class Complex {		

		//constructor
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		double re; //instance variable

		//access method
		double real() { return re; }
		double imag() { return im; }

		double im; //instance variable
	}

!SLIDE smaller 

# local variables #

* are declared in: methods, constructor, blocks (static or non-static)
* are created when method/constructor/block of code is entered and distroyed it's finished
* are visible only within that block
* access modifiers _can_ _not_ be applied to local variables
* no default value

!SLIDE smaller 

	@@@JAVA
	
	public class Complex {	

		double re;
		double im; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex conjugate() {  
			Complex conj = new Complex(re, -im);
			return conj; 
		}

		public Complex times(double factor) {
			Complex res;
			
			{ 
				double ref = factor * re;
				double imf = factor * im;
				res = new Complex(ref, imf);
			}	

			return res;
		}

		
	} 

!SLIDE smaller 

# class variables (static) #

!SLIDE smaller 

# methods #

  	  @@@JAVA

	  public class Complex {
   	  	 
		 double re, im;

	  	 public Complex conjugate() { return ....; }

		 public Complex add(Complex complex) { return ....; }
	  
		 private void print(Complex complex) { System.out.println(complex); } 
	 
	 }


!SLIDE smaller 

# methods - rules #

* must be declared inside class
* one return type - primitive, object, array
* return keyword anywhere in method's body
* for void methods return keyword is optional
* can call others methods
* can access instance / class variable

!SLIDE smaller 

	@@@JAVA
	
	public class Complex {	

		double re;
		double im;
		boolean debug; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex conjugate() {  
			Complex conj = new Complex(re, -im);
			if (debug) {
				print(conj);
			}
			return conj; 
		}

		private void print(Complex complex) { 
			System.out.println(complex); 
		} 
		
	} 

!SLIDE smaller 

	@@@JAVA
	
	public class Complex {	

		double re;
		double im;
		boolean debug; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex conjugate() {  
			Complex conj = new Complex(re, -im);
			if (debug) {
				print(conj);
			}
			return conj; 
		}

		private void print(Complex complex) { 
			System.out.println(complex); 
		}

		private void print() {
			print( conjugate() );
		} 
		
	} 


!SLIDE smaller

# constructor - special method #

* name the same as class
* no return type ( != void )
* can have zero-to-many arguments
* is called each time object is created
* no-arg default constructor, no-arg constructor, constructor with arguments

!SLIDE smaller 
       
	@@@JAVA
	
	//no-arg default constructor
	public class Point { 
		private double x;
		private double y;
	} 

	public class Point {
		private double x;
		private double y;

		//no-arg constructor
		public Point() {
			this.x = 0.0;
			this.y = 0.0
		}

		//constructor
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

!SLIDE smaller

# calling constructors 

	@@@JAVA

	//no-arg constructor (default)
	Point point = new Point();

	//constructor
	Point point = new Point(3.0, 2.1);

!SLIDE smaller

# calling constructors - new

	@@@JAVA 

	point class Point {

		private double x;
		private double y;

		public Point() {
			new Point(0.0, 0.0);
		}

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

	}

!SLIDE smaller

# calling constructors - this()

	@@@JAVA 

	public class Point {

		private double x;
		private double y;

		public Point() {
			this(0.0, 0.0);
		}

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

	}

!SLIDE smaller

# calling constructors - this()

	@@@JAVA 

	public class Point {

		private double x;
		private double y;
		private double z;

		public Point() {
			this(0.0, 0.0);
		}

		public Point(double x, double y) {
			this(x, y, 0.0);
		}

		public Point(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;	
		}

	}


!SLIDE

# this vs this()

!SLIDE smaller

# this() 

* can be used only in constructor
* calls constructor with matching parameters

!SLIDE smaller

# calling constructors - this()

	@@@JAVA 

	public class Point {

		private double x;
		private double y;
		private double z;

		public Point() {
			this(0.0, 0.0);
		}

		public Point(double x, double y) {
			this(x, y, 0.0);
		}

		public Point(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;	
		}

	}


!SLIDE smaller 

# this

* is used to refer to current instance of object
* can be used inside methods and constructors
* distincts instance from local variables
* can be passed as parameter
* can be returned from method


!SLIDE smaller 


	@@@JAVA
	
	public class Complex {	

		double re;
		double im;
		boolean debug; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex plus(Complex b) {
        	
        	double real = this.re + b.re;
        	double imag = this.im + b.im;
        	return new Complex(real, imag);
    	}
		
	} 

!SLIDE smaller 


	@@@JAVA
	
	public class Complex {	

		double re;
		double im;
		boolean debug; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex plus(Complex b) {
        	Complex a = this;
        	double real = a.re + b.re;
        	double imag = b.im + b.im;
        	return new Complex(real, imag);
    	}
		
	} 

!SLIDE smaller 

	@@@JAVA
	
	public class Complex {	

		double re;
		double im;
		boolean debug; 
		
		public Complex(double re, double im) {
			this.re = re;
			this.im = im;
		}
		
		public Complex minus(Complex b) {
			return minus(this, b);
    	}

    	public Complex minus(Complex a, Complex b) {
        	double real = a.re - b.re;
        	double imag = a.im - b.im;
        	return new Complex(real, imag);
    }
		
	} 		


!SLIDE smaller 

# access modifiers 
* private 
* protected
* _default_ (!!)
* public

!SLIDE smaller

# legal modifiers
* top-level class: public || _default_
* fields: private || protected || _default_ || public
* methods: private || protected || _default_ || public
* local variables: none

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
	


!SLIDE smaller

# static keyword - three scenarios #

* static variable
* static method
* static block of code


!SLIDE smaller 

# static variable #

* belongs to class not to instance of it (object)
* single copy is shared by all the instance of the class
* initialized only once
* initialized before initialization of any other instance variable
* accessed dirctly by class name, does not need reference

!SLIDE smaller 

# static method #

* belongs to class not to instance of it (object)
* can access only static data - can not access not-static data
* can call only static methods
* can be access directly by class name, does not need reference
* can not refere to 'this' or 'super' keywords in anyway

!SLIDE smaller

# static block - example #

	@@@JAVA 

	public class StaticBlock { 
		  private static int counter;	  
	  static {
	  	 System.out.println("hello world without main");
		 counter = 3;
	  }
}

!SLIDE smaller

# static block

* static block is executed when a class is first loaded into the JVM
* used for initializing static members

   

   