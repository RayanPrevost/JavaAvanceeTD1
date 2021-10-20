package fr.dauphine.javaAvancee.prevost.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.javaAvancee.prevost.controller.MouseController;
import fr.dauphine.javaAvancee.prevost.model.Circle;
import fr.dauphine.javaAvancee.prevost.model.Point;
import fr.dauphine.javaAvancee.prevost.model.Shape;

public class MyDisplay extends JPanel{
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.addMouseMotionListener(new MouseController());
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
		
				
		
		//frame.addMouseListener(l);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Point point1 = new Point(100,100);
		Point point3 = new Point(300,200);
		Circle circle = new Circle(point3,500);
		Shape point = new Point(250,200);
		
		circle.draw(g);
		point3.draw(g);
		point.draw(g);
		/*g.drawLine(point1.getX(),point1.getY(),point2.getX(),point2.getY());
		g.drawOval(circle.getCenter().getX(), circle.getCenter().getY(), circle.getRadius(), circle.getRadius());
		g.drawLine(0, 0, 100, 100);	
		g.drawOval(50, 50, 100, 100);*/
		
		
		
		
			
	}

}
