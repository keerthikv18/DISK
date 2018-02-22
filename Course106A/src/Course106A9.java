import java.util.ArrayList;
import java.util.List;

public class Course106A9 {

	// a piece of text. sequence of characters.
	int age = 30;
	private String fields = "name:[" + "keerthi" + "]" + "age:[" + age + "]";
	///////////////////// Strings END //////////////////////

	/*
	 * public class subClass extends superClass{ 
	 * //variables 
	 * //methods both have visibility 
	 * }
	 */
	
	// subClass.java and subClass.class
	// package: set of classes grouped together
	/*
	 * public: export outside class 
	 * private: contain within class
	 */
	
	//Constructor: create new instance/object. initialize everything that goes way with this object
	public Course106A9(int startMinute){
		this.counter = startMinute;	
	}
	public Course106A9(){
		this(0);
	}
	//instance variables
	private int counter;
	//return the present counter value and increments the counter value
	//local variable
	public int nextCounter() {
		int temp = counter;
		counter++;
		return temp;
	}
	
	//shadow: when any variable is used. first look for any variable is there 
	//in local variable then check for instance variable.
	
	//passing object as parameters in method call is pass by reference.
	//meaning in other words: object itself is passed
	///////////////////// Class END //////////////////////
	
	//class variables: one variable shared by all the class/objects
	private static List classVariable = new ArrayList<>();
	
	//can be called inside class, as constructor is private
	private static Course106A9 instance = new Course106A9();
	/*private Course106A9() {
	}*/
	
	public static Course106A9 getInstance() {
		return instance;
	}
	//Course106A9.getInstance();
	///////////////////// Class VARIABLES //////////////////////
	
	//java doc system - generate html pages explaining what does the class/code does
	//special tag- @param specifies the parameters description, @results does it for returns type
	// <tag> @param <name> parameterOne <description> this is parameter one
	
}
