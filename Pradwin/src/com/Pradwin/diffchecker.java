package com.Pradwin;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class diffchecker {
	public static void check(File f1, File f2) throws IOException {
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(f2);
		
		int line=1;
		while(sc1.hasNextLine()&& sc2.hasNextLine())
		{
			String line1=sc1.nextLine();
			String line2=sc2.nextLine();
			if(line1.equals(line2))
			{
				line++;
			}
			else {
				String[] text1=line1.split(" ");
				String[] text2=line2.split(" ");
				for(int i=0;i<text1.length;i++)
				{
					
					if(text1[i].equals(text2[i])) {
					continue;
					}
					else {
						System.out.println("Line : "+line+" word : "+i+" "+text1[i]+" "+text2[i]);					}
				}
				line++;
			}
		}
		sc1.close();
		sc2.close();
	}
	public static void main (String[] args) throws IOException
	{
		File f1= new File("file3.txt");
		File f2= new File("file4.txt");
		
		
		check(f1, f2);
	}

}