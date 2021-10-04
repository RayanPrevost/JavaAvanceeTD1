package fr.dauphine.javaavance.td1;

public class Circle {

	private final Point center;
	private int radius;
	
	public Circle(Point p, int radius) {
		this.center = new Point(p.getX(),p.getY());
		this.radius = radius;
				
	}
	
	public static void main(String[] args) {
		Point p = new Point(1,2); 
		Circle c = new Circle(p,1);
		Circle c2 = new Circle(p,5);
		c2.translate(1,1);
		System.out.println(c);
		System.out.println(c2);	
	}
	
	private Point getCenter() {
		// TODO Auto-generated method stub
		return this.center;
	}

	@Override
	public String toString() {
		String res = "Le cercle à un rayon de "+this.getRadius()+ " , Le centre du cercle est le point : "+this.center.displayPoint();
		res += " L'air de ce cercle est "+ this.area()+" cm^2";
		return res;
	}

	
	public void translate(int dx, int dy) {
		Point copy_point = new Point(this.center.getX(),this.center.getY());
		this.center.setX(copy_point.getX()+dx);
		this.center.setY(copy_point.getY()+dy);
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		double res = Math.PI*this.getRadius()*this.getRadius(); 
		return res;
	}
	
	public boolean contains(Point p) {
		boolean res = false;
		return res;
	}

	public boolean contains(Point p, Circle...circles) {
		boolean res = false;
		return res;
	}

}
