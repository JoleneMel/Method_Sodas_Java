
public class Method_Sodas {

	//The main method is where our tests for our methods will go 
	public static void main(String[] args) {
		//Soda = parameter
		//Cup = method 
		
		
		//Soda is a vague name for what we want in it, in Java you do have to specify what data type you will be using 
		//in this instance we will use a String 
		
	}
	//This is like someone telling you what the soda they would like to have 
	public static void sodaOrder(String soda) {
		System.out.println("I would like a " + soda);
	}
	
	
	//Many programmers start with accidentally setting their parameter 
	public static void setSodaOrder(String soda) {
		soda = "Cola";
		System.out.println("I would like a " + soda);
	}
	//This sets the output to only print out one outcome, a method is supposed to be a tool or like a multi-purpose solution 
	
	
	//Multiple parameters? We are gonna go to a fancy soda place so they have flavors~ 
	public static void flavoredSodaOrder(String flavor, String soda) {
		System.out.println("I would like a " + flavor + " flavored " + soda);
	}
	
	//example where this is also set 
	public static void setflavoredSodaOrder(String flavor, String soda) {
		soda = "Cola";
		flavor = "vanilla";
		System.out.println("I would like a " + flavor + " flavored " + soda);
	}
	
	//
	
	
	
}
