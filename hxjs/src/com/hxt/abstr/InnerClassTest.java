package com.hxt.abstr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(3000, true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval,boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer timer = new Timer(interval, listener);
		timer.start();
	}
	
	public class Timeprinter implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Date now = new Date();
			System.out.println("At the tone,the time is"+now);
			if(beep)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}