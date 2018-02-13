
/**
 * This is the driver, this class interacts with the Date class
 * Please note that the date format is day/month/year 
 * 
 * Christian Spratt-Wilks 
 * 4/2/14
 */
public class Driver
{
  public static void main (String [] args){
    Date newDate = new Date(15,12,2014);
    
    Date sum = newDate.add(10);
    
    System.out.println("The new date is " + sum.toString());
    
   sum.holidays();
    
    Date diff = newDate.sub(10);
    
    System.out.println("The new date is " + diff.toString());
    
    Date inBew = new Date(29,4, 2013);
    
    System.out.println("The difference betwern " + newDate + " And " + inBew + " is " + newDate.dateDiff(inBew));
    
    Date Secs = new Date(1, 1, 2001);
    
    System.out.println("There are " + Secs.remSecs() + " seconds remaining in the year starting from this date");
    
    Date Mins = new Date(1, 1, 2001);
    
    System.out.println("There are " + Mins.remMins() + " minutes remaining in the year starting from this date");
    
    Date Hours = new Date(1, 1, 2001);
    
    System.out.println("There are " + Hours.remHours()+ " hours remaining in the year starting from this date");
    
    Date Days = new Date(1, 1, 2001);
    
    System.out.println("There are " + Days.remDays() + " days remaining in the year starting from this date");
    
    Date Weeks = new Date(1, 1, 2001);
    
    System.out.println("There are " + Weeks.remWeeks() + " weeks remaining in the year starting from this date");
    
    Date Months = new Date(1, 1, 2001);
    
    System.out.println("There are " + Months.remMonths() + " months remaining in the year starting from this date");
    
    

    if (sum.compareTo(inBew) > 0)
    {
        System.out.println("The first date is later than the second date");
    }
    else if (sum.compareTo(inBew) < 0)
    {
        System.out.println("The first date is earlier than the second date");
    }
    else if (sum.compareTo(inBew) == 0)
    {
        System.out.println("Both these dates are on the same day");
    }
    
    if (sum.equals(diff))
    {
       System.out.println("These dates are the same");
    }
    else
    {
        System.out.println("These dates are different");
    }
    
}
}
