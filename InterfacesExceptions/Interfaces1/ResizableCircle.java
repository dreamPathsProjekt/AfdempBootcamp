/**
 *
 * @author dreamPathsProjekt
 */
public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
		
	}
	@Override
	public void resize(double percentage){
		super.setRadius((percentage/100)*super.getRadius());
	}
	public static void main(String[] args) {
		double radius=1.2;
		double percentage=50; //50%
		ResizableCircle rc1 = new ResizableCircle(radius);
		System.out.println("The Area of the created circle is: "+rc1.getArea());
		rc1.resize(percentage);
		System.out.println("The Area of the created circle resized by 50% is: "+rc1.getArea());
	}

}
