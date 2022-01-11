
package ch3Package;

public class Account { //public-access modifier
	//class begins with uppercase
	//methods&variables begin with lowercase
	//3.2 INSTANCE VARIABLES, SET METHODS AND GET METHODS
			/*
			 * we will create two classes: 
			 ** Account --contains two methods (setName stores a name in an Account object and getMethod obtains a name from an Account object)
			 ** AccountTest --is an application class in which the main method will create and use an Account object 
			 */
	private String name; //instance variable
	//Instance variables exist before methods are called on an object
	//Instance variables are dclared inside a class declaration but outside the bodies of the class's methods
	//The best way is to list all class'instance variables first in the class's body before methods
	/*private is an access modifier. 
	*Variables or methods declared with access modifier private are accessible only to methods of the class so, the variable name can be used only in each Account object's methods (setName&getName)
	*/
	
	public Account(String name) {//constructor initializes name with parameter name
		this.name = name;
	}
	//a constructor must have the same name as the class
	// a constructor can not return values not even "void"
	
	//method to set the name in the object
	public void setName(String name) { //This line is the method header
		//void--indicates that setName will perform a task but will not return any info
		//method setName--receives parameter name of type String which represents the name that will be passed to the method as an "argument"
		//(String name) --parameter each parameter must specify a type followed by a variable name type"String" variable name "name"
		this.name =  name; //store the name
	}
	
	//method to retrieve the name from the object
	public String getName() { //String-- return  a String this method specifies a return type 
		return name; //return value of name to caller
	}

}
