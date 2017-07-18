package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) throws IOException {
		double totalTime = 0;
		double HR_PRICE = .25;
		String summary;
		//just a test
		
		//end test
		//Start of read file by sean
			String filenameW;
			String filenameR = null;
			int numofprojects;
			Scanner keyboard=new Scanner(System.in);
			System.out.println("Please input what you want to do with the file, fully typed out.\n");
			String fileact=keyboard.nextLine(); //this is what the desired action for the file is do not panic
			if (fileact.equalsIgnoreCase("read")){ //tests if its read or write, and goes down code path for it
				 //prompts user for file name
				File file = null;
				System.out.println("\nPlease input the file name.\n");
				do {// checks to make sure that the file exists
				filenameR=keyboard.nextLine();//gets file name
				file = new File(filenameR.toLowerCase());//changes the text to lower case to resolve case errors
					
					if(!(file.exists())){
					System.out.println("This file title is invalid");	
					}
					System.out.println("\nPlease input the file name.\n");
				}while(!(file.exists()));
				String line = null;//initialize temp string
			    Scanner inputFile = new Scanner(file);//makes new scanner object for the file
			    while(inputFile.hasNext()){//while loop for while the file has more data
				      // Read the first line from the file.
				      line = inputFile.nextLine();//makes a temp string equal a line of text
				      int space = line.indexOf(' ');
				      summary = line.substring(space+1);
				      String numberOfLine = line.substring(0, space);
				      double entry = Double.parseDouble(numberOfLine);
				      totalTime += entry;
				      
				      // Display the line.
				      System.out.println("\n"+entry+" "+ summary);
				     
				      
				  }
			      // Close the file.
			      inputFile.close();//after file is done printing out, closes it
			      			System.out.println("Total time: "+ totalTime);
			
			System.out.println("Total cost: "+ finalCost(HR_PRICE, totalTime));
			      
			}
			else if (fileact.equalsIgnoreCase("write")){//for when the program is in write mode
				
				double time = 0;
				
				System.out.println("Please enter the file that you wish to edit");
				String outputFile = keyboard.nextLine();
				FileWriter editFile = new FileWriter(outputFile, true);
				PrintWriter outFile = new PrintWriter(editFile);
				System.out.println("Please enter the time: ");
				time = keyboard.nextDouble();
				System.out.println("Please enter the summary: ");
				Scanner kb = new Scanner(System.in);
				String summaryProject = kb.nextLine();
				outFile.println(time+" "+ summaryProject);
				
				outFile.close();
			}
			
		
		//closes and shuts down the program
		//End read file by Sean
		}

	public static double finalCost(double HR_PRICE, double totalTime){
		double finalCost = 0;
		finalCost = HR_PRICE * totalTime;
		return finalCost;
	}

}
