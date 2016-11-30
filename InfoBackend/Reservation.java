package com.fall2016.planeProject;
/*
 * Reservation.java			Authors: Austin Davis, Sebastian Kromann, Jacob Godsave, and Dylan Sisai
 * 
 * A class which handles reservations for plane bookings, holding various variables, such as an ID, booking price, and credit card number.
 * 
 * Variable List:
 * 
 * resID - Handles the Reservation ID (int)
 * price - The price for booking seats chosen by the customer (int)
 * cardNum - The credit card number specified by the customer (int)
 * firstName - The customer's specified first name (String)
 * lastName - The customer's specified last name (String)
 * address - The customer's specified address (String)
 * seats - Handles all of the seats the customer has chosen to book (ArrayList<String>)
 * rng - Handles generating reservation IDs (Random)
 * scan - Handles the scanning of files when loading a reservation (Scanner)
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Reservation
{
	private int resID;
	private int price;
	private int cardNum;
	private String firstName;
	private String lastName;
	private String address;
	private ArrayList<String> seats;
	
	private Random rng = new Random();
	private Scanner scan;
//General Constructor
	public Reservation(String first, String last, String custAddress, int creditCardNum,
			ArrayList<String> bookedSeats, int bookPrice) {
		resID = rng.nextInt(90000) + 10000;
		firstName = first;
		lastName = last;
		address = custAddress;
		price = bookPrice;
		seats = bookedSeats;
		cardNum = creditCardNum;
	}
//Constructor for loading file
	public Reservation(String first, String last, String custAddress, int creditCardNum,
			ArrayList<String> bookedSeats, int bookPrice,
			int ID) {
		resID = ID;
		firstName = first;
		lastName = last;
		address = custAddress;
		price = bookPrice;
		seats = bookedSeats;
		cardNum = creditCardNum;
		
	}
//Creates and writes to a file
	public void saveReservation()
		{
			try {
				//Example if you wanna test it
				/*	int resID = 12;
				int price = 123;
				int cardNum = 1234;
				String firstName = "Steve";
				String lastName = "Johnson";
				String address = "123 Bubblegum Lane";
				ArrayList<String> seats = new ArrayList<String>();

				seats.add("1B");
				seats.add("2A");
				*/
				
				//Creates a reservation folder if it doesn't exist. Kudos to Caleb for showing me this! :)
				File folder = new File(System.getProperty("user.dir") + "/Reservations");
				if (!folder.exists())
				{
					folder.mkdir();
				}
				
				//Creates the string to write to file. \r\n is how new lines are created when writing to files.
				String content = firstName + " " +lastName+ "\r\n" + address + "\r\n" + cardNum + "\r\n" + seats + "\r\n" + price;
				//int res = 1010101;

				File file = new File(System.getProperty("user.dir") + "/Reservations/" + resID + ".txt");

				// If file doesn't exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				//Writes to the new reservation file and closes it, saving it to the Reservations folder.
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content);
				bw.close();

				System.out.println("Reservation Created");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	//Loads a reservation under the given reservation ID
	public Reservation loadReservation(int ID)
		{
			try
			{
				scan = new Scanner(new File(System.getProperty("user.dir") + "/Reservations/" + ID + ".txt"));
			} catch (FileNotFoundException e)
			{
				System.out.println("Reservation failed to load: Doesn't exist.");
				return this;
			}
			String newFirst = scan.next(), newLast = scan.next(), lineClear = scan.nextLine(), newAddress = scan.nextLine();
			int newCardNum = scan.nextInt();
			ArrayList<String> newSeats = new ArrayList<String>();
			scan.nextLine();
			Scanner seatScan = new Scanner(scan.nextLine());
			String temp = seatScan.next();
			
			newSeats.add(temp.substring(1,3));
			
			while (seatScan.hasNext())
			{
				temp = seatScan.next();
				newSeats.add(temp.substring(0,2));
			}
			
			int newPrice = scan.nextInt();
			
			Reservation load = new Reservation(newFirst, newLast, newAddress, newCardNum, newSeats, newPrice, ID);
			return load;
			
		}
//Cancels out the creation of a flight
	public void cancel()
		{

		}
	
	//Returns the name of the customer on the current reservation
	public String getName()
	{
		return firstName + " " + lastName;
	}

	//Returns the seats booked by the customer on the current reservation
	public String getSeats()
	{
		return seats.toString();
	}

	//Returns the address of the customer on the current reservation
	public String getAddress()
	{
		return address;
	}

	//Returns the credit card number of the customer on the current reservation
	public int getCard()
	{
		return cardNum;
	}

	//Returns the price of booking chosen seats for the customer on the current reservation
	public int getPrice()
	{
		return price;
	}
	
	//Returns the reservation ID
	public int getID()
	{
		return resID;
	}
}
