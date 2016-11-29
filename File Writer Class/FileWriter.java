import java.io.*;
import java.util.Scanner;

public class FileWriter 
{
	public static void write(File file,String text)
	{
		//Write to a file
		//###################################
		try{
		    PrintWriter writer = new PrintWriter(file);
		    writer.println(text);
		    writer.close();
		} catch (IOException e) 
		{}
		//###################################
	}
	public static void writeToLine(File file, String text, int line)
	{
		//Init Values
		int line2 = 0;
        String before_text = "";
        String after_text = "";
        
		//Read from a file
		//Grab all the lines before the specified line
		//########################################################################
		try 
		{
            Scanner input = new Scanner(System.in);
            input = new Scanner(file);            
            
            //Read from file before the specific line
            //##############################################
            while (input.hasNextLine()) 
            {
            	line2 ++;
            	while (line2 < line)
            	{
            		before_text += input.next();//Grab all the text before the line
            	}
            	if (line2 == line)
            	{
            		line2++;
            		input.nextLine();
            	}
            	while (line2 > line)
            	{
            		after_text += input.next();//Grab all the text after the line
            	}
            	
            }
            //##############################################
            input.close();
        } catch (Exception ex) 
		{
            ex.printStackTrace();
		}
		//########################################################################
		//Write to a file
		//###################################
		try{
			PrintWriter writer = new PrintWriter(file);
			writer.println(before_text);
			writer.println(text);
			writer.println(after_text);
			writer.close();
		} catch (IOException e) 
		{}
		//###################################
	}
}
