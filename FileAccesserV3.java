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
		if (fileact.equalsIgnoreCase("read")){ //tests if its read or write, and goes down code path for it
			System.out.println("\nPlease input the file name.\n"); //prompts user for file name
			filenameR=keyboard.nextLine();//gets file name
			File file = new File(filenameR.toLowerCase());//changes the text to lower case to resolve case errors
			String line = null;//initialize temp string
		    Scanner inputFile = new Scanner(file);//makes new scanner object for the file
		    while(inputFile.hasNext()){//while loop for while the file has more data
			      // Read the first line from the file.
			      line = inputFile.nextLine();//makes a temp string equal a line of text
			      
			      // Display the line.
			      System.out.println("\n"+line);
			  }
		      // Close the file.
		      inputFile.close();//after file is done printing out, closes it
		}
		else if (fileact.equalsIgnoreCase("write")){//for when the program is in write mode
			
		}
	System.exit(0);//closes and shuts down the program
	}			

}

