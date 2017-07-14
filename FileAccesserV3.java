package edu.unlv.is210.projectlab;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileAccesserV3 {

	public static void main(String[] args) throws IOException  {
		String filenameW;
		String filenameR = null;
		int numofprojects;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please input what you want to do with the file, fully typed out.\n");
		
		String fileact=keyboard.nextLine(); //this is what the desired action for the file is do not panic
		if (fileact.equalsIgnoreCase("read")){
			System.out.println("\nPlease input the file name.\n");
			filenameR=keyboard.nextLine();
			File file = new File(filenameR.toLowerCase());
			String line = null;
		    Scanner inputFile = new Scanner(file);
		    while(inputFile.hasNext()){
			      // Read the first line from the file.
			      line = inputFile.nextLine();
			      
			      // Display the line.
			      System.out.println("\n"+line);
			  }
		      // Close the file.
		      inputFile.close();
		}
		else if (fileact.equalsIgnoreCase("write")){
			
		}
		
		
		
		
	}			
}

