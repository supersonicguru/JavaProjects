
/**
 * This is a application to change the ammount of money you have in
 * dollars into euros, great britain pounds, or yen.
 * 
 * Chritian Spratt-Wilks
 * version 0.1
 */
public class CurrencyConverter
{
    private double dollars;
    private double euros;
    private double GBP;
    private double yen;
    
    /**
     * the amount of money they are reletive to the us dollar
     */
    public CurrencyConverter()
    {
        dollars = 1;
        euros = 0.7311;
        GBP = 0.6064;
        yen = 102.32;
    }
    
    /**
     * this is the converter from dollars to the other currency
     */
    public CurrencyConverter (double ownDollars, char currency)
    {
        if(currency == 'e' || currency == 'E')
        {
            euros = (dollars * ownDollars) * 0.7311;
        }
        
        if(currency == 'g' || currency == 'G')
        {
             GBP= (dollars * ownDollars) * 0.6064;
        }
        
        if(currency == 'y' || currency == 'Y')
        {
            yen = (dollars * ownDollars) * 102.32;
        }
    }
    
   /**
    *type in the ammount of dollars you have and the type of 
    *currency you want to convert to
    */
  
       public void CurrencyConverter (double ownDollars, char currency)
    {
        if(currency == 'e' || currency == 'E')
        {
            euros = (dollars * ownDollars) * 0.7311;
        }
        else if(currency == 'g' || currency == 'G')
        {
             GBP= (dollars * ownDollars) * 0.6064;
        }
        else if(currency == 'y' || currency == 'Y')
        {
            yen = (dollars * ownDollars) * 102.32;
        }
    }
    
    /**
     * getting method for this class
     */
    public double getCurrencyConverter (char currency)
    {
       
         if(currency == 'e' || currency == 'E')
        {
            return euros;
        }
        else if(currency == 'g' || currency == 'G')
        {
            return GBP;
        }
        else if(currency == 'y' || currency == 'Y')
        {
           return yen;
        }
        else
        {
            return 0;
        }
       
    }
    
}