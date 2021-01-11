package constructor;

public class LearnConstructor {
	
	// Constructor
	// Constructor name should be same as class name
	// Constructor has no return type
	// Constructor are used to initialize object
	
	// AccessModifier clasName () {}
	
	String stName;
	String stAddress;
	int stAge;
	String stPhoneNumber;
	double courseFee;
	
	public LearnConstructor() {
		// Default Constructor
		System.out.println("This is the default constructor");
		
		
//		int num1 = 50;
//		int num2 = 60;
//		int total = num1 + num2;
//		System.out.println("Total is " + total);
		
	}
		
	
	// Signature Pattern
	// Create parameter
	// With parameter its called Parameterized constructor
	
	// Single Parametized
	public LearnConstructor(String name) {
		System.out.println("Student name is " + name);
	}
	
	// Multi Parametized
	public LearnConstructor(String name, int age) {
		System.out.println("Student name is " + name + " age is " + age);
	}
	
	public LearnConstructor (String stAddress, String stName, String stPhoneNumber, int stAge, double courseFee) {
		
		this.stAddress = stAddress;
		this.stName = stName;
		this.stPhoneNumber = stPhoneNumber;
		this.stAge = stAge;
		this.courseFee = courseFee;
		
		System.out.println("Student name " + this.stName + " Address" + this.stAddress + " Phone Number " + this.stPhoneNumber + " Age is " + this.stAge + " Course Fee paid " + this.courseFee );
		
	}
	
	
	String pizzaName = "Dominos";
	
	public LearnConstructor(String stName, String stAddress) {
		this.stName = stName;
		this.stAddress = stAddress;
		System.out.println("Student name is " + this.stName + " Adress is " + this.stAddress);
		
		
		
	}
	
	public LearnConstructor(int courseFee) {
		this.courseFee = courseFee;
		
		double courseFeeAfterDiscount = this.courseFee*.9;
		System.out.println("Course fee after discount " + courseFeeAfterDiscount);
	}
	
	

	public static void main(String[] args) {
		
		// className objectName = new constructorOfClass();
		
		LearnConstructor learn = new LearnConstructor();
		
		LearnConstructor student = new LearnConstructor("Arthur"); // Argument passing
		LearnConstructor nasir = new LearnConstructor("Nasir"); 
		
		LearnConstructor aram = new LearnConstructor("Aram", 60); 
		
		LearnConstructor farha = new LearnConstructor("Dendoune Farha", "Jersey City, NJ");
		
		LearnConstructor ghania = new LearnConstructor("Queens, NY ", "Ghania", "2345678",34, 5000.99);
		
		LearnConstructor feez = new LearnConstructor(10000);


	}

}
