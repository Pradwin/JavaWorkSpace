package com.Pradwin;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file = new File("audio.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		String response = "";
		
		while(!response.toUpperCase().equals("Q")) {
			System.out.println("Enter s to stop and r to restart and p to play and q to quit:");
			response = scanner.next();
			response = response.toLowerCase();
			switch(response) {
			case ("s"):{
				clip.stop();
			}
			break;
			case ("p"):{
				clip.start();
			}
			break;
			case ("r"):{
				clip.setMicrosecondPosition(0);
			}
			break;
			case ("q"):{
				clip.close();
			}
			break;
			}
			
		}
		System.out.println("Byeee");
		
	}

}
