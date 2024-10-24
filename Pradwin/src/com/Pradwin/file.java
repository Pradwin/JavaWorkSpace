package com.Pradwin;
import java.io.File;
import java.util.*;

public class file {
	public static void main(String ars[]) {
		File file = new File("file3.txt");
		if (file.exists()) {
			System.out.println("Present");
		}
		
	}
}
