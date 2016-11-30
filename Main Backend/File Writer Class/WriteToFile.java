//############################
//Authors: Caleb Fahlgren | Haydn Davlin | Cameron Mullis | Ethan Knagge |
//Date: 11/30/2016
//Group: Plane Backend
//############################

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToFile 
{
	public static void writeSeatsTaken(String resID, ArrayList list, int total_price)
	{
		File file = new File(System.getProperty("user.dir") + "/Reservations/" + resID + ".txt");
		
		try
		{
		    PrintWriter writer = new PrintWriter(new FileWriter(file,true));
		    writer.append(String.valueOf(list) + "\tSeats Booked");
		    writer.append(String.valueOf(total_price) + "\tReservation Price");
		    writer.close();
		    
		} catch (IOException e) 
		{}
	}
	public static void grabAllResID()
	{
		File folder = new File(System.getProperty("user.dir") + "/Reservations/");
		File[] listOfFiles = folder.listFiles();
		ArrayList list = new ArrayList();
		
		if (listOfFiles != null)
		{
		    for (int i = 0; i < listOfFiles.length; i++) 
		    {
		      if (listOfFiles[i].isFile()) 
		      {
		        list.add(listOfFiles[i].getName().substring(0,listOfFiles[i].getName().length()-4));
		      }
		      else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		}
		System.out.println(list);
	}
	public static void main(String args[])
	{
		grabAllResID();
	}
}
	

