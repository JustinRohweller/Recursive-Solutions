import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class CS380_Project4_Rohweller 
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Justin Rohweller");
		System.out.println("CS380-Project4");
		
		
		RecursiveFunction r = new RecursiveFunction();
		
		r.findGCDandLCM("gcdin.txt", "gcdout.txt");
		r.solvePalindrome("palIn.txt","palOut.txt");
		
	}

}
