package com.fall2016.projects;
//Team: Baackana End
//Team Members: Caleb, Haydn, Cameron, Ethan

import java.util.Base64;
import java.io.UnsupportedEncodingException;

public class EncodingAndDecoding 
{
   public static String Encode (String input) throws UnsupportedEncodingException
   {
		   String base64encodedString = Base64.getEncoder().encodeToString(input.getBytes("utf-8"));
	        return base64encodedString;
   }
   
   public static String Decode (String input) throws UnsupportedEncodingException
   {
		   byte[] base64decodedBytes = Base64.getDecoder().decode(input);
	       String output = new String(base64decodedBytes, "utf-8");
	       return output;
   }
}