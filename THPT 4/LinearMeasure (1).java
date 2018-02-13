
/**
 * An example class to be used to practice
 * overloaded constructors, copy constructor (cloning)
 * returning an object from a method, using a provate method
 * and lots more.
 * @author L. Lehmann and ITCS 1213 lecture
 * @version 3-17-2014
 */
public class LinearMeasure
{
   private int feet;
   private double inches;
   private double totalInches;
    
   //the no-args (default) constructor- set all the fields to zero 
   public LinearMeasure()
    {
       inches = totalInches =  feet = 0;
    } 
    
    public LinearMeasure (double inInches)
    {
        totalInches = inInches;
        simplify( );
    }
    
    public LinearMeasure(int inFeet, double inInches)
    {
        totalInches = inFeet * 12 + inInches;
        simplify( );
    }
    
    //this is the copy constructor used to create a new
    //object using the values from an exisiting object of the same type
    public LinearMeasure (LinearMeasure lm)
    {
        totalInches = lm.totalInches;
        simplify( );
    }
    
    //a provate utility method to make all the other methods
    //easier to write. It will take total inches and break it down into
    //feet and inches. Since it has prvate access, simplify( ) can
    //only be called withing this class file.
    private void simplify( )
    {
        feet = (int)totalInches/12;//notice the typecast
        inches = totalInches % 12;//notice Java allows mod with double!
    }
    
    public LinearMeasure multply(double factor)
    {
        return new LinearMeasure(totalInches * factor);
    }
    
    public LinearMeasure add(double amount)
    {
        return new LinearMeasure(totalInches + amount);
    }
    
    public LinearMeasure divide(double factor)
    {
        return new LinearMeasure(totalInches / factor);
    }
    
    public String toString( )
    {
        return "Feet: " + feet + "\tInches: " + inches;
    }
    
    public boolean equals(LinearMeasure other)
    {
        return this.totalInches == other.totalInches;
    }
    
    public int compareTo(LinearMeasure other)
    {
        int result;
        
        if(this.totalInches > other.totalInches)
          result = 3;
        else if (this.totalInches == other.totalInches)
         result =  0;
        else result =  -14;
        
        return result;
    }
    
    
    
    
    
    
    
    
    
        
        
       
       
      
 }



