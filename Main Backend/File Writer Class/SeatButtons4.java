
//*****************************************************************************
//SeatButtons4.java     Name: Raymond Pace, Nisha Patel     Date: 11/30/16
//
//Class Group Project---Main GUI Display Team
//
//individuals can book a seat on a plane to their choice in travel destinations
//*****************************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class SeatButtons4  extends JPanel 
	{
		//Array List to store seats
			static ArrayList <String> list = new ArrayList <String>();
		
		//Total Price of the seats
			static int total_price = 0;
			
			
			
		JRadioButton A1 = new JRadioButton(), B1 = new JRadioButton(),
				C1 = new JRadioButton(), D1 = new JRadioButton(),
				E1 = new JRadioButton(), F1 = new JRadioButton();

		JRadioButton A2 = new JRadioButton(), B2 = new JRadioButton(),
				C2 = new JRadioButton(), D2 = new JRadioButton(),
				E2 = new JRadioButton(), F2 = new JRadioButton();

		JRadioButton A3 = new JRadioButton(), B3 = new JRadioButton(),
				C3 = new JRadioButton(), D3 = new JRadioButton(),
				E3 = new JRadioButton(), F3 = new JRadioButton();

		JRadioButton A4 = new JRadioButton(), B4 = new JRadioButton(),
				C4 = new JRadioButton(), D4 = new JRadioButton(),
				E4 = new JRadioButton(), F4 = new JRadioButton();

		JRadioButton A5 = new JRadioButton(), B5 = new JRadioButton(),
				C5 = new JRadioButton(), D5 = new JRadioButton(),
				E5 = new JRadioButton(), F5 = new JRadioButton();

		JRadioButton A6 = new JRadioButton(), B6 = new JRadioButton(),
				C6 = new JRadioButton(), D6 = new JRadioButton(),
				E6 = new JRadioButton(), F6 = new JRadioButton();

		JRadioButton A7 = new JRadioButton(), B7 = new JRadioButton(),
				C7 = new JRadioButton(), D7 = new JRadioButton(),
				E7 = new JRadioButton(), F7 = new JRadioButton();

		JRadioButton A8 = new JRadioButton(), B8 = new JRadioButton(),
				C8 = new JRadioButton(), D8 = new JRadioButton(),
				E8 = new JRadioButton(), F8 = new JRadioButton();

		JRadioButton A9 = new JRadioButton(), B9 = new JRadioButton(),
				C9 = new JRadioButton(), D9 = new JRadioButton(),
				E9 = new JRadioButton(), F9 = new JRadioButton();

		JRadioButton A10 = new JRadioButton(), B10 = new JRadioButton(),
				C10 = new JRadioButton(), D10 = new JRadioButton(),
				E10 = new JRadioButton(), F10 = new JRadioButton();

		JRadioButton A11 = new JRadioButton(), B11 = new JRadioButton(),
				C11 = new JRadioButton(), D11 = new JRadioButton(),
				E11 = new JRadioButton(), F11 = new JRadioButton();

		JRadioButton A12 = new JRadioButton(), B12 = new JRadioButton(),
				C12 = new JRadioButton(), D12 = new JRadioButton(),
				E12 = new JRadioButton(), F12 = new JRadioButton();

		JRadioButton A13 = new JRadioButton(), B13 = new JRadioButton(),
				C13 = new JRadioButton(), D13 = new JRadioButton(),
				E13 = new JRadioButton(), F13 = new JRadioButton();

		JRadioButton[][] seats = { { A1, B1, C1, D1, E1, F1 },
				{ A2, B2, C2, D2, E2, F2 }, { A3, B3, C3, D3, E3, F3 },
				{ A4, B4, C4, D4, E4, F4 }, { A5, B5, C5, D5, E5, F5 },
				{ A6, B6, C6, D6, E6, F6 }, { A7, B7, C7, D7, E7, F7 },
				{ A8, B8, C8, D8, E8, F8 }, { A9, B9, C9, D9, E9, F9 },
				{ A10, B10, C10, D10, E10, F10 },
				{ A11, B11, C11, D11, E11, F11 },
				{ A12, B12, C12, D12, E12, F12 },
				{ A13, B13, C13, D13, E13, F13 } };
		
		SeatSelected A1L = new SeatSelected(), B1L = new SeatSelected(),
				C1L = new SeatSelected(), D1L = new SeatSelected(),
				E1L = new SeatSelected(), F1L = new SeatSelected();

		SeatSelected A2L = new SeatSelected(), B2L = new SeatSelected(),
				C2L = new SeatSelected(), D2L = new SeatSelected(),
				E2L = new SeatSelected(), F2L = new SeatSelected();

		SeatSelected A3L = new SeatSelected(), B3L = new SeatSelected(),
				C3L = new SeatSelected(), D3L = new SeatSelected(),
				E3L = new SeatSelected(), F3L = new SeatSelected();

		SeatSelected A4L = new SeatSelected(), B4L = new SeatSelected(),
				C4L = new SeatSelected(), D4L = new SeatSelected(),
				E4L = new SeatSelected(), F4L = new SeatSelected();

		SeatSelected A5L = new SeatSelected(), B5L = new SeatSelected(),
				C5L = new SeatSelected(), D5L = new SeatSelected(),
				E5L = new SeatSelected(), F5L = new SeatSelected();

		SeatSelected A6L = new SeatSelected(), B6L = new SeatSelected(),
				C6L = new SeatSelected(), D6L = new SeatSelected(),
				E6L = new SeatSelected(), F6L = new SeatSelected();

		SeatSelected A7L = new SeatSelected(), B7L = new SeatSelected(),
				C7L = new SeatSelected(), D7L = new SeatSelected(),
				E7L = new SeatSelected(), F7L = new SeatSelected();

		SeatSelected A8L = new SeatSelected(), B8L = new SeatSelected(),
				C8L = new SeatSelected(), D8L = new SeatSelected(),
				E8L = new SeatSelected(), F8L = new SeatSelected();

		SeatSelected A9L = new SeatSelected(), B9L = new SeatSelected(),
				C9L = new SeatSelected(), D9L = new SeatSelected(),
				E9L = new SeatSelected(), F9L = new SeatSelected();

		SeatSelected A10L = new SeatSelected(), B10L = new SeatSelected(),
				C10L = new SeatSelected(), D10L = new SeatSelected(),
				E10L = new SeatSelected(), F10L = new SeatSelected();

		SeatSelected A11L = new SeatSelected(), B11L = new SeatSelected(),
				C11L = new SeatSelected(), D11L = new SeatSelected(),
				E11L = new SeatSelected(), F11L = new SeatSelected();

		SeatSelected A12L = new SeatSelected(), B12L = new SeatSelected(),
				C12L = new SeatSelected(), D12L = new SeatSelected(),
				E12L = new SeatSelected(), F12L = new SeatSelected();

		SeatSelected A13L = new SeatSelected(), B13L = new SeatSelected(),
				C13L = new SeatSelected(), D13L = new SeatSelected(),
				E13L = new SeatSelected(), F13L = new SeatSelected();
		
		
		SeatSelected[][] listeners = { { A1L, B1L, C1L, D1L, E1L, F1L },
					{ A2L, B2L, C2L, D2L, E2L, F2L }, { A3L, B3L, C3L, D3L, E3L, F3L },
					{ A4L, B4L, C4L, D4L, E4L, F4L }, { A5L, B5L, C5L, D5L, E5L, F5L },
					{ A6L, B6L, C6L, D6L, E6L, F6L }, { A7L, B7L, C7L, D7L, E7L, F7L },
					{ A8L, B8L, C8L, D8L, E8L, F8L }, { A9L, B9L, C9L, D9L, E9L, F9L },
					{ A10L, B10L, C10L, D10L, E10L, F10L },
					{ A11L, B11L, C11L, D11L, E11L, F11L },
					{ A12L, B12L, C12L, D12L, E12L, F12L },
					{ A13L, B13L, C13L, D13L, E13L, F13L } };
		
		String[][] allSeats = {{"A1", "B1", "C1", "D1", "E1", "F1"},
				{"A2", "B2", "C2", "D2", "E2", "F2"}, {"A3", "B3", "C3", "D3", "E3", "F3"},
				{"A4", "B4", "C4", "D4", "E4", "F4"}, {"A5", "B5", "C5", "D5", "E5", "F5"},
				{"A6", "B6", "C6", "D6", "E6", "F6"}, {"A7", "B7", "C7", "D7", "E7", "F7"},
				{"A8", "B8", "C8", "D8", "E8", "F8"}, {"A9", "B9", "C9", "D9", "E9", "F9"},
				{"A10", "B10", "C10", "D10", "E10", "F10"},
				{"A11", "B11", "C11", "D11", "E11", "F11"},
				{"A12", "B12", "C12", "D12", "E12", "F12"},
				{"A13", "B13", "C13", "D13", "E13", "F13"}};
		
		ButtonGroup group = new ButtonGroup();
		
		public SeatButtons4() {
			super(new BorderLayout());

			// Group the radio buttons.
			
			for (int row = 0; row < seats.length; row++)
				{
					for (int col = 0; col < seats[row].length; col++)
						{
							group.add(seats[row][col]);
						}
				}

			// Register a listener for the radio buttons.
			
			for (int row = 0; row<seats.length; row++)
				{
					for (int col = 0; col<seats[0].length; col++)
						{
							seats[row][col].addActionListener(listeners[row][col]);
						}
				}

			// Put the radio buttons in a column in a panel.
			JPanel radioPanel = new JPanel(new GridLayout(14, 11));

			JLabel aisle = new JLabel("   ");
			JLabel blank = new JLabel("   ");
			JLabel seatA = new JLabel("  A");
			JLabel seatB = new JLabel("  B");
			JLabel seatC = new JLabel("  C");
			JLabel seatD = new JLabel("  D");
			JLabel seatE = new JLabel("  E");
			JLabel seatF = new JLabel("  F");
			JLabel blank2 = new JLabel ("");
			JLabel section = new JLabel("Class");
			JLabel blank3 = new JLabel ("");
			JLabel price = new JLabel ("Price");

			radioPanel.add(blank);
			radioPanel.add(seatA);
			radioPanel.add(seatB);
			radioPanel.add(seatC);
			radioPanel.add(aisle);
			radioPanel.add(seatD);
			radioPanel.add(seatE);
			radioPanel.add(seatF);
			radioPanel.add(blank2);
			radioPanel.add(section);
			radioPanel.add(blank3);
			radioPanel.add(price);

			JLabel row1 = new JLabel("Row 1  ");
			JLabel row2 = new JLabel("Row 2  ");
			JLabel row3 = new JLabel("Row 3  ");
			JLabel row4 = new JLabel("Row 4  ");
			JLabel row5 = new JLabel("Row 5  ");
			JLabel row6 = new JLabel("Row 6  ");
			JLabel row7 = new JLabel("Row 7  ");
			JLabel row8 = new JLabel("Row 8  ");
			JLabel row9 = new JLabel("Row 9  ");
			JLabel row10 = new JLabel("Row 10  ");
			JLabel row11 = new JLabel("Row 11  ");
			JLabel row12 = new JLabel("Row 12  ");
			JLabel row13 = new JLabel("Row 13  ");
			
			JLabel[] labels = {row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13};
			
			JLabel a1 = new JLabel(" | "), a2 = new JLabel(" | "), a3 = new JLabel(" | "), a4 = new JLabel(" | "), a5 = new JLabel(" | "), a6 = new JLabel(" | "), a7 = new JLabel(" | "), a8 = new JLabel(" | "), a9 = new JLabel(" | "), a10 = new JLabel(" | "), a11 = new JLabel(" | "), a12 = new JLabel(" | "), a13 = new JLabel(" | ");
			JLabel b1 = new JLabel(" | "), b2 = new JLabel(" | "), b3 = new JLabel(" | "), b4 = new JLabel(" | "), b5 = new JLabel(" | "), b6 = new JLabel(" | "), b7 = new JLabel(" | "), b8 = new JLabel(" | "), b9 = new JLabel(" | "), b10 = new JLabel(" | "), b11 = new JLabel(" | "), b12 = new JLabel(" | "), b13 = new JLabel(" | ");
			JLabel s1 = new JLabel("First"), s2 = new JLabel("First"), s3 = new JLabel("Business"), s4 = new JLabel("Business"), s5 = new JLabel("Business"), s6 = new JLabel("Business"), s7 = new JLabel("Business"), s8 = new JLabel("Economy"), s9 = new JLabel("Economy"), s10 = new JLabel("Economy"), s11 = new JLabel("Economy"), s12 = new JLabel("Economy"), s13 = new JLabel("Economy");
			JLabel m1 = new JLabel("  "), m2 = new JLabel("  "), m3 = new JLabel("  "), m4 = new JLabel("  "), m5 = new JLabel("  "), m6 = new JLabel("  "), m7 = new JLabel("  "), m8 = new JLabel("  "), m9 = new JLabel("  "), m10 = new JLabel("  "), m11 = new JLabel("  "), m12 = new JLabel("  "), m13 = new JLabel("  ");
			JLabel p1 = new JLabel("$507"), p2 = new JLabel("$507"), p3 = new JLabel("$420"), p4 = new JLabel("$420"), p5 = new JLabel("$420"), p6 = new JLabel("$420"),p7 = new JLabel("$420"), p8 = new JLabel("$250"), p9 = new JLabel("$250"), p10 = new JLabel("$250"), p11 = new JLabel("$250"), p12 = new JLabel("$250"), p13 = new JLabel("$250");

			JLabel[] aisles = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13};
			JLabel[] blanks = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13};
			JLabel[] sections = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13};
			JLabel[] more = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13};
			JLabel[] prices = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13};
			
			for (int row = 0; row<seats.length; row++)
				{
					for (int col = 0; col<seats[0].length+6; col++)
						{
							if (col==0)
								radioPanel.add(labels[row]);
							else if(col>0 && col<4)
								radioPanel.add(seats[row][col-1]);
							else if (col==4)
								radioPanel.add(aisles[row]);
							else if (col>4 && col<8)
								radioPanel.add(seats[row][col-2]);
							else if (col==8)
								radioPanel.add(blanks[row]);
							else if (col==9)
								radioPanel.add(sections[row]);
							else if (col==10)
								radioPanel.add(more[row]);
							else if (col==11)
								radioPanel.add(prices[row]);
						}
				}
			

			add(radioPanel, BorderLayout.LINE_START);
			setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 30));
		}

		/** Listens to the radio buttons. */
		private class SeatSelected implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{

				JRadioButton myButton = findSeat();
				
				String question = "Is seat " + getSeat() + " the one you want?";
				
				int confirm = JOptionPane.showConfirmDialog(null,
						question);
				
				WriteToFile write = new WriteToFile();
				
				if (confirm == JOptionPane.YES_OPTION)
					{
					
						myButton.setEnabled(false);
						
						list.add(getSeat());
						total_price = write.getPrice(list);
						
						write.writeSeatsTaken("24597", list, total_price);
					
						
						
						group.clearSelection();
					}
				else 
					{
						group.clearSelection();
					}
			}
			
			public JRadioButton findSeat()
			{
				for (int row = 0; row<listeners.length; row++)
					{
						for (int col = 0; col<listeners[0].length; col++)
							{
								if (this == listeners[row][col])
									return seats[row][col];
							}
						
					}
				return new JRadioButton();
			}
			
			public String getSeat()
			{
				String seat = "";
				
				for (int row = 0; row<listeners.length; row++)
					{
						for (int col = 0; col<listeners[0].length; col++)
							{
								if (this == listeners[row][col])
									seat = allSeats[row][col];
							}
					
					}
				
				return seat;
			}
		}
		

		/**
		 * Create the GUI and show it. For thread safety, this method should be
		 * invoked from the event-dispatching thread.
		 */
		private static void createAndShowGUI()
			{
				// Create and set up the window.
				JFrame frame = new JFrame("Flight Reservation");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// Create and set up the content pane.
				JComponent newContentPane = new SeatButtons4();
				newContentPane.setOpaque(true); // content panes must be opaque
				frame.setContentPane(newContentPane);

				// Display the window.
				frame.pack();
				frame.setVisible(true);
			}

		public static void main(String[] args)
			{
				// Schedule a job for the event-dispatching thread:
				// creating and showing this application's GUI.
				javax.swing.SwingUtilities.invokeLater(new Runnable() 
					{
						public void run()
							{
								createAndShowGUI();
							}
					}
				);
			}
	}
