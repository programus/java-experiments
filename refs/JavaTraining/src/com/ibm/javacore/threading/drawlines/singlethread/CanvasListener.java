package com.ibm.javacore.threading.drawlines.singlethread;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class CanvasListener extends MouseAdapter implements MouseMotionListener {
	private Point start; 
	private Point end; 
	public void mouseDragged(MouseEvent e) {
		JComponent canvas = (JComponent) e.getSource(); 
		Graphics g = canvas.getGraphics(); 
		end = e.getPoint(); 
		g.drawLine(start.x, start.y, end.x, end.y); 
		start = end; 
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		start = e.getPoint(); 
	}

	public void mouseReleased(MouseEvent e) {
		start = null; 
		end = null; 
	}

}
