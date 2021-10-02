package fr.dauphine.javaavance.td1;

//import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;



public class PolyLine {
	/*
	Point[] array;
	
	public PolyLine() {
		this.array = new Point[9];
	}
	
	public void add(Point p) {
		
		this.array = Arrays.copyOf(this.array, this.array.length + 1);
		System.out.println(this.array.length - 1);
		this.array[this.array.length - 1 ] = p;
	}
	
	public void displayArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.println(this.array[i]);
		}     		
	}
	
	public int pointCapacity(){
		return this.array.length;
	}
	public int nbPoints() {
		int res = 0;
		for (int i = 0; i < this.array.length; i++) {
			if(this.array[i] instanceof Point) {
				res++;
			}
			
		}
		return res;
	}
	
	public boolean contains(Point p) {
		boolean res = false;
		for (int i = 0; i < this.array.length; i++) {
			if(this.array[i] == p ) {
				res = true;
			}
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyLine polyline = new PolyLine();
		Point p = new Point(2,3);
		Point p2 = new Point(3,4);
		polyline.add(p);
		polyline.displayArray();
		System.out.println(polyline.pointCapacity());
		
		System.out.println(polyline.nbPoints());
		
		System.out.println(polyline.contains(p));
		System.out.println(polyline.contains(p2));
		
	}
	*/
	
	LinkedList<Point> list ;
	
	public PolyLine() {
		this.list = new LinkedList<Point>();
	}
	
	public void add(Point p){
		this.list.add(p);
	}
	/*public int pointCapacity() {
		
		
	}*/
	
	public int nbPoints() {
		return this.list.size();
	}
	
	
	public boolean contains(Point p) {
		return this.list.contains(p);
	}
	
	public void display() {
		Iterator<Point> iterator = this.list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		
		PolyLine polyline = new PolyLine();
		Point p = new Point(2,3);
		Point p2 = new Point(3,4);
		polyline.add(p);
		System.out.println(polyline.nbPoints());
		System.out.println(polyline.contains(p));
		System.out.println(polyline.contains(p2));
		polyline.add(p2);
		System.out.println(polyline.contains(p2));
		polyline.display();
		
	}

}
