package com.hxt.jframetest;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new DrawFrame();
			}
		});
	}
}

class DrawFrame extends JFrame{
	public DrawFrame(){
		setTitle("DrawTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new DrawComponent());
		pack();
	}
}

class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D )g;
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);
		g2.draw(rect);
		
		
	}
	public Dimension getpreDimension(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}