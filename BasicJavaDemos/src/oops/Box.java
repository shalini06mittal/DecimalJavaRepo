package oops;
/**
 * template
 * blueprint
 * structure
 * user defined datatype => size is defined by the user
 */
public class Box {

	// access specifer
	// characteristics or attribute or properties or data members
	// dimensions
	private int width;
	private int height;
	private int length;
	
	public void setHeight(int h)
	{
		height = h * 10;
	}
	
	// parameters to methods and returnn type
	// member methods
	public void initialize(int l, int w, int h)
	{
		// Bl and secure your data
		length = l * 10;// 2/10 = 0.2
		width = w*10;
		height = h*10;
	}
//	public void calVolume()
//	{
//		System.out.println(length*width*height);
//	}
	
	public int calVolume()
	{
		return length*width*height;
	}
}
