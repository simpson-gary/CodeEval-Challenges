package FizzBuzz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import week07.Book;

public class FileReader {
	/**
	 * The file format is.
	 * low# hi# range
	 */
	private static String  FILE_NAME = "FizzBuzz_Input.txt";
	private String filePath;
	private DecimalFormat formatter;
	private static String m_decimalFormat = "0.00"; 
	private SimpleDateFormat m_dateFormatter;
	private static String m_dateFormat = "MM/dd/yyyy"; 
	private static String m_bookFormat = "%s,%s,%s,%s\r\n";
	
	
	public  FileReader(  ) {
		ArrayList<Book> books = new ArrayList<Book>();
		FileReader fs = null;
		BufferedReader reader = null;
		try
		{
			File file = new File(FILE_NAME);
			
			fs = new FileReader(file);
			reader = new BufferedReader(fs);
			String line = "";
			while((line = reader.readLine()) != null)
			{
				// Get a new book instance
				//////Book b = getBook(line);
				//////books.add(b);
			}
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			if( reader != null) try{reader.close();}catch(IOException ex){}
		}

	}//end method
	
	
} // end class File Reader
