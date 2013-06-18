package com.ibm.javacore.threading.drawlines.painter;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class CanvasListener extends MouseAdapter implements MouseMotionListener {
	public void mouseDragged(MouseEvent e) {
		Canvas canvas = (Canvas) e.getSource(); 
		canvas.addPoint(e.getPoint()); 
		canvas.repaint(); 
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		Canvas canvas = (Canvas) e.getSource(); 
		canvas.newLine(e.getPoint()); 
	}
}
