/**
 *
 * @author dreamPathsProjekt
 */
public class TestAgreeableShape {

	public static void main(String[] args) {
		Shape shape1= new Shape(100,20);
		Shape shape2= new Shape(50,50);
		
		if(shape2.isSmallerThan(shape1)) System.out.println("shape 2 is smaller than shape 1");
		else System.out.println("shape 2 is bigger than shape 1");
	}

}
