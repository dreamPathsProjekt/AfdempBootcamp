/**
 *
 * @author dreamPathsProjekt
 */
public class Shape implements Agreeable {
	private int width;
	private int height;
	
	public Shape(){
		
	}
	
	public Shape(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	public int calcArea(){
		return width*height;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean isSmallerThan(Agreeable other) {
		Shape otherShape = (Shape) other; //Cast to Shape type
		if (this.calcArea()<otherShape.calcArea()) return true;
		return false;
	}

}
