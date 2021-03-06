package oops;

public class BoxObjectTest {
/**
 * Rules for overloading
 * 1) 2 methods with same but different :
 * 	i) number of parameters
 * 	ii) type of parameters
 * 	iii) sequence of parameters
 * is method/ constructor overloading.
 * CHANGING RETURN TYPE OR ACCESS SPECIFIER IS NOT OVERLOADING
 * @param args
 */
	public static void main(int[] args) {
		System.out.println("main with int");
		
	}
	public static void main(double d1) {
		System.out.println("main with doubled");
		
	}
	public static void main(String[] args) {
		
		main(10);
		main(2.2);
		main(new int[] {1,2,3,4,5});
		
		BoxObject ob1 = new BoxObject();
		//ob1.BoxObject();
		//oops.BoxObject@5e265ba4
		//5e265ba4 =>hashcode [alias for mem location]
		System.out.println(ob1);
		System.out.println(ob1.calVolume());
		ob1.BoxObject();

		BoxObject ob2 = new BoxObject(3,4,5);
		System.out.println(ob2.calVolume());
		
		System.out.println(2+2);//4
		System.out.println(2.2+2.2);//4.4
		System.out.println('a'+'b');//ab
		System.out.println("hello"+" there");//hello there
	}
}
