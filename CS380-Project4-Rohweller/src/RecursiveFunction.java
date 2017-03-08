import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class RecursiveFunction 
{

	public int GCD(int first, int second)
	{
		if (first == 0)
			return second;
		if (second == 0)
			return first;
		return (GCD(second, first % second));
	}
	
	public int LCM(int first, int second)
	{
		if (GCD(first, second)==0)
			return 0;
		return ((first*second)/GCD(first, second));
	}
	public void findGCDandLCM(String file1String, String file2String) throws IOException
	{
		File file1 = new File(file1String);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2String, true)));
		
		
		Scanner scan = new Scanner(file1);
		while (scan.hasNextLine())
		{
			String line = scan.nextLine(); //scans next line 
			String [] array=line.split(" ");
			int first = Integer.parseInt(array[0]);
			int second = Integer.parseInt(array[1]);
			//write to file APPEND
			out.print(first+"\t"+second+"\tGCD:\t"+GCD(first,second)+"\tLCM: "+LCM(first, second)+"\n");		
			 
		}
		out.close();
		//scan.close();
	}
	
	public boolean Palindrome(String input)
	{
		//standardize
		//evaluate
		String standardizedInput = "";
		for  (int i =0;i<input.length();i++)
		{
			if (!(input.charAt(i)==' '))
			{
				standardizedInput+=input.toLowerCase().charAt(i);
			}
		}
		boolean works = false;
		if (standardizedInput.length()<=1)
			return true;
		else
		{
			if (standardizedInput.charAt(0)==standardizedInput.charAt(standardizedInput.length()-1))
			{
				works = Palindrome(standardizedInput.substring(1,standardizedInput.length()-1));
			}
			return works;
		}
			
		
	}
	public void solvePalindrome(String file1String, String file2String) throws IOException
	{
		File file1 = new File(file1String);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2String, true)));
		
		Scanner scan = new Scanner(file1);
		while (scan.hasNextLine())
		{
			String line = scan.nextLine(); //scans next line 
			
			//write to file APPEND
			if (Palindrome(line)==true)
				out.println(line+"\t is a Palindrome\n");
			else
				out.println(line+"\t is not a Palindrome\n");
			 
		}
		
		
		out.close();
	}
	
}
