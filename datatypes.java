Data Type   SIZE                  VALUE
Boolean     1 bit     primitive   True or False
int         4 bytes   primitive   -2billion to 2 billion
double      8 bytes   primitive   fractional number up to 15 digits eg. 3.(up to 15 decimal places)
char        2 bytes   primitive   single character/letter/ASCII value eg 'h'
String      varies    reference   a sequence of characters, eg "hello you"
  
  /*Primitive - predefined data types
  8 types(byte, short, int, long, float, double, char and boolean)
  Stores data
  Can only hold 1 value
  less memory
  faster
  
  
  */
  /* Reference - unlimited and user defined eg Strings
  Stores an address
  Could hold more than 1 value
  more memory
  slow
  */
  
  int x;        declaration
  x = 123;      assignment
  int x = 123;  initialization



public class Main {

	public static void main(String[] args) {
	/*A variable is a placeholder for a value that behaves
		as the value it contains. E.g x=123*/
    
		int x = 123;
		System.out.println("My number is: " + x);
		
			
	}


}
