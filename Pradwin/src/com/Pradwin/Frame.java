package com.Pradwin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Border border = BorderFactory.createLineBorder(Color.green,3);
//		JLabel label = new JLabel();
//		label.setText("Hello Boss");
//		label.setHorizontalTextPosition(JLabel.CENTER);
//		label.setVerticalTextPosition(JLabel.TOP);
//		label.setForeground(Color.green);
//		label.setFont(new Font("MV boli",Font.ITALIC,100));
//		label.setBorder(border);
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Pradwin");
//		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Default will only hide
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayeredPane(null);
		frame.setResizable(false);
//		frame.add(label);
		frame.pack();
		//or
		//frame.getContentPane().setBackground(new Color(123,50,250);
		// For logo
		//ImageIcon image = new ImageIcon("logo.png");
		//frame.setIconImage(image.getImage());
	}

}
