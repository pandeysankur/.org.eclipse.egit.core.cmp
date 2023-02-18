package interfaces;
public class Easy_Geometry implements Geometry{
	public void rectangle_area(int height,int width) {
		int ar=height*width;
		System.out.println("Area of retangle::"+ar);
	}
	public void square_area(int side) {
		int ar=side*side;
		System.out.println("Area of Square::"+ar);
	}
	public void circal_area(float radius) {
		float ar=3.14f*radius*radius;
		System.out.println("Area of Circal::"+ar);
	}

}
