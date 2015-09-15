package MainPackage;

public class MyInteger {

	//Stores in value represented by this object
	private int value;
	
	//Constructor that creates MyInteger object for the specified int value
	MyInteger(int value){	
		this.value = value;
	}
	
	//Get method that returns int value
	int getMyInteger(){
		return value;
	}
	
	//isEven, isOdd, isPrime methods that return true if value is even, odd, or prime
	public boolean isEven(){
		if (value%2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd(){
		if (value%2 == 0)
			return false;
		else
			return true;
		
	}
	public boolean isPrime(){
		for (int factor = 2; factor < value / 2; factor++) {
			if (value % factor == 0)
				return false;
		}
		return true;
	}
	
	//Static methods that return true if value is even, odd, or prime
	public static boolean isEven(int value){
		if (value%2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int value){
		if (value%2 == 0)
			return false;
		else
			return true;
		
	}
	public static boolean isPrime(int value){
		for (int factor = 2; factor < value / 2; factor++) {
			if (value % factor == 0)
				return false;
		}
		return true;
	}
	
	//Static methods that return true if value is even, odd, or prime
	public static boolean isEven(MyInteger number){
		return number.isEven();
	}

	public static boolean isOdd(MyInteger number){
		return number.isOdd();
		
	}
	public static boolean isPrime(MyInteger number){
		return number.isPrime();
	}
	
	//These methods return true if the value in the object is equal to the specified value
	public boolean equals(int number){
		return (value == number);
	}
	public boolean equals(MyInteger number){
		return (value == number.getMyInteger());
	}
	
	//Converts an array of characters to an int value
	public static int parseInt(char[] charc){
		String s = new String(charc);
		return Integer.parseInt(s);
	}
	
	//Converts a string into an int value
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
}
