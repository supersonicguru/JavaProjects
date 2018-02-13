
/**
 * This class holds a temperature using the
 * fahrenheit scale and the celcius scale.
 * 
 * @author Lorrie Lehmann
 * @version 1/15/2
 */
public class TemperatureConverter
{
	private double celcius;
	private double fahrenheit;
	
	//no argument or default constructor
	//notice the constructor has the same name as
	//the class name and has no return type, not even void
	public TemperatureConverter( )
	{
	    celcius = 0;
	    fahrenheit = 32;
	}
	
	//this constructor expects two values

	public TemperatureConverter(double temperature, char scale)
	{
	    if(scale == 'F' || scale == 'f')
	    {
	        fahrenheit = temperature;
	        celcius = 5.0/9 * (temperature - 32);
	    }
	    else if (scale == 'C' || scale == 'c')
	    {
	        celcius = temperature;
	        fahrenheit = 9.0/5 * temperature + 32;
	    }
	    else
	    {
	        celcius = 0;
	        fahrenheit = 32;
	     }
	       
	}
	
	//this method allows the user to change the temperature
	//to new values. This is a mutator method (setter method)
	//It allows the outside world to change the values of the
	//fields, but it maintains the consistency of the two fields.
	
	public void setTemperature(double temperature, char scale)
	{
	    if(scale == 'F' || scale == 'f')
	    {
	        fahrenheit = temperature;
	        celcius = 5.0/9 * (temperature - 32);
	    }
	    else if(scale == 'C' || scale == 'c')
	    {
	        celcius = temperature;
	        fahrenheit = 9.0/5 * temperature + 32;
	    }
	}
	
	//for this accessor (getter) method, the user of this class will send in a 
	//letter to indicate if they want the celcius temperature returned or the fahrenheit
	//temperature returned.
	public double getTemperature(char type)
	{
	    return (type == 'C' || type == 'c' ? celcius: fahrenheit);
	}
	  
	      
	   
}
