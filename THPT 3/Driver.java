import java.util.*;
import java.io.*;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
   public static void main(String args[]) throws IOException {
     Converter read;
     Scanner inputFile;
     inputFile = new Scanner(new File("outSentence.txt")); //reads the textf file
     PrintWriter noNums = new PrintWriter(new File("newOutSentence.txt")); // makes a new file
    while(inputFile.hasNext()){ // loops till it is nothing left
     read = new Converter(inputFile.nextLine()); // reads the file
     
     read.convert(); // convert the numbers to words
     
     System.out.println(read.getConverted()); // prints out the new text
     
     noNums.println(read.getConverted()); // makes a new text file of the output
   
   
    }
    inputFile.close(); //closes input file
    noNums.close(); //close new file
    
    }
}
