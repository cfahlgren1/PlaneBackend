
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Reservation
{
	private String prefix;
	private int resID;
	private double price;
	private Long cardNum;
	private String firstName;
	private String lastName;
	private String address;
	private ArrayList<String> seats;
	
	private Random rng = new Random();
	private Scanner scan;
	//General Constructor
	//Nisha: added constructor to pull in string value for prefix
	public Reservation(String preName, String first, String last, String custAddress, Long creditCardNum,
			ArrayList<String> bookedSeats, double bookPrice) {
		prefix = preName;
		resID = rng.nextInt(90000) + 10000;
		firstName = first;
		lastName = last;
		address = custAddress;
		price = bookPrice;
		seats = bookedSeats;
		cardNum = creditCardNum;
	}
//Constructor for loading file
	public Reservation(String preName, String first, String last, String custAddress, Long creditCardNum,
			ArrayList<String> bookedSeats, double bookPrice,
			int ID) {
		prefix = preName;
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
				File folder = new File(System.getProperty("user.dir") + "\\Reservations");
				//System.out.println(System.getProperty("user.dir") + "\\Reservations");
				if (!folder.exists())
				{
					folder.mkdir();
				}
				
				//Nisha: added in prefix string to print to file
				//Creates the string to write to file. \r\n is how new lines are created when writing to files.
				String content = "\r\nName: " + prefix + " " + firstName + " " +lastName+ "\r\nAddress: " + address + "\r\nCard Number: " + cardNum;
				//int res = 1010101;

				File file = new File(System.getProperty("user.dir") + "\\Reservations\\" + resID + ".txt");

				// If file doesn't exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}
				 PrintWriter writer = new PrintWriter(new FileWriter(file,true));
				   writer.append(content);
				    writer.close();
				//Writes to the new reservation file and closes it, saving it to the Reservations folder.
				//FileWriter fw = new FileWriter(file.getAbsoluteFile());
				//BufferedWriter bw = new BufferedWriter(fw);
				//bw.write(content);
				//bw.close();

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
			
			Scanner seatScan = new Scanner(scan.nextLine());
			
			String temp = seatScan.next();
			ArrayList<String> newSeats = new ArrayList<String>();
			
			newSeats.add(temp.substring(1,3));
			
			while (seatScan.hasNext())
			{
				temp = seatScan.next();
				newSeats.add(temp.substring(0,temp.length() - 1));
				if (temp.indexOf("]") > 0)
				{
					while (seatScan.hasNext())
					{
						
					}
				}
			}
			
			double newPrice = scan.nextDouble();
			scan.nextLine();
			scan.next();
			//Nisha: added scan in prefix from file
			String newPrefix = scan.next(), newFirst = scan.next(), newLast = scan.next(), lineClear = scan.nextLine(), lineClear2 = scan.next(), newAddress = scan.nextLine();
			scan.nextLine();
			Long newCardNum = scan.nextLong();
			
			
			
			
			Reservation load = new Reservation(newPrefix, newFirst, newLast, newAddress, newCardNum, newSeats, newPrice, ID);
			return load;
			
		}
//Cancels out the creation of a flight(For Jacob's use)
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
	public String getCard()
	{
		return "" + cardNum;
	}

	//Returns the price of booking chosen seats for the customer on the current reservation
	public String getPrice()
	{
		return "" + price;
	}
	
	//Returns the reservation ID
	public String getID()
	{
		return "" + resID;
	}
}
