package com.poscodx.paint.shape;

import com.poscodx.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.\n");
	}

	public void disapear() {
		System.out.println("점[x=" + x + ",y=" + y + "]을 지웠습니다.\n");
	}

	@Override
	public void draw() {
		show();
	}

}
