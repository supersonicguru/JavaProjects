
/**
 * model the operation of a heater, with a temperature
 * 
 * @author Christian Spratt-Wilks
 * @version 0.1
 */
public class Heater
{
    //the current temperature.
    private double temperature;
    
    /**
     * Create a Heater object, with initial temperature
     * of 5 degress.
     */
    public Heater()
    {
        temperature = 15.0;
    }
    
    /**
     * Increase the temperature by 5 degress.
     */
    public void warmer()
    {
        temperature +=5.0;
    }
    
    /**
     * Decrease the temperature by 5 degress.
     */
    public void cooler()
    {
        temperature -=5.0;
    }

}