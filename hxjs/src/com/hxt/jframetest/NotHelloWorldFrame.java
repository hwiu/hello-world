package com.hxt.jframetest;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class NotHelloWorldFrame extends JFrame {
	public NotHelloWorldFrame(){
		add(new NotHelloWorldComponent());
		setTitle("NotHelloWorld");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class NotHelloWorldComponent extends JComponent{
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g){
		g.drawString("Not a hello world Program!",MESSAGE_X,MESSAGE_Y);
	}
	public Dimension getPreferredsizeDimension(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}