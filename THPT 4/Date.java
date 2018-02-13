
/**
 *This class creates a date, compares 2 dates together, adds days to the currect date, tell how many days are in between 2 dates, 
 *and tell how many days and weeks remain in the year from the given date. Please note that the date format is day/month/year
 * 
 * Christian Spratt-Wilks 
 * 4/2/14
 */
public class Date
{
 private int day;
 private int month;
 private int year;
 private int diffMonth;
 private int diffDay;
 private int diffYear;
 private int remainding;
 
 /**
  * This is the constructor method, this method sets the day, month, and year to a date 
  * 
  */
 public Date(){
     day = 1;
     month = 1;
     year = 1999;
    }
    
    /**
     * This is the second constructor method, this method accepts input of the day, month, and year
     * @param inDay = day of the month
     * @param inMonth = month of the year
     * @param inYear = the year
     */
 public Date(int inDay, int inMonth, int inYear){
      day = inDay;
      month = inMonth;
      year = inYear;
    }
    
 /**
  * This is the copy constructor
  * @param copyDate = the object gets the dates and set its date as the get methods
  */
public Date(Date copyDate){
    day = copyDate.getDay();
    month = copyDate.getMonth();
    year = copyDate.getYear();
}

/**
 * get method to get the day
 * @return day
 */
public int getDay(){
    return day;
}

/**
 * get method to get the month
 * @return month
 */
public int getMonth(){
    return month;
}

/**
 * get method to get the year
 * @return year
 */
public int getYear(){
    return year;
}

/**
 * this method prints out the pre made text writen in it
 * @return String
 */
public String toString(){
    return month + "/" + day + "/" + year;
}

/**
 * this equal methods compares 2 dates to see if they are the same date
 * @param Date otherDate = 
 * @return boolean, if the first date is equal to the other date then it will print saying that it is equal, if not then it will print saying that it is not equal
 */
public boolean equals(Date otherDate){
    
    return day == otherDate.getDay() && month == otherDate.getMonth() && year == otherDate.getYear();
}


/**
 * this method compares 2 dates to see if one date is the same, above or below one of another
 * @param Date comDate - creates a new date
 * @return int, if it returns a 1 then that means the first date is greater than the second date, if it returns a 0 then they are equal, if it returns a negative 1 then the first date is less the second date
 */
public int compareTo(Date comDate){
    if (equals(comDate)){
        return 0;
    }
    else if(year > comDate.getYear() || (year == comDate.getYear() && month > comDate.getMonth())|| (year == comDate.getYear() && month == comDate.getMonth() && day > comDate.getDay())) {
        return 1;
    }
    else{
        return -1;
    }
}

/**
 * this method add days to the date
 * @param addDay = the number of days added to the date
 * @return new Date = the new date that was made by adding the days to the date
 */
public Date add(int addDay){
    int newDay = day;
    int newMonth = month;
    int newYear = year;
   
 
    if(month == 1){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 2){
        newDay = day+ addDay;
     if(year %4 == 0){
         if(newDay > 29){
             newMonth += 1;
             newDay -= 29;
            }
        }
    else if(newDay > 28){
            newMonth += 1;
            newDay -= 28;
        }
    }
    
     if(month == 3){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 4){
        newDay = day+ addDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 5){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 6){
        newDay = day+ addDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 7){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 8){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month ==9){
        newDay = day+ addDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 10){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 11){
        newDay = day+ addDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 12){
        newDay = day+ addDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
   
    
    return new Date(newDay, newMonth, newYear);
    }
    
    
/**
 * this method subtracts days from the date
 * @param subDay = the number of days subtracted to the date
 * @return new Date = the new date that was made by subtracting the days from the date
 */
    public Date sub(int subDay){
    int newDay = day;
    int newMonth = month;
    int newYear = year;
   
 
    if(month == 1){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 2){
        newDay = day- subDay;
     if(year %4 == 0){
         if(newDay > 29){
             newMonth += 1;
             newDay -= 29;
            }
        }
    else if(newDay > 28){
            newMonth += 1;
            newDay -= 28;
        }
    }
    
     if(month == 3){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 4){
        newDay = day- subDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 5){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 6){
        newDay = day- subDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 7){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 8){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month ==9){
        newDay = day- subDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 10){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
    
     if(month == 11){
        newDay = day- subDay;
    if(newDay > 30){
            newMonth += 1;
            newDay -= 30;
        }
    }
    
     if(month == 12){
        newDay = day- subDay;
    if(newDay > 31){
            newMonth += 1;
            newDay -= 31;
        }
    }
   
    
    return new Date(newDay, newMonth, newYear);
}

/**
 * this method checks how many days in between the 2 dates
 * @param Date dateOne = the new date that is made
 * @return the total ammount of days in beteen the 2 dates
 */
public int dateDiff(Date dateOne)
{
    int month1 = 0;
    int month2 = 0;
    int year1 = 0;
    int year2 = 0;
    
    if(year % 4 == 0)
    {
        if(month == 1)
        {
            month1 = 31;
        }
        else if(month == 2)
        {
            month1 = 29+31;
        }
        else if(month == 3)
        {
            month1 = 31+29+31;
        }
        else if(month == 4)
        {
            month1 = 30+31+29+31;
        }
        else if(month == 5)
        {
            month1 = 31+30+31+29+31;
        }
        else if(month == 6)
        {
            month1 = 30+31+30+31+29+31;
        }
        else if(month == 7)
        {
            month1 = 31+30+31+30+31+29+31;
        }
        else if(month == 8)
        {
            month1 = 31+31+30+31+30+31+29+31;
        }
        else if(month == 9)
        {
            month1 = 30+31+31+30+31+30+31+29+31;
        }
        else if(month == 10)
        {
            month1 = 31+30+31+31+30+31+30+31+29+31;
        }
        else if(month == 11)
        {
            month1 = 30+31+30+31+31+30+31+30+31+29+31;
        }
        else if(month == 12)
        {
            month1 = 31+30+31+30+31+31+30+31+30+31+29+31;
        }
    }
    else
    {
       if(month == 1)
        {
            month1 = 31;
        }
        else if(month == 2)
        {
            month1 = 28+31;
        }
        else if(month == 3)
        {
            month1 = 31+28+31;
        }
        else if(month == 4)
        {
            month1 = 30+31+28+31;
        }
        else if(month == 5)
        {
            month1 = 31+30+31+28+31;
        }
        else if(month == 6)
        {
            month1 = 30+31+30+31+28+31;
        }
        else if(month == 7)
        {
            month1 = 31+30+31+30+31+28+31;
        }
        else if(month == 8)
        {
            month1 = 31+31+30+31+30+31+28+31;
        }
        else if(month == 9)
        {
            month1 = 30+31+31+30+31+30+31+28+31;
        }
        else if(month == 10)
        {
            month1 = 31+30+31+31+30+31+30+31+28+31;
        }
        else if(month == 11)
        {
            month1 = 30+31+30+31+31+30+31+30+31+28+31;
        }
        else if(month == 12)
        {
            month1 = 31+30+31+30+31+31+30+31+30+31+28+31;
        }  
    }
    
    if(year % 4 == 0)
    {
        if(dateOne.getMonth() == 1)
        {
            month2 = 31;
        }
        else if( dateOne.getMonth() == 2)
        {
            month2 = 29+31;
        }
        else if(dateOne.getMonth() == 3)
        {
            month2 = 31+29+31;
        }
        else if(dateOne.getMonth() == 4)
        {
            month2 = 30+31+29+31;
        }
        else if(dateOne.getMonth() == 5)
        {
            month2 = 31+30+31+29+31;
        }
        else if(dateOne.getMonth()== 6)
        {
            month2 = 30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 7)
        {
            month2 = 31+30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 8)
        {
            month2 = 31+31+30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 9)
        {
            month2 = 30+31+31+30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 10)
        {
            month2 = 31+30+31+31+30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 11)
        {
            month2 = 30+31+30+31+31+30+31+30+31+29+31;
        }
        else if(dateOne.getMonth() == 12)
        {
            month2 = 31+30+31+30+31+31+30+31+30+31+29+31;
        }
    }
    else
    {
       if(dateOne.getMonth() == 1)
        {
            month2 = 31;
        }
        else if(dateOne.getMonth() == 2)
        {
            month2 = 28+31;
        }
        else if(dateOne.getMonth() == 3)
        {
            month2 = 31+28+31;
        }
        else if(dateOne.getMonth() == 4)
        {
            month2 = 30+31+28+31;
        }
        else if(dateOne.getMonth() == 5)
        {
            month2 = 31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 6)
        {
            month2 = 30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 7)
        {
            month2 = 31+30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 8)
        {
            month2 = 31+31+30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 9)
        {
            month2 = 30+31+31+30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 10)
        {
            month2 = 31+30+31+31+30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 11)
        {
            month2 = 30+31+30+31+31+30+31+30+31+28+31;
        }
        else if(dateOne.getMonth() == 12)
        {
            month2 = 31+30+31+30+31+31+30+31+30+31+28+31;
        }  
    }
    diffMonth = month1 - month2;
    
    
    for(int k = year ; k > 0; k--)
    {
        if(year % 4 == 0)
        {
            year1 += 366;
        }
        else
        {
            year1 += 365;
        }
    }
    
    for(int k = dateOne.getYear(); k > 0; k--)
    {
        if( dateOne.getYear() % 4 == 0)
        {
            year2 += 366;
        }
        else
        {
            year2 += 365;
        }
    }
    
    diffYear = year1 - year2;
    
    diffDay = day - dateOne.getDay();

    return diffMonth + diffDay + diffYear;
}

/**
 * @return the remainding seconds in the year based off the date
 */
public int remSecs()
{
    Date newYear = new Date(1, 1, year+1);
    remainding = dateDiff(newYear) * 24 * 60 * 60;
    if(remainding < 0)
    {
        remainding = remainding * -1;
    }
    return remainding ;
}

/**
 * @return the remainding minutes in the year based off the date
 */
public int remMins()
{
    Date newYear = new Date(1, 1, year+1);
    remainding = dateDiff(newYear) * 24 * 60;
    if(remainding < 0)
    {
        remainding = remainding * -1;
    }
    return remainding ;
}

/**
 * @return the remainding hours in the year based off the date
 */
public int remHours()
{
    Date newYear = new Date(1,1, year+1);
    remainding = dateDiff(newYear) * 24;
    if(remainding < 0)
    {
        remainding = remainding * -1;
    }
    return remainding ;
}

/**
 * @return the remainding days in the year based off the date
 */
public int remDays()
{
    Date newYear = new Date(1, 1, year+1);
    remainding = dateDiff(newYear);
    if(remainding < 0)
    {
        remainding = (remainding * -1) - 1;
    }
    return remainding ;
}

/**
 * @return the remainding weeks in the year based off the date
 */
public int remWeeks()
{
    Date newYear = new Date(1, 1, year+1);
    remainding = dateDiff(newYear) / 7;
    if(remainding < 0)
    {
        remainding = remainding * -1;
    }
    return remainding ;
}

/**
 * @return the remainding months in the year based off the date
 */
public int remMonths()
{
    Date newYear = new Date(1, 1, year+1);
    remainding = dateDiff(newYear) / 30;
    if(remainding < 0)
    {
        remainding = (remainding * -1) - 1;
    }
    return remainding;
}

/**
 * this method outputs a sentense telling you what holiday it is for the date
 */
public void holidays()
{
    Date newYear = new Date (1,1,1);
    if(day == newYear.getDay() && month == newYear.getMonth())
    {
        System.out.println("Happy New Year");
    }
    Date mlkDay = new Date (20,1,1);
    if(day == mlkDay.getDay() && month == mlkDay.getMonth())
    {
        System.out.println("Happy Martin Luther King Jr");
    }
    Date vDay = new Date (14,2,1);
    if(day == vDay.getDay() && month == vDay.getMonth())
    {
        System.out.println("Happy Valintine Day");
    }
    Date prezDay = new Date(17,2,1);
    if(day == prezDay.getDay() && month == prezDay.getMonth())
    {
        System.out.println("Happy President Day");
    }
    Date patDay = new Date(17,3,1);
    if(day == patDay.getDay() && month == patDay.getMonth())
    {
        System.out.println("Happy St.Patrick Day");
    }
    Date easter = new Date(21,4,1);
    if(day == easter.getDay() && month == easter.getMonth())
    {
        System.out.println("Happy Easter");
    }
    Date memorial= new Date(26,5,1);
    if(day == memorial.getDay() && month == memorial.getMonth())
    {
        System.out.println("Happy Memorial Day");
    }
    Date independence = new Date(4,7,1);
    if(day == independence.getDay() && month == independence.getMonth())
    {
        System.out.println("Happy 4th of July");
    }
    Date vetDay = new Date(11,11,1);
    if(day == vetDay.getDay() && month == vetDay.getMonth())
    {
        System.out.println("Happy Veteran's Day");
    }
    Date thanksgiving = new Date(27,11,1);
    if(day == thanksgiving.getDay() && month == thanksgiving.getMonth())
    {
        System.out.println("Happy Thanksgiving Day");
    }
    Date christmas = new Date(25,12,1);
    if(day == christmas.getDay() && month == christmas.getMonth())
    {
        System.out.println("Merry Christmas");
    }
}
    
}



