package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10, 10);
//		point1.setX(10);
//		point1.setY(20);

		drawPoint(point1);

		// 업캐스팅
		Point point2 = new ColorPoint();

		// 다운캐스팅
		ColorPoint p = (ColorPoint) point2;
		p.setColor("red");
		drawColorPoint(p);

		Rect rect = new Rect();
		drawShape(rect);

		Triangle triangle = new Triangle();
		drawShape(triangle);
		drawShape(new Circle());
		draw(new GraphicText("Hello World"));

	}

	private static void draw(GraphicText graphicText) {
		// TODO Auto-generated method stub
		graphicText.draw();
	}

	public static void drawPoint(Point point) {
		point.show();
	}

	public static void drawColorPoint(Point colorPoint) {
		colorPoint.show();
	}

	public static void drawShape(Shape shape) {
		shape.draw();
	}

}
