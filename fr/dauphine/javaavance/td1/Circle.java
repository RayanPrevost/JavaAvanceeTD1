package fr.dauphine.javaavance.td1;

public class Circle {

	private Point center;
	private int radius;
	
	public Circle(Point p, int radius) {
		this.center = p;
		this.radius = radius;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,2);
		Circle cercle1 = new Circle(p,20);
		System.out.println(cercle1.toString());
		cercle1.translate(3, 3);
		System.out.println(cercle1.toString());
	}
	
	@Override
	public String toString() {
		return "Le cercle à un rayon de "+this.getRadius()+ " , Le centre du cercle est le point :"+this.getCenter().displayPoint();
	}

	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


}
