package prob6;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getPerimeter() {
		return width * 2 + height * 2;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void resize(double s) {
		this.width = this.width * s;
		this.height = this.height * s;
	}

}
