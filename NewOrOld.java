package TestEnviornment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

public class NewOrOld extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewOrOld frame = new NewOrOld();
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
	public NewOrOld() {
		setTitle("New Project ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewProject = new JButton("New Project ");
		btnNewProject.addActionListener(new BtnNewProjectActionListener());
		btnNewProject.setBounds(10, 201, 132, 23);
		contentPane.add(btnNewProject);
		
		JButton btnExistingProject = new JButton("Existing Project ");
		btnExistingProject.addActionListener(new BtnExistingProjectActionListener());
		btnExistingProject.setBounds(152, 201, 132, 23);
		contentPane.add(btnExistingProject);
		
		JButton btnCancelButton = new JButton("Cancel ");
		btnCancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelButton.setBounds(294, 201, 130, 23);
		contentPane.add(btnCancelButton);
		
		JTextPane txtpnWouldYouLike = new JTextPane();
		txtpnWouldYouLike.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnWouldYouLike.setText("Would you like to create a new project or view an existing project?");
		txtpnWouldYouLike.setBounds(23, 50, 388, 49);
		contentPane.add(txtpnWouldYouLike);
	}
	
			
			
		
	
	
	private class BtnNewProjectActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			NewProject newWindow = new NewProject();
			newWindow.setVisible(true);
			
		
		}
	}
	private class BtnExistingProjectActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
			
	}
}
