package com.ibm.javacore.threading.drawlines.multithread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawFrame extends JFrame {

	public DrawFrame() throws HeadlessException {
		super();
		this.initComponents(); 
	}
	
	private void initComponents() {
		Container rootContainer = this.getContentPane(); 
		rootContainer.setLayout(new BorderLayout()); 
		final JPanel canvas = new JPanel(); 
		canvas.setPreferredSize(new Dimension(400, 200)); 
		rootContainer.add(canvas, BorderLayout.CENTER); 
		JPanel buttonBar = new JPanel(new GridLayout(1, 2)); 
		rootContainer.add(buttonBar, BorderLayout.SOUTH); 
		final JButton drawButton = new JButton("Draw"); 
		final JButton clearButton = new JButton("Clear"); 
		buttonBar.add(drawButton); 
		buttonBar.add(clearButton); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.validate(); 
		this.pack(); 
		this.setLocationRelativeTo(null); 
		
		// setup canvas. 
		CanvasListener listener = new CanvasListener(); 
		canvas.addMouseListener(listener); 
		canvas.addMouseMotionListener(listener); 
		
		// setup buttons. 
		drawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawFrame.this.drawLines(canvas); 
			}
		}); 
		
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.getGraphics().clearRect(0, 0, 
						canvas.getSize().width, canvas.getSize().height); 
			}
		}); 
	}
	
	private void drawLines(final JComponent canvas) {
		final Dimension size = canvas.getSize(); 
		int unit = size.height / 5; 
		for (int i = 0; i < size.height; i += unit) {
			final int y = i; 
			new Thread(new Runnable() {
				public void run() {
					drawLine(canvas, size.width, y); 
				}
			}).start(); 
		}
	}
	
	private void drawLine(JComponent canvas, int width, int y) {
		Graphics g = canvas.getGraphics(); 
		for (int x = 0; x < width; x++) {
			g.drawRect(x, y, 1, 1); 
			this.delay(1); 
		}
	}
	
	private void delay(long ms) {
		long start = Calendar.getInstance().getTimeInMillis(); 
		while (Calendar.getInstance().getTimeInMillis() < start + ms); 
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DrawFrame().setVisible(true); 
			}
		}); 
	}
}
