import java.util.*;
/**
 * This program tests different methods that interact with an array
 * 
 * Christian Spratt-Wilks
 * 4/19/14
 */
public class ArrayFunctions implements ArrayFunctionsInterface
{
     /**
      * This method prints out the array
      * @param testArray = the array in the driver that we are using
      */
    public void printMe(double [] testArray)
    {
        for(int k =0; k<testArray.length; k++)
        {
            System.out.println(testArray[k]);
        }
    }
  
    /**
     * This method sorts the array in ascending order
     * @param stestArray = the array in the driver that we are using
     * @return returns the array sorted
     */
    public double [] sortMe(double [] testArray)
    {
        double [] sortedTestArray = new double [8];
        for(int k = 0; k < testArray.length; k++)
        {
            sortedTestArray[k] = testArray[k];
        }
        
        Arrays.sort(sortedTestArray);
        return sortedTestArray;
    }
    
    /**
     * This method finds the greatest number in the array
     * @param testArray = the array in the driver that we are using
     * @return the greatest number in the array
     */
    public double getMax(double [] testArray)
    {
        double max = testArray[0];
        
        for(int k =0; k<testArray.length; k++)
        {
            if(max < testArray[k])
            {
                max = testArray[k];
            }
        }
        return max;
    }
    
    /**
     * This method finds the lowest number in the array
     * @param testArray = the array in the driver that we are using
     * @return the lowest number in the array
     */
    public double getMin(double [] testArray)
    {
        double min = testArray[0];
        
        for(int k =0; k<testArray.length; k++)
        {
            if(min > testArray[k])
            {
                min = testArray[k];
            }
        }
        return min;
    }
    
    /**
     *This method adds up all the numbers in the array
     *@param testArray = the array in the driver that we are using
     *@return the sum of all the numbers in te array
     */
    public double sumMeUp(double [] testArray )
    {
        double sum = 0;
        
        for(int k =0; k<testArray.length; k++)
        {
           sum = sum + testArray[k];
        }
        return sum;
    }
    
    /**
     * This method reverses the order of the numbers
     * @param testArray = the array in the driver that we are using
     * @return it returns the new array
     */
    public double [] reverseMe(double [] testArray)
    {
        double [] newTestArray = new double [8];
        
        for(int k =0; k<testArray.length; k++)
        {
           newTestArray[k] = testArray[testArray.length - k - 1];
           
        }
        return newTestArray;
    }
    
    /**
     * This method finds the index of whatever number is being asked for
     * @param testArray = the array in the driver that we are using
     * @param found = the number that is being searched for
     * @return it returns the index of the found number
     * @return returns -1 if it doesn't find the number
     */
    public int whereAmI(double [] testArray, double found)
    {
        for(int k =0; k<testArray.length; k++)
        {
          if(found == testArray[k])
          {
              return k;
          }
        }
        return -1;
    }
    
    /**
     * This method doubles the size of the array
     * @param testArray = the array in the driver that we are using
     * @return it returns the new array
     */
    public double [] doubleMySize(double [] testArray)
    {
        double [] doubleTestArray = new double [testArray.length * 2];
        
        for(int k =0; k<testArray.length; k++)
        {
           doubleTestArray[k] = testArray[k];
        }
        return doubleTestArray;
    }
}
