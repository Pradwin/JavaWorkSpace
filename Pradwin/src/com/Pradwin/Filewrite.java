package com.Pradwin;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	public static void main(String args[]) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Hello from the other side");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
