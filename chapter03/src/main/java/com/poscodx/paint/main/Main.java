package com.poscodx.paint.main;

import com.poscodx.paint.i.Drawable;
import com.poscodx.paint.point.ColorPoint;
import com.poscodx.paint.shape.Circle;
import com.poscodx.paint.shape.Point;
import com.poscodx.paint.shape.Rect;
import com.poscodx.paint.shape.Shape;
import com.poscodx.paint.shape.Triangle;
import com.poscodx.paint.text.GraphicText;

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
		
		Circle circle = new Circle();
		// instanceof 연산자 test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		
//		  오류 : 연산자 우측항이 클래스인 경우,
//		  래퍼런스 하고 있는 class 타입의 hierachy 상의 하위만 상위만
//		  instance of 연산자를 사용할 수 있다.

// 		연산자 우측항이 인터페이스인 경우,
//		Hierachy 상관없이 instanceof 연산자를 사용할 수 있다
		System.out.println(circle instanceof Drawable);
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
