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