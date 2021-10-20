package fr.dauphine.javaAvancee.prevost.controller;


import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import fr.dauphine.javaAvancee.prevost.view.MyDisplay;


public class MouseController extends JFrame implements MouseMotionListener{
    
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	public void init() {
        this.addMouseMotionListener(this);
	}

	
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse location (" + e.getX() + ", " + e.getY() + ")");
        
    }
    
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse location (" + e.getX() + ", " + e.getY() + ")");
   
    	
	}

}
