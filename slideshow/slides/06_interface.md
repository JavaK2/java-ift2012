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

!SLIDE

	@@@JAVA
	
	public interface Comparable {
	       
	       int compareTo(Object o);
	}

!SLIDE 

# 
