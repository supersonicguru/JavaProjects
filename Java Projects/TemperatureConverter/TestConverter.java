
/**
 * This class was written to test the TemperaterConverter
 * class. The user inputs a temperature and a scale (either
 * F for fahrenheit or C for celcius) THe TemperatureCOnverter stored the 
 * temperature in both scales and this class prints the tempertature in both
 * scales.
 * This is refered to as a driver class, because it drives the execution of the 
 * program.
 * 
 * @author Lorrie Lehmann 
 * @version 1/15/2014
 */

import javax.swing.JOptionPane;

public class TestConverter
{
	public static void main(String [ ] args)//execution starts in the main( ) method
	{
	    //create a reference variable, this is not a field because it is declared inside of a method
	    TemperatureConverter tc;
	    //create an instance (object) using the TemperatureConverter class blueprint
	    tc = new TemperatureConverter( );
	    //print the values of the fields of this object we created
	    System.out.println("The F temperature is " + tc.getTemperature('F'));
	    System.out.println("The C temperature is " + tc.getTemperature('C'));
	    //now I will call the mutator methos to cahnge the value of the fields
	    tc. setTemperature(78, 'F');
	    //now I will print the values of the fields
	    System.out.println("The F temperature is " + tc.getTemperature('F'));
	    System.out.println("The C temperature is " + tc.getTemperature('C'));
	    //FOR YOU TO DO- call the mutator method several times with different
	    //values and using 'C' or 'F'. THen print the results by using the 
	    //accessor (getter) method as coded in the lines above
	   
	 }
	    
        
}
