
			// Demonstrate block scope.
				class Scope {
					public static void main(String args[]) {
						int x; // known to all code within main that is known everywhere in the code and can be used at anytime
						x = 10;
							if(x == 10) { // start new scope
								int y = 20; // known only to this block i.e can be used only within this if statement
			// x and y both known here.
								
								System.out.println("x and y: " + x + " " + y);
						x = y * 2;
							}
		   // y = 100; // Error! y not known here
		  // x is still known here.
								System.out.println("x is " + x);
					}
				}
