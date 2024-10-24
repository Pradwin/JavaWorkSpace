package com.Pradwin;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		label.setText("Hello Boss");
		label.setForeground(Color.BLACK);
		label.setVerticalAlignment(JLabel.TOP);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0,0,200,200);
		redpanel.setLayout(new BorderLayout());
		redpanel.add(label);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(300,300,45,45);
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Pradwin");
		frame.setSize(420,420);
		frame.setLayout(null);   // To use the set Bounds else we have
		//to use borderlayout then setvertical and horizontal(alignment)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Default will only hide
//		frame.getContentPane().setBackground(Color.CYAN);
		frame.add(redpanel);
		frame.add(bluepanel);
	}

}
