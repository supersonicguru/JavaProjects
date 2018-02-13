
/**
 *TestCurrencyConverter is a driver written to test
 *all the methods of the CurrencyConverter class
 * 
 * @author L. Lehmann 
 * @version 2-01-2014
*/
public class TestCurrencyConverter
{
   public static void main(String[ ] args)
   {
       CurrencyConverter convert; //declare a reference variable
       convert = new CurrencyConverter(1.0, 'd'); //create a CurrencyConverter object
       
       //Test each currency and print the results for each test
       System.out.println("Test 1 set dollars");
       System.out.println("Dollars: " + convert.getAmount('d') + "\nEuro: " +  convert.getAmount('e') 
                          + "\nPounds: " + convert.getAmount('p') + "\nYen: " + convert.getAmount('y'));
                          
      System.out.println("\nTest 2 set the euro");
      convert.setAmount(1,'e');;
      System.out.println("Dollars: " + convert.getAmount('d') + "\nEuro: " +  convert.getAmount('e') 
                          + "\nPounds: " + convert.getAmount('p') + "\nYen: " + convert.getAmount('y'));
      
  
     //write two more sets of code like above to test the set with Yen and the set with Pounds                  
   }
}
