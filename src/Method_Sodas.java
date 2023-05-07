
public class Method_Sodas {

	//The main method is where our tests for our methods will go 
	public static void main(String[] args) {
		//Soda = parameter
		//Cup = method 
		
		
		//Soda is a vague name for what we want in it, in Java you do have to specify what data type you will be using 
		//in this instance we will use a String 
		
		//Cup is like the function because it is taking in the soda aka parameter inside and serving it. 
		
		//soda is the parameter, but something like "Cola", "Root beer", etc are arguments, you can remember this because 
		//people may argue about what is the best soda flavor. 
		
		sodaOrder("Orange Soda");
		
		setSodaOrder("Root Beer");
		
		setSodaOrder("Orange Soda");
		
		flavoredSodaOrder("starwberry cream", "Dr. P");
		
		setflavoredSodaOrder("Cherry", "PepCi");
		
		System.out.println();
		
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
	
	//A void returns nothing, it stops within the console, so it doesnt have any data to pass on to anything else 
	//so below are some examples of methods that return data and the benefits of that 
	public static String sodaOrderReturn(String soda) {
		return "I would like a " + soda;
	}
	
	
	//Example of it being set too 
	public static String setSodaOrderReturn(String soda) {
		soda = "Orange Soda";
		return "I would like a " + soda;
	}
	
	
	//With returns we can pass on the data to different methods to add to them. 
	public static String niceCustomer() {
		return " please and thank you";
	}
	
	
	//So with returns we will call the previously made methods to make it easier for us :) 
	public static String flavoredSodaOrderReturn(String flavor, String soda) {
		return sodaOrderReturn(soda) + ", " + flavor + " flavored " + niceCustomer();
	}
	
}
