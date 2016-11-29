import java.io.*;

public class Driver 
{
	public static void main(String args[])
	{
		TextWriter writer = new TextWriter();
		File file = new File("C:/Users/ncc-gaming/Desktop/f.fec");//File Path
		writer.write(file,"%Hello World%",true);//Text to write to the file above and not overwrite it 
		writer.write(file,"\n%Hello World%",false);
		writer.write(file,"\n%Hello World%",false);
		writer.writeToLine(file, "Changed Text", 2);//Doesnt Work Yet
	}
}
