package com.hxt.jframetest;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NotHelloWorldFrame();
			}
		});
	}
}
@SuppressWarnings("serial")
class SimpleFrame extends JFrame{
	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWidth = screenSize.width;
	int screenHeight = screenSize.height;
	
	public SimpleFrame(){
		setSize(screenWidth*2/3, screenHeight/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(screenWidth/4, screenHeight/3);
		setTitle("Hello Jframe");
	}
}