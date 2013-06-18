package com.ibm.javacore.threading.drawlines.painter;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	private List lines = Collections.synchronizedList(new LinkedList()); 
	public void paint(Graphics g) {
		super.paint(g);
		synchronized(this.lines) {
			for (Iterator i = this.lines.iterator(); i.hasNext(); ) {
				List points = (List) i.next(); 
				Point start = null; 
				Point end = null; 
				synchronized(points) {
					for (Iterator j = points.iterator(); j.hasNext(); ) {
						Point p = (Point) j.next(); 
						if (start == null) {
							start = p; 
							end = p; 
						} else {
							start = end; 
							end = p; 
						}
						g.drawLine(start.x, start.y, end.x, end.y); 
					}
				}
			}
		}
	}
	
	public void newLine(Point p) {
		synchronized(this.lines) {
			List points = new LinkedList(); 
			points.add(p); 
			this.lines.add(points); 
		}
	}
	
	public void addPoint(Point p) {
		synchronized(this.lines) {
			List points = (List) this.lines.get(this.lines.size() - 1); 
			points.add(p); 
		}
	}
	
	public void clear() {
		this.lines.clear(); 
		this.repaint(); 
	}
}
