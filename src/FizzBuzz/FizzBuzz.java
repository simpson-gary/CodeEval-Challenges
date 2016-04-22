package FizzBuzz;

// Program Name:	FizzBuzz.java
// Developer:				Gary Simpson 
// Date:							August 25, 2015
// Purpose:					Todays CodeEval Challenge
/*										Write a program that prints out the final series of 
										numbers where those divisible by X, Y and both are
										replaced by “F” for fizz, “B” for buzz and “FB” for fizz
										buzz.
*/
 
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList; 

public class FizzBuzz  {

   static ArrayList< Integer >  X , Y, N; //= new ArrayList<Integer>(),
	
   static String 	xString = " F",
                           		yString = "B",
                           		inputFile = "FizzBuzz_Input.txt",
                           		outputFile = "FizzBuzz_Output.txt";
   private Scanner input;              	
                 
   public static void main(String[] args) {
   
   }// end method Main           	
                                 	
   public void openFile(  ) {
      try {
         input = new Scanner(new File( inputFile ) );
      } // end try
      catch ( FileNotFoundException fileNotFoundException ) {
         System.err.println ( "Error opening file." );
         System.exit ( 1 );
      } // end catch
   }//end method readFile
        
   public void readRecords(  ) {
      try {
         while ( input.hasNext() ) {
            ;
         } // end while
      } // end try
      catch ( NoSuchElementException elementException ) {
         System.err.println ( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // end catch
      catch ( IllegalStateException stateException ) {
         System.err.println ( "Error reading from file." );
         System.exit( 1 );
      } // end catch
   }//end method
        
   public void closeFile(  ) {
      if( input != null ) 
         input.close(); // close file 
   }//end method
                           
} // end class