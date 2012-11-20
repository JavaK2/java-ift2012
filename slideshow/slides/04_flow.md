!SLIDE

Flow control 

Block
If-statement
Loops
Switch


!SLIDE 

## Block

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| 
		int y = 0;		| 
		{				|
			x++;		| 
			y++;		| 
			int z = 0;	| 
		}
	}


!SLIDE 

## Block

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| x == 1
		int y = 0;		| 
		{				|
			x++;		| 
			y++;		| 
			int z = 0;	| 
		}
	}

!SLIDE 

## Block

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| x == 1
		int y = 0;		| y == 0
		{				|
			x++;		| 
			y++;		| 
			int z = 0;	| 
		}
	}

!SLIDE

## Block 

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| x == 1
		int y = 0;		| y == 0
		{				|
			x++;		| x == 2
			y++;		| 
			int z = 0;	| 
		}
	}

!SLIDE 

## Block

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| x == 1
		int y = 0;		| y == 0
		{				|
			x++;		| x == 2
			y++;		| y == 1
			int z = 0;	| 
		}
	}

!SLIDE 

## Block

	@@@JAVA

	int x = 0;			| x == 0
						|
	{					|
		x++;			| x == 1
		int y = 0;		| y == 0
		{				|
			x++;		| x == 2
			y++;		| y == 1
			int z = 0;	| z == 0
		}
	}
	

!SLIDE

## Block - illegal operation

	@@@JAVA

	int x = 0;			| 
						|
	{					|
		x++;			| 
		int x = 0;		| error
		
	}

!SLIDE 

## Block - illegal operation

	@@@JAVA

	int x = 0;			| 
						|
	{					|
		x++;			| 
		int y = 0;		| 
		z++;			| error
		{				|
			x++;		| 
			y++;		| 
			int z = 0;	| 
		}
	}

!SLIDE smaller

# If - statement

	@@@JAVA

	if ( boolean_expression ) {
		statement
	}

	if ( boolean_expression ) {
		statement
	} else {
		statement
	}

	if ( boolean_expression ) { statement } 
	else if (boolean_expression ) { statement  } 
	else {  statement  }

!SLIDE smaller 

# If - example

	@@@JAVA

	int x = 0;							| x == 0
	if ( x > 3 ) {						|		
		System.out.println("x > 3");	| 
	}									|
										|
	x = 3;								| 

!SLIDE smaller 

# If - example

	@@@JAVA

	int x = 0;							| x == 0
	if ( x > 3 ) {						|		
		System.out.println("x > 3");	| //skipped
	}									|
										|
	x = 3;								| x == 3


!SLIDE smaller

# If - example

	@@@JAVA

	int x = 4;							| x == 4
	if ( x > 3 ) {						|
		System.out.println("x > 3");	| 
	} else {							|
		x--;							|
		System.out.println("x <= 3");	| 
	}									|
										|
	System.out.println("x=" + x);		|  

!SLIDE smaller

# If - example

	@@@JAVA

	int x = 4;							| x == 4
	if ( x > 3 ) {						|
		System.out.println("x > 3");	| //skipped
	} else {							|
		x--;							|
		System.out.println("x <= 3");	| x <= 3
	}									|
										|
	System.out.println("x=" + x);		|  


!SLIDE smaller

# If - example

	@@@JAVA

	int x = 4;							| x == 4
	if ( x > 3 ) {						|
		System.out.println("x > 3");	| //skipped
	} else {							|
		x--;							|
		System.out.println("x <= 3");	| x <= 3
	}									|
										|
	System.out.println("x=" + x);		| x=3 

!SLIDE smaller

# If - example

	@@@JAVA

	int x = 1;
	
	if ( x == 3 ) { 
	
	} else if (x < 4) {

		System.out.println("<4"); 

	} else if (x < 2) {
		
		System.out.println("<2"); 

	} else { 

		System.out.println("else"); 

	}


!SLIDE smaller

# If - bad practice 

	@@@JAVA

	int x == 0;

	if (x == 1) 
		x++;
		else
			if (x == 2)
				if (x == 3)
					x++;
				else 
					x--;
!SLIDE

# Loop - while

	@@@JAVA

	while(condition) {
		statement
	}

!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			|
		x++;				|
	}						|
							|
	println("x="+x);		| 	


!SLIDE

# 
	@@@JAVA

	int x = 0;				| x == 0
							|
	while (x < 3) {			|
		x++;				|
	}						|
							|
	println("x="+x);		| 	

!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			| true
		x++;				|
	}						|
							|
	println("x="+x);		| 		


!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			| 
		x++;				| x == 1
	}						|
							|
	println("x="+x);		| 	


!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			| true
		x++;				| 
	}						|
							|
	println("x="+x);		| 	


!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			|
		x++;				| x == 2
	}						|
							|
	println("x="+x);		|


!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			| false
		x++;				| 
	}						|
							|
	println("x="+x);		| 	

!SLIDE

# 
	@@@JAVA

	int x = 0;				| 
							|
	while (x < 3) {			|
		x++;				| 
	}						|
							|
	println("x="+x);		| x=2

!SLIDE

# Loop - do - while

	@@@JAVA

	do {
		statement
	} while ( condition )


!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				|
	} while (x < 3);		|
							|
	println("x="+x);		|


!SLIDE

# 

	@@@JAVA

	int x = 0;				| x == 0
							|
	do {					|
		x++;				|
	} while (x < 3);		|
							|
	println("x="+x);		|

!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| x == 1
	} while (x < 3);		|
							|
	println("x="+x);		|


!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| 
	} while (x < 3);		| true
							|
	println("x="+x);		|

!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| x == 2
	} while (x < 3);		|
							|
	println("x="+x);		|



!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| 
	} while (x < 3);		| true
							|
	println("x="+x);		|


!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| x == 3
	} while (x < 3);		|
							|
	println("x="+x);		|


!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				| 
	} while (x < 3);		| false
							|
	println("x="+x);		|

!SLIDE

# 

	@@@JAVA

	int x = 0;				|
							|
	do {					|
		x++;				|
	} while (x < 3);		|
							|
	println("x="+x);		| x=3


!SLIDE

# For loop

	@@@JAVA
					
	for (declaration ; 
			condition ; 
				update_action ) {
		statement 
	}


!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| x == 0
									|
	for (int i = 0; i < 10; ++i) {	|
		x = x + i;					|
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| i == 0
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| 



!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| x == 0
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| i == 1
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| x == 1
	}								|
									|
	println("x="+x);				|

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| i == 2
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| x == 3
	}								|
									|
	println("x="+x);				|

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| i == 3
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| x == 6
	}								|
									|
	println("x="+x);				|

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| i == 9
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| 

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| x == 45
	}								|
									|
	println("x="+x);				|

!SLIDE

# For loop

	@@@JAVA

	int x = 0;						| 
									|
	for (int i = 0; i < 10; ++i) {	| 
		x = x + i;					| 
	}								|
									|
	println("x="+x);				| x == 45

!SLIDE

# For loop - variations

	@@@JAVA

	int x = 0;						 
									
	for ( ; x < 10; ++x) {	 
		println(x);					
	}	


!SLIDE

# For loop - variations

	@@@JAVA

	int x = 0;						 
									
	for ( ; x < 10;) {	 
		++x;
		println(x);
	}




!SLIDE

# For loop - variations

	@@@JAVA

	int x = 0;						 
									
	for (int a = 0, b[] = { 1 }, 
			c[][] = { { 1 }, { 2 } }; 
				a < 10 && x == 0; a++) {
 
	}

!SLIDE

# For loop - variations

	@@@JAVA
									
	for ( Object a = new Object() ;  ; ) {	 
		
	}					

!SLIDE

# Infinite loops

	@@@JAVA
									
	for ( ; ; ) {	 
		
	}

	while(true) {

	}	

	do {

	} while(true);				

!SLIDE

# Switch statement 


	@@@JAVA

	switch (test) {

		case value:
			statement;
		case value:
			statement;
		default:
			statement;
	}

!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		|
									|
	switch(choice) {				|
		case 1: 					|
			println("1");			|
		case 2:						|
			println("1");			|
		case 3:						|
			println("1");			|
			break;					|
		case 4:						|
			println("1");			|
			break;					|
		default:					|
			println("1");			|
	}
-------------------------------------


!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		| choice == 1
									|
	switch(choice) {				|
		case 1: 					|
			println("case 1");		|
		case 2:						|
			println("case 2");		|
		case 3:						|
			println("case 3");		|
			break;					|
		case 4:						|
			println("case 4");		|
			break;					|
		default:					|
			println("default");		|
	}
-------------------------------------

##case 1
##case 2
##case 3

!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		| choice == 2
									|
	switch(choice) {				|
		case 1: 					|
			println("case 1");		|
		case 2:						|
			println("case 2");		|
		case 3:						|
			println("case 3");		|
			break;					|
		case 4:						|
			println("case 4");		|
			break;					|
		default:					|
			println("default");		|
	}
-------------------------------------

##case 2
##case 3

!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		| choice == 3
									|
	switch(choice) {				|
		case 1: 					|
			println("case 1");		|
		case 2:						|
			println("case 2");		|
		case 3:						|
			println("case 3");		|
			break;					|
		case 4:						|
			println("case 4");		|
			break;					|
		default:					|
			println("default");		|
	}
-------------------------------------

##case 3


!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		| choice == 4
									|
	switch(choice) {				|
		case 1: 					|
			println("case 1");		|
		case 2:						|
			println("case 2");		|
		case 3:						|
			println("case 3");		|
			break;					|
		case 4:						|
			println("case 4");		|
			break;					|
		default:					|
			println("default");		|
	}
-------------------------------------

##case 4


!SLIDE smaller

#	
	@@@JAVA

	int choice = getChoice();		| choice == 5
									|
	switch(choice) {				|
		case 1: 					|
			println("case 1");		|
		case 2:						|
			println("case 2");		|
		case 3:						|
			println("case 3");		|
			break;					|
		case 4:						|
			println("case 4");		|
			break;					|
		default:					|
			println("default");		|
	}
-------------------------------------

##default


!SLIDE smaller incremental 

## Arrays - characteristics 

* arrays are objects
* store multiple variables of the same type
* can hold primitive or object reference; arrays are still objects!

* No such thing as a PRIMITIVE ARRAY, but can be an ARRAY OF PRIMITIVES!
* arrays are zero-base indexed

!SLIDER smaller incremental

# Three steps to construct array

	@@@JAVA 

	//declare - make an array reference variable 

	int[] ar;
	Object [] obj;

	

!SLIDER smaller incremental

# Three steps to construct array

	@@@JAVA 

	//declare - make an array reference variable 

	int[] ar;
	Object [] obj;

	//construct - make an array object

	ar = new int [10];
	obj = new Object[19];




!SLIDER smaller incremental

# Three steps to construct array

	@@@JAVA 

	//declare - make an array reference variable 

	int[] ar;
	Object [] obj;

	//construct - make an array object

	ar = new int[10];
	obj = new Object[19];

	//initialize - populate the array with elements
	
	for (int i = 0; i < 10; ++i) { ar[i] = i; }
	obj[0] = new Object();
	obj[1] = new Object();


