package com.Pradwin;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Whats your name? ");
		JOptionPane.showMessageDialog(null, name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Whats your age? "));
		JOptionPane.showMessageDialog(null, age);
	}

}
