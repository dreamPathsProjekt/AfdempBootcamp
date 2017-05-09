/**
 *
 * @author dreamPathsProjekt
 */
public class Circle implements Shape{
	protected double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
}
