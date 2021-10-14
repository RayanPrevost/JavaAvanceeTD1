package fr.dauphine.javaAvancee.prevost.model;

public class Ring {
	
	private Circle circle;
	private int radiusInterne;

	public Ring(Point p, int radius, int radiusInterne) {
			if(radius > radiusInterne) {
				this.circle = new Circle(p,radius);
				this.radiusInterne = radiusInterne;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,1);
		Ring ring = new Ring(p,2,3);
		
	}
	@Override
	public boolean equals(Object obj) {
		Ring ring = (Ring)obj;
		return ring.circle.equals(this.circle) && ring.radiusInterne == this.radiusInterne;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return circle.toString()+" Radius interne :  "+this.radiusInterne;
	}

	public boolean contains(Point p) {
		return (Math.pow(Math.sqrt(circle.getCenter().getX() - p.getX()), 2) + Math.pow(Math.sqrt(circle.getCenter().getY() - p.getY()), 2)) < Math.pow(radiusInterne, 2);
	}
	
	public boolean contains(Point p, Ring...rings) {
		for(Ring r : rings)
			if(r.contains(p))
				return true;
		return false;
	}
}
