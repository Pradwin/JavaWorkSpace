package com.Pradwin;

import java.util.Scanner;

public class quiz {
public static void main(String args[]) {
	Scanner in =new Scanner(System.in);
	int score=0;
	int ans;
	int ch=0;
	System.out.println("********* To start enter 1 ******** \n");
	ch=in.nextInt();
	switch(ch) {
	case 1:System.out.println("Capital of India ?");
	       System.out.println("1) Delhi");
	       System.out.println("2) Mumbai");
	       System.out.println("3) Udupi");
	       System.out.println("4) Jaipur\n");
	       System.out.print("Enter your answer :");
	       ans=in.nextInt();
	        if(ans==1) {
	    	   score+=10;
	        }
	        else {
	        	System.out.println("Correct option is Delhi \n");
	        }
	case 2: System.out.println("God of Cricket ?");
            System.out.println("1) Dhoni");
            System.out.println("2) Virat");
            System.out.println("3) Sachin");
            System.out.println("4) Jadeja \n");
            System.out.print("Enter your answer :");
            ans=in.nextInt();
            if(ans==3) {
 	        score+=10;
             }
            else {
	        	System.out.println("Correct option is Sachin \n");
	        }
            System.out.println("Total Score is :"+score);
            
            
	}
	in.close();
}
}
