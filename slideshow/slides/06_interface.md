!SLIDE 

# Interface #

!SLIDE smaller incremental

# Concept #

* contract
* describe what should be done - not how
* set of requiments


!SLIDE smaller 

# Interface vs Class - similarities #

* seems similar, but different concepts
* all rules from class applies: extension .java, bytecode .class, packages, naming
* _class_ describes the attributes and behavior
* _interface_ contains behavior that a class implements

!SLIDE smaller

# Interface vs Class - differences #

* can not be instantioned
* does not contain any constructor (including default no-arg)
* does not contain instan fields. All fields are __public__ __static__ __final__
* class implements interface
* interface can extend multiple interfaces

!SLIDE smaller 


# Declaration #

* keyword __interface__
* name 
* members (fields, methods, nested classes / interfaces)

!SLIDE smaller

	@@@JAVA
	
	public interface Comparable {
	       
	       int compareTo(Object o);
	}

!SLIDE smaller
       @@@JAVA

       public interface ComplexComparable extends Comparable {
       	      int abs(Object o);
       }

!SLIDE smaller
       @@@JAVA
       
       public class Complex implements Comparable {
       
		public int compareTo(Object o) { 
		       /*body*/ 
		}
       }

       public class Complex implements ComplexComparable {
       	      public int compareTo(Object o) {
	      	     /*body*/
	      }
	      public int abs(Object o) {
	      	     /*body*/
	      }
       }

       public class Complex implements Comparable, Serializable {
       	      public int compareTo(Object o) {
	      	     /*body*/
	      }
	      public int abs(Object o) {
	      	     /*body*/
	      }
       } 

!SLIDE smaller incremental

# Interface #

* access modifiers: public / __default__
* abstract (omitted by convention)

!SLIDE smaller incremental

# Interface members - methods #

* no body
* are implicitly: public, abstract
* can not be: final, static


!SLIDE smaller incremental

# Interface members - fields #

* in-fact _constants_
* are implicitly: public, final, static
* must be initialized (no constructor or static blocks)


!SLIDE  

(Complex comparation)

!SLIDE 

# Implementing interface #

* keyword __implements__
* implement all methods (non-abstract class)
* multiple inheritance

 

!SLIDE 

# Abstact class #

!SLIDE smaller

# Inheritance #

It is the capability of a class to use the properties and methods of another class while adding its own functionality. 

!SLIDE smaller 

* defines contract with partial implementation
* can not be instantioned
* may have no, incomplete or fully implemented

!SLIDE 

       @@@JAVA 

       public abstract class Shape  {
	     
	      abstract double calcPerimeter();
	      abstract double calcArea();

	     
       }

!SLIDE smaller

	@@@JAVA
	
	public Circle extends Share {
	       private Point center;
	       private double radius;

	       public Circle(Point center, double radius) {
		      this.center = center;
		      this.radius = radius;
	       }

	       public double calcPermieter() { 
	       	      /*body*/
	       }
	       public double calcArea() {
	       	      /*body*/
	       }
	
	}


!SLIDE smaller

       @@@JAVA
       
       public abstract Polygon extends Shape {
       	      private int corners;
	      public Polygon(int corners) {
	      	     this.corners = corners;
	      }
	      public int getCorners() {
	      	     return corners;
	      }
       }

       public Square extends Polygon {
       	      
	      public Square(int corners, .....) {
	      	     super(corners);
	      }

	      public double calcPermieter() { 
	       	      /*body*/
	      }
	      
	      public double calcArea() {
	       	      /*body*/
	      }
	      
       }

!SLIDE smaller

# Abstract class  #

* can not be instantioned
* can have constructor(s)
* can have contain instan fields. All fields are __public__ __static__ __final__
* class extends only ONE abstract class
* abstract class can extend ONE abstract or concrete class
* can implement multiple interfaces


!SLIDE

# Abstract class vs interface #

![SDP](img5/interface.PNG) 


!SLIDE smaller incremental

# Class hierarchy #

* Everything is an __Object__
* implicite inheritance
* __Object__ defines method: equal, hashCode, clone, getClass, finalize, toString


!SLIDE smaller incremental

# Everything is an __Object__
  
	@@@JAVA
  
	Shape shape = new Circle(...);
  
	shape.calcArea(); // OK

	Object sh = shape; // OK
  
	sh.calcArea(); // NOT OK

	sh.toString(); // OK
  
	((Shape)sh).calcArea() // OK

	Polygon p = (Polygon)sh; // NOT OK

!SLIDE smaller 

# Polymorphism #

It is the ability of an object to take on many forms. In programming languages polymorphism is the capability of an action or method to do different things based on the object that it is acting upon.