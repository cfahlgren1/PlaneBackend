

//------------------------------------------------------------------------------------
//	Authors:		Joshua Lindberg, Ian Stacy, Jake Hollis, Jacob Waters
//	Program Name:	InfoFrontEnd
//------------------------------------------------------------------------------------

//Imports
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class InfoFrontEnd extends JPanel
{
	 // Class level variables
	static ArrayList<String> arraySeat;
	
	String prefix = "Mr.", fName	= "", lName = "", address = "", price = "", seats = "", credit = "", flightID;
	
	int cost;
	
	int	creditNumber = 00000000;
	
	JTextField textLabelFName, textLabelLName, textLabelAddress, 
	textLabelPrice, textLabelSeats, textLabelCredit, textLabelFlightID;
	
	String submit = "Submit";
	
	static int resID;

	
	//Start of main program
	public InfoFrontEnd()
	{
		
		JPanel InfoPanel = new JPanel(new GridLayout(0, 1));
		
		//currency formatter
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//added in a JComboBox to prompt the user to choose their prefix
		JComboBox combo = new JComboBox();
		combo.addItem("Mr.");
		combo.addItem("Ms.");
		combo.addItem("Mrs.");
		
		JLabel label1 = new JLabel("First Name ");
		
		textLabelFName = new JTextField(30);
		
		JLabel label2 = new JLabel("Last Name ");
		textLabelLName = new JTextField(30);
		textLabelLName.setEditable(true);
		
		JLabel label3 = new JLabel("\nAddress");
		textLabelAddress = new JTextField(30);
		textLabelAddress.setEditable(true);
		
		JLabel label4 = new JLabel("Price");
		// textLabelPrice = new JTextField(seats, 30);
		textLabelPrice = new JTextField(""
				+ fmt.format(WriteToFile.getPrice(SeatButtonsFinal.list)), 10);
		textLabelPrice.setEditable(false);
		
		//pulls price from reservation file
		price = WriteToFile.getPrice(SeatButtonsFinal.list) + "";
		
		JLabel label5 = new JLabel("Seats");
		// textLabelSeats = new JTextField("A1, A2, A3", 30);
		textLabelSeats = new JTextField(seatsChosen().toString(), 30);
		textLabelSeats.setEditable(false);
		
		JComponent submission = createButtonPanel();
		
		JLabel label6 = new JLabel("Credit Card Number:");
		textLabelCredit = new JTextField(20);
		textLabelCredit.setEditable(true);
		//limits the number of character the user can enter into a textfield
		//uses CharLimiter class
		textLabelCredit.setDocument(new CharLimiter(16));
		
		JLabel label7 = new JLabel("ID Number:");
		// textLabelFlightID = new JTextField(20);
		textLabelFlightID = new JTextField("" + resID, 20);
		textLabelFlightID.setEditable(false);
		
		seatsEqual();
		// Printing labels and text fields
		InfoPanel.add(combo);
		InfoPanel.add(label1);
		InfoPanel.add(textLabelFName);
		InfoPanel.add(label2);
		InfoPanel.add(textLabelLName);
		InfoPanel.add(label3);
		InfoPanel.add(textLabelAddress);
		InfoPanel.add(label4);
		InfoPanel.add(textLabelPrice);
		InfoPanel.add(label5);
		InfoPanel.add(textLabelSeats);
		InfoPanel.add(label6);
		InfoPanel.add(textLabelCredit);
		InfoPanel.add(label7);
		InfoPanel.add(textLabelFlightID);
		
		InfoPanel.add(submission);
		add(InfoPanel, BorderLayout.LINE_START);
		setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 30));
		combo.addActionListener (new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JComboBox combo = (JComboBox) e.getSource();
					String selected = combo.getSelectedItem().toString();
							
					switch(selected)
					{
						case "Mr.":
						{
								prefix = selected;
								break;
						}
						case "Ms.":
						{
							prefix = selected;
							break;
						}
						case "Mrs.":
						{
							prefix = selected;
							break;
						}
						default:
						{
							prefix = "Mr.";
							break;
						}
					}
				}
 			});
	}
	
	private static JFrame info = new JFrame("Passenger Info");
	private static void createAndShowInfo()
	{
		// Create and set up the window.
		resID = SeatButtonsFinal.resID;
		arraySeat = new ArrayList<String>();
		
		info.addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(java.awt.event.WindowEvent e)
			{
				SeatButtonsFinal.sfile.delete();
				System.exit(0);
			}
		});
		// Create and set up the content pane.
		JComponent myFrontEnd = new InfoFrontEnd();
		myFrontEnd.setOpaque(true);
		// content panes must be opaque
		info.setContentPane(myFrontEnd);
		
		// Display the window.
		info.pack();
		info.setVisible(true);
	}
	
	// Saves user input as variables and saves to file 
	// by calling method from reservation.
	public void actionSaveInfo()
	{
		fName = textLabelFName.getText();
		lName = textLabelLName.getText();
		address = textLabelAddress.getText();
		seats = textLabelSeats.getText();
		credit = textLabelCredit.getText();
		//converts credit to Long data type instead of Int
		Reservation custReservation = new Reservation(prefix, fName, lName, address,
				Long.parseLong(credit), arraySeat, Double.parseDouble(price),
				SeatButtonsFinal.resID);
		custReservation.saveReservation();
	}
	
	// Creates a Submit Button from saving action.
	private JComponent createButtonPanel()
	{
		JPanel pan = new JPanel(new GridLayout(1, 0));
		JButton submitButton = new JButton("Submit");
		submitButton.setBackground(Color.red);
		submitButton.setForeground(Color.white);
		submitButton.addActionListener(new Saving());
		pan.add(submitButton);
		return pan;
	}
	
	// Converts the string array from reservations to a string.
	public void seatsEqual()
	
	{
		for (int index = 0; index < arraySeat.size(); index++)
		{
			seats += arraySeat.get(index);
		}
	}
	
	// runs the save info method
	public class Saving implements ActionListener
	{
		//changed to send to confirm screen
		public void actionPerformed(ActionEvent e)
		{
			//actionSaveInfo();
			//System.exit(0);
			showConfirmation();
		}
	}
	Response y = new Response();
	Response n = new Response();
	JFrame confirm = new JFrame("Confirmation");
	private void showConfirmation()
	{
		
		confirm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		confirm.addWindowListener(new java.awt.event.WindowAdapter() 
		
		
			{
				public void windowClosing(java.awt.event.WindowEvent e) 
					{
						int x  = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? \nCurrent Reservation will be lost!", "Confirm", JOptionPane.YES_NO_OPTION);
						if (x == JOptionPane.YES_OPTION)
							{
								SeatButtonsFinal.sfile.delete();
								System.exit(0);
							}
					}
			}
		);
		JPanel fields = new JPanel(new GridLayout(0,2));
		JLabel label;
		String lStrings[] = {" ", "Confirm Reservation?", "" , "" , "Name: ", prefix + " " + textLabelFName.getText() + " " + textLabelLName.getText(),
							"Address: ", textLabelAddress.getText(), "Card Number: ", textLabelCredit.getText(), "Seats: ", textLabelSeats.getText(), 
							"Price: ", textLabelPrice.getText(), "ID Number: ", textLabelFlightID.getText(), "", ""};
		for(int x = 0; x<18; x++)
			{
				label = new JLabel(lStrings[x]);
				label.setFont(new Font("", Font.PLAIN, 20));
				fields.add(label);
			}
		JButton yes = new JButton ("Yes");
		JButton no = new JButton ("No");
		
		yes.addActionListener(y);
		no.addActionListener(n);
		fields.add(yes);
		fields.add(no);
		confirm.add(fields);
		confirm.pack();
		confirm.setVisible(true);
	}
	
	
	public class Response implements ActionListener
	{

		public void actionPerformed(ActionEvent arg0)
			{
				if (this==y)
				{
					int confiirm = JOptionPane.showConfirmDialog(null, "Do you want to make another reservation?", "Another", JOptionPane.YES_NO_OPTION);
					if (confiirm==JOptionPane.YES_OPTION)
					{
						actionSaveInfo();
						SeatButtonsFinal.frame.dispose();
						confirm.dispose();
						info.dispose();
						SeatButtonsFinal.createAndShowGUI();
					}
					else
						System.exit(0);
				}
					
				else
				{
					confirm.dispose();
					info.dispose();
					createAndShowInfo();
				}
					
			}
		
	}
	
	//Getters for the program
	public ArrayList<String> getSeats()
	{
		return arraySeat;
	}
	
	public String getFName()
	{
		return fName;
	}
	
	public String getLName()
	{
		return lName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getCardNumber()
	{
		return creditNumber;
	}
	
	//Links Front Ends
	public static void toInfo()
	{
		runs++;
		createAndShowInfo();
	}
	static int runs = 0;
	//Reads seats from file.
	public static ArrayList<String> seatsChosen()
	{
		// #############################################
		// Grab existing reserved seats
		// #############################################
		ArrayList<String> seats_taken2 = new ArrayList<String>();
		File folder = new File(System.getProperty("user.dir")
				+ "/Reservations/");
		
		if (folder.exists())
		{
			// Loop through the different file
			String s = "";
			
			File file = new File(System.getProperty("user.dir")
					+ "/Reservations/" + resID + ".txt");
			s += " ";
			if (file.exists())
			{
				try
				{
					Scanner input = new Scanner(System.in);
					
					input = new Scanner(file);
					input.useDelimiter("]");
					
					while (input.hasNextLine())
					{
						s += input.next();
						break;
					}
					input.close();
					
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
			s = s.replace("[", "");
			s = s.replace(",", "");
			Scanner scan = new Scanner(s);
			
			while (scan.hasNext())
			{
				seats_taken2.add(scan.next());
			}
			
		}
		if (runs==2)
			System.out.println("done");
		return seats_taken2;
	}
}