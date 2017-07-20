package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FinalProject extends JFrame {
	double finalCost = 0;
	private JPanel contentPane;
	private JPanel MainNewOrOldpanel;
	private JPanel EditProjectspanel;
	private JPanel EditProject2panel;
	private JPanel ShowProjectspanel;
	private JPanel NewProjectpanel;
	private JLabel lblNewProjectTitle;
	private JTextField txtNewProjectField;
	private JLabel lblEditProjectsTitle;
	private JLabel lblEditProjectsInstructions;
	private JTextField txtEditProjectsField;
	private JButton btnEditProjectsCancel;
	private JButton btnEditProjectsOK;
	private JButton btnMainMenuExit;
	private JButton btnView;
	private JButton btnEditProjects;
	private JButton btnNewProject;
	private JButton btnNewProjectCancel;
	private JButton btnNewProjectOK;
	private JLabel lblNewProjectInstructions;
	private JLabel lblShowProjectTitle;
	private JLabel lblShowProjectInstructions;
	private JTextField txtShowProjectField;
	private JButton btnShowProjectCancel;
	private JButton btnShowProjectOk;
	
	//user variables
	double totalTime = 0;
	final double HR_PRICE = 25;
	String summary;
	String filenameW;
	String filenameR = null;
	int numofprojects;
	private JPanel FileCreatedpanel;
	private JLabel lblFileCreated;
	private JButton btnFileCreatedOk;
	private JTextField txtEditProjectsHoursField;
	private JButton btnEditProjectsSave;
	private JButton btnEditProjects2Cancel;
	private JLabel lblEditProjects2Instructions;
	private JLabel lblEditProjects2Instructions2;
	private JLabel lblEditProjects2Title;
	private JLabel lblEditProjectsError;
	private JPanel ShowProjectDetailspanel;
	private JLabel lblTotalHoursWorkedTitle;
	private JLabel lblTotalHoursWorked;
	private JLabel lblTotalCostTitle;
	private JLabel lblTotalCost;
	private JTextArea txtProjectSummaries;
	private JLabel lblSummaries;
	private JScrollPane scrollPane;
	private JLabel label;
	private JLabel lblShowProjectError;
	private JTextArea txtEditProjectsSummaryField;
	private JScrollPane scrollPane_1;
	private JLabel lblNewProjectError;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalProject frame = new FinalProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinalProject() {
		setTitle("Client Billing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		MainNewOrOldpanel = new JPanel();
		contentPane.add(MainNewOrOldpanel, "name_12021900885688");
		MainNewOrOldpanel.setLayout(null);
		
		JLabel lblClientBilling = new JLabel("Client Billing");
		lblClientBilling.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClientBilling.setBounds(157, 11, 109, 34);
		MainNewOrOldpanel.add(lblClientBilling);
		
		btnMainMenuExit = new JButton("Exit");
		btnMainMenuExit.addActionListener(new BtnCancelActionListener());
		btnMainMenuExit.setBounds(325, 217, 89, 23);
		MainNewOrOldpanel.add(btnMainMenuExit);
		
		btnView = new JButton("Show Projects");
		btnView.addActionListener(new BtnViewActionListener());
		btnView.setBounds(287, 183, 127, 23);
		MainNewOrOldpanel.add(btnView);
		
		btnEditProjects = new JButton("Edit Projects");
		btnEditProjects.addActionListener(new BtnEditProjectsActionListener());
		btnEditProjects.setBounds(157, 183, 107, 23);
		MainNewOrOldpanel.add(btnEditProjects);
		
		btnNewProject = new JButton("New Project");
		btnNewProject.addActionListener(new BtnNewProjectActionListener());
		btnNewProject.setBounds(24, 183, 107, 23);
		MainNewOrOldpanel.add(btnNewProject);
		
		NewProjectpanel = new JPanel();
		contentPane.add(NewProjectpanel, "name_12332465728444");
		NewProjectpanel.setLayout(null);
		
		lblNewProjectTitle = new JLabel("New Project");
		lblNewProjectTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewProjectTitle.setBounds(156, 11, 133, 34);
		NewProjectpanel.add(lblNewProjectTitle);
		
		txtNewProjectField = new JTextField();
		txtNewProjectField.setBounds(43, 175, 334, 20);
		NewProjectpanel.add(txtNewProjectField);
		txtNewProjectField.setColumns(10);
		
		lblNewProjectInstructions = new JLabel("Please enter the name for the new project");
		lblNewProjectInstructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewProjectInstructions.setBounds(74, 56, 290, 77);
		NewProjectpanel.add(lblNewProjectInstructions);
		
		btnNewProjectOK = new JButton("OK");
		btnNewProjectOK.addActionListener(new BtnNewProjectOKActionListener());
		btnNewProjectOK.setBounds(43, 217, 89, 23);
		NewProjectpanel.add(btnNewProjectOK);
		
		btnNewProjectCancel = new JButton("Cancel");
		btnNewProjectCancel.addActionListener(new BtnNewProjectCancel());
		btnNewProjectCancel.setBounds(288, 217, 89, 23);
		NewProjectpanel.add(btnNewProjectCancel);
		
		lblNewProjectError = new JLabel("");
		lblNewProjectError.setBounds(84, 123, 268, 37);
		NewProjectpanel.add(lblNewProjectError);
		
		EditProject2panel = new JPanel();
		contentPane.add(EditProject2panel, "name_12021909158169");
		EditProject2panel.setLayout(null);
		
		lblEditProjects2Instructions = new JLabel("Enter summary of progress on project");
		lblEditProjects2Instructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditProjects2Instructions.setBounds(94, 37, 267, 26);
		EditProject2panel.add(lblEditProjects2Instructions);
		
		lblEditProjects2Title = new JLabel("Edit Projects");
		lblEditProjects2Title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEditProjects2Title.setBounds(156, 11, 141, 31);
		EditProject2panel.add(lblEditProjects2Title);
		
		lblEditProjects2Instructions2 = new JLabel("Enter number of hours spent on project");
		lblEditProjects2Instructions2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditProjects2Instructions2.setBounds(82, 158, 313, 26);
		EditProject2panel.add(lblEditProjects2Instructions2);
		
		txtEditProjectsHoursField = new JTextField();
		txtEditProjectsHoursField.setBounds(169, 183, 86, 20);
		EditProject2panel.add(txtEditProjectsHoursField);
		txtEditProjectsHoursField.setColumns(10);
		
		btnEditProjectsSave = new JButton("Save");
		btnEditProjectsSave.addActionListener(new BtnEditProjectsSaveActionListener());
		btnEditProjectsSave.setBounds(82, 217, 89, 23);
		EditProject2panel.add(btnEditProjectsSave);
		
		btnEditProjects2Cancel = new JButton("Cancel");
		btnEditProjects2Cancel.addActionListener(new BtnEditProjects2CancelActionListener ());
		btnEditProjects2Cancel.setBounds(272, 217, 89, 23);
		EditProject2panel.add(btnEditProjects2Cancel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(104, 61, 231, 89);
		EditProject2panel.add(scrollPane_1);
		
		txtEditProjectsSummaryField = new JTextArea();
		txtEditProjectsSummaryField.setWrapStyleWord(true);
		txtEditProjectsSummaryField.setLineWrap(true);
		scrollPane_1.setViewportView(txtEditProjectsSummaryField);
		
		EditProjectspanel = new JPanel();
		contentPane.add(EditProjectspanel, "name_12021918431618");
		EditProjectspanel.setLayout(null);
		
		lblEditProjectsTitle = new JLabel("Edit Projects");
		lblEditProjectsTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEditProjectsTitle.setBounds(153, 11, 142, 46);
		EditProjectspanel.add(lblEditProjectsTitle);
		
		lblEditProjectsInstructions = new JLabel("Please enter the name of the project you would like to edit");
		lblEditProjectsInstructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditProjectsInstructions.setBounds(22, 52, 402, 65);
		EditProjectspanel.add(lblEditProjectsInstructions);
		
		txtEditProjectsField = new JTextField();
		txtEditProjectsField.setBounds(43, 175, 334, 20);
		EditProjectspanel.add(txtEditProjectsField);
		txtEditProjectsField.setColumns(10);
		
		btnEditProjectsCancel = new JButton("Cancel");
		btnEditProjectsCancel.addActionListener(new BtnEditProjectCancel());
		btnEditProjectsCancel.setBounds(288, 217, 89, 23);
		EditProjectspanel.add(btnEditProjectsCancel);
		
		btnEditProjectsOK = new JButton("OK");
		btnEditProjectsOK.addActionListener(new BtnEditProjectsOKActionListener());
		btnEditProjectsOK.setBounds(43, 217, 89, 23);
		EditProjectspanel.add(btnEditProjectsOK);
		
		lblEditProjectsError = new JLabel("");
		lblEditProjectsError.setBounds(81, 128, 277, 33);
		EditProjectspanel.add(lblEditProjectsError);
		
		ShowProjectspanel = new JPanel();
		contentPane.add(ShowProjectspanel, "name_12021926378693");
		ShowProjectspanel.setLayout(null);
		
		lblShowProjectTitle = new JLabel("Show Project");
		lblShowProjectTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblShowProjectTitle.setBounds(153, 0, 133, 61);
		ShowProjectspanel.add(lblShowProjectTitle);
		
		lblShowProjectInstructions = new JLabel("Please enter the name of the project you would like to view");
		lblShowProjectInstructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowProjectInstructions.setBounds(22, 11, 392, 97);
		ShowProjectspanel.add(lblShowProjectInstructions);
		
		txtShowProjectField = new JTextField();
		txtShowProjectField.setBounds(43, 175, 334, 20);
		ShowProjectspanel.add(txtShowProjectField);
		txtShowProjectField.setColumns(10);
		
		btnShowProjectCancel = new JButton("Cancel");
		btnShowProjectCancel.addActionListener(new BtnShowProjectsCancel ());
		btnShowProjectCancel.setBounds(288, 217, 89, 23);
		ShowProjectspanel.add(btnShowProjectCancel);
		
		btnShowProjectOk = new JButton("OK");
		btnShowProjectOk.addActionListener(new BtnShowProjectOkActionListener());
		btnShowProjectOk.setBounds(43, 217, 89, 23);
		ShowProjectspanel.add(btnShowProjectOk);
		
		lblShowProjectError = new JLabel("");
		lblShowProjectError.setBounds(79, 144, 313, 20);
		ShowProjectspanel.add(lblShowProjectError);
		
		FileCreatedpanel = new JPanel();
		contentPane.add(FileCreatedpanel, "name_15421725375370");
		FileCreatedpanel.setLayout(null);
		
		lblFileCreated = new JLabel("File Created!");
		lblFileCreated.setBounds(157, 74, 201, 79);
		lblFileCreated.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FileCreatedpanel.add(lblFileCreated);
		
		btnFileCreatedOk = new JButton("OK");
		btnFileCreatedOk.addActionListener(new BtnFileCreatedOkActionListener());
		btnFileCreatedOk.setBounds(167, 164, 89, 23);
		FileCreatedpanel.add(btnFileCreatedOk);
		
		ShowProjectDetailspanel = new JPanel();
		contentPane.add(ShowProjectDetailspanel, "name_809994222085");
		ShowProjectDetailspanel.setLayout(null);
		
		lblTotalHoursWorkedTitle = new JLabel("Total Hours Worked on Project");
		lblTotalHoursWorkedTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalHoursWorkedTitle.setBounds(201, 11, 244, 66);
		ShowProjectDetailspanel.add(lblTotalHoursWorkedTitle);
		
		lblTotalHoursWorked = new JLabel("");
		lblTotalHoursWorked.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalHoursWorked.setBounds(289, 72, 95, 24);
		ShowProjectDetailspanel.add(lblTotalHoursWorked);
		
		lblTotalCostTitle = new JLabel("Total Cost");
		lblTotalCostTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalCostTitle.setBounds(254, 143, 118, 14);
		ShowProjectDetailspanel.add(lblTotalCostTitle);
		
		lblTotalCost = new JLabel("");
		lblTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalCost.setBounds(269, 168, 95, 24);
		ShowProjectDetailspanel.add(lblTotalCost);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new BtnMainMenuActionListener());
		btnMainMenu.setBounds(314, 228, 110, 23);
		ShowProjectDetailspanel.add(btnMainMenu);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 181, 217);
		ShowProjectDetailspanel.add(scrollPane);
		
		txtProjectSummaries = new JTextArea();
		txtProjectSummaries.setEditable(false);
		txtProjectSummaries.setWrapStyleWord(true);
		txtProjectSummaries.setLineWrap(true);
		scrollPane.setViewportView(txtProjectSummaries);
		
		lblSummaries = new JLabel("Summaries");
		lblSummaries.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSummaries.setBounds(48, 11, 129, 24);
		ShowProjectDetailspanel.add(lblSummaries);
		
		label = new JLabel("");
		label.setBounds(223, 226, 46, 14);
		ShowProjectDetailspanel.add(label);
	}

	private class BtnCancelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class BtnNewProjectCancel implements ActionListener {//This will reset the text in the Lable and text window
		public void actionPerformed(ActionEvent e) {
			txtNewProjectField.setText("");
			lblNewProjectError.setText("");
			MainNewOrOldpanel.setVisible(true);
			NewProjectpanel.setVisible(false);
		}
	}
	private class BtnNewProjectActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainNewOrOldpanel.setVisible(false);
			NewProjectpanel.setVisible(true);
		}
	}
	private class BtnEditProjectCancel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtEditProjectsField.setText("");
			lblEditProjectsError.setText("");
			MainNewOrOldpanel.setVisible(true);
			EditProjectspanel.setVisible(false);
			}
	}
	private class BtnEditProjectsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainNewOrOldpanel.setVisible(false);
			EditProjectspanel.setVisible(true);
		}
	}
	private class BtnShowProjectsCancel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtShowProjectField.setText("");
			lblShowProjectError.setText("");
			ShowProjectspanel.setVisible(false);
			MainNewOrOldpanel.setVisible(true);
		}
	}
	private class BtnViewActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainNewOrOldpanel.setVisible(false);
			ShowProjectspanel.setVisible(true);
		}
	}
	private class BtnNewProjectOKActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			
			String outputFile = txtNewProjectField.getText()+".txt";
			File file = new File(outputFile);
			if(outputFile.equals(".txt")){
				lblNewProjectError.setText("ERROR: Please enter a file name");
				System.out.println("HERE");
			}
			
			
			else if((file.exists())){
				lblNewProjectError.setText("ERROR: file already exists. Please enter again.");
				
				
				}
				else{
					FileCreatedpanel.setVisible(true);
					NewProjectpanel.setVisible(false);
					
			FileWriter editFile;
			try {
				
				editFile = new FileWriter(outputFile, true);// makes sure to not erase the information present in the file
				PrintWriter outFile = new PrintWriter(editFile);
				outFile.close();// closes the open file
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txtNewProjectField.setText("");// this clears any entry in text and label
			lblNewProjectError.setText("");
				}
		}
	}
	private class BtnFileCreatedOkActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainNewOrOldpanel.setVisible(true);
			FileCreatedpanel.setVisible(false);
			
		}
	}
	private class BtnEditProjectsOKActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			
			String outputFile = txtEditProjectsField.getText()+".txt";
			File file = null;
			file = new File(outputFile);
			
			if(outputFile.equals(".txt")){
				lblEditProjectsError.setText("ERROR: Please enter a file name");
				System.out.println("HERE");
			}
			
			
			else if(!(file.exists())){
			lblEditProjectsError.setText("ERROR: file does not exist. Please enter again.");
			
			
			}
			else{
				
				lblEditProjectsError.setText("");
				EditProjectspanel.setVisible(false);
				EditProject2panel.setVisible(true);
			}
		}
	}
	private class BtnEditProjectsSaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainNewOrOldpanel.setVisible(true);
			EditProject2panel.setVisible(false);
			//user input variables
			double time = 0;
			String str;
			
			//gets the input for time
			str = txtEditProjectsHoursField.getText();
			time = Double.parseDouble(str);
			
			
			String summaryProject = txtEditProjectsSummaryField.getText();
			String outputFile = txtEditProjectsField.getText()+".txt";
			
			//opens the file
			FileWriter editFile;
			try {
				
				editFile = new FileWriter(outputFile, true);
				PrintWriter outFile = new PrintWriter(editFile);
				outFile.println(time+" "+ summaryProject);
				
				
				outFile.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
			txtEditProjectsField.setText("");
			txtEditProjectsSummaryField.setText("");
			txtEditProjectsHoursField.setText("");
		}	
		}
	
	private class BtnEditProjects2CancelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtEditProjectsField.setText("");
			txtEditProjectsSummaryField.setText("");
			txtEditProjectsHoursField.setText("");
			MainNewOrOldpanel.setVisible(true);
			EditProject2panel.setVisible(false);
		}
	}
	private class BtnMainMenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblTotalCost.setText("");
			txtProjectSummaries.setText("");
			MainNewOrOldpanel.setVisible(true);
			ShowProjectDetailspanel.setVisible(false);
			
		}
	}
	private class BtnShowProjectOkActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String filenameR = null;
			int numofprojects;
			
			
				File file = null;
				
				filenameR = txtShowProjectField.getText()+".txt";
				file = new File(filenameR.toLowerCase());
				
				if(filenameR.equals(".txt")){// this if statement will check to make sure that the user input for file is reasonable
					lblShowProjectError.setText("ERROR: Please enter a file name");
					System.out.println("HERE");
				}
				
				
				else if(!(file.exists())){
					lblShowProjectError.setText("ERROR: file does not exist. Please enter again.");
					
					
					}
					else{
						ShowProjectDetailspanel.setVisible(true);
						ShowProjectspanel.setVisible(false);
						file = new File(filenameR.toLowerCase());
						String line = null;//initialize temp string
					    Scanner inputFile;
					    
						try {
							inputFile = new Scanner(file);
							int number = 0;
							double totalTime=0;
							 while(inputFile.hasNext()){//while loop for while the file has more data
							      // Read the first line from the file.
							      line = inputFile.nextLine();//makes a temp string equal a line of text
							      int space = line.indexOf(' ');// creates and index for a space in between the number and the summary
							      String summary = line.substring(space+1);// reads the summary
							      
							      String numberOfLine = line.substring(0, space);// reads the number of hours
							      double entry = Double.parseDouble(numberOfLine);
							      totalTime += entry;// keeps adding the time from each line
							      DecimalFormat hrsfm = new DecimalFormat("#.0");// sets up a decimal format for time
							      lblTotalHoursWorked.setText(hrsfm.format(totalTime)+"");// displays the total time
							   
							      number++;// this will help the user keep track of the summaries and makes sure they do not blend by numbering them off
							      String output=txtProjectSummaries.getText()+"\n"+number+": "+ summary;
							      txtProjectSummaries.setText(output);
							      
						    }
							 double finalCost = 0;
							 //decimal formatter for money
							finalCost = finalCost(HR_PRICE, totalTime);// gets the result from the method
							DecimalFormat $fm = new DecimalFormat("#,###,###.00");// format for total amount
							//shows the total amount of money required
							 lblTotalCost.setText("$"+$fm.format(finalCost)+"");// will diplay the final cost
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}//makes new scanner object for the file
						txtShowProjectField.setText("");
						lblShowProjectError.setText("");
						
					}
				
			   
		}
	}
	/**
	 * Calculates final cost
	 * @param HR_PRICE constant for hourly price
	 * @param totalTime total time spent on project
	 * @return returns final cost
	 */
	public double finalCost(double HR_PRICE, double totalTime){
		
		double finalCost = 0;
		finalCost = HR_PRICE * (totalTime);
		return finalCost;
	}
}