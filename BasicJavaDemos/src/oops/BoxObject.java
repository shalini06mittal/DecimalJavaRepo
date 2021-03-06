package oops;

public class BoxObject {

	private int length;
	private int height;
	private int width;
	/**
	 * 1) they are special methods with the name same as class name
	 * 2) they do not have a return type
	 * 3) they are used to initialize the data members of the class
	 * 4) they cannot be invoked using the dot operator
	 * 5) they are invoked automatically when the object of the class is created
	 * 		i.e when you say new
	 * 6) since they are methods they can take parameters 
	 */
	// implicit default constructor which is created automatically
	// if no constructors are created by the developer
	public BoxObject()// explicit default constructor cz it takes no parameters
	{
		System.out.println("Box object created");
		length = 2;
		height = 3;
		width = 4;
		
	}
	void BoxObject()// if method name is same as class name with return type
	// it is a normal method
	{

		System.out.println("Box method called");
		
	}
	public BoxObject(int l, int w, int h)// explicit parameterized constructor cz it takes  parameters
	{
		System.out.println("Box object created with user values");
		length = l;
		height = h;
		width = w;
		
	}
	public int calVolume()
	{
		return length*width*height;
	}
	
}
