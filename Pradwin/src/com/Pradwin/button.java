package com.Pradwin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class button extends JFrame implements ActionListener{
	JButton butt;
	JLabel label;
	button(){
		label = new JLabel();
		label.setText("Hello Guys");
		label.setVisible(false);
		label.setBounds(300, 300, 100, 100);
		butt = new JButton();
		butt.setBounds(10, 10, 100, 100);
		butt.setText("Button");
		butt.addActionListener(this);
//		butt.addActionListnener(e -> System.out.print("POP"));
		butt.setFocusable(false);
		this.setVisible(true);
		this.setTitle("Pradwin");
		this.setSize(420,420);
		this.setLayout(null);   // To use the set Bounds else we have
		//to use borderlayout then setvertical and horizontal(alignment)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.add(butt);
		this.add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == butt) {
			label.setVisible(true);
			System.out.println("hello?");
		}
	}
}
