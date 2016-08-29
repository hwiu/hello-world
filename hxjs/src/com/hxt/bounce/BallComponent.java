package com.hxt.bounce;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

class BallComponent extends JPanel{
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 350;
	
	private ArrayList<Ball>  balls = new ArrayList<Ball>();
	
	public void add(Ball b){
		balls.add(b);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		for(Ball b:balls){
			g2.fill(b.getShape());
		}
	}
	public Dimension getPreferredSize(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}
