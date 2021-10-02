package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {

	private int x;
	private int y;
	

	
	private static void afficher() {
		Point p = new Point(2,6);
		System.out.println(p.getX()+" "+p.getY());
		
		Point p1 = new Point(1,6);
		Point p2 = p1;
		Point p3 = new Point(1,3);
		
		//System.out.println(p1==p2);
		//System.out.println(p1==p3);
		System.out.println(p1.isSameAs(p2));
		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afficher();
	}

}
