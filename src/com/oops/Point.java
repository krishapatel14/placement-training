package com.oops;

public class Point {
	float x;
	float y;
	public Point() {
		x=0.0f;
		y=0.0f;
		
	}
	public Point(float x) {
		this.x=x;
	}
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point(3.5f);
		Point p3=new Point(1.5f,3.4f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		
	}

}
