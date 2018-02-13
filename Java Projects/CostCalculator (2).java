
/**
 * Write a description of class CostCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CostCalculator
{
    private double miles;
    private double gallons;
    private double costPerGallon;
    private double mileage;
    private double costForTrip;
    
    public CostCalculator( double inMiles, double inGallons, double inCostPer)
    {
        miles = inMiles;
        gallons = inGallons;
        costPerGallon = inCostPer;
        
        mileage = miles/gallons;
        costForTrip = gallons * costPerGallon;
    }
}
