
/**
 * this displays the ammount of of euros, yen, or great britain pounds you have
 * 
 * Christian Spratt-Wilks
 * version 0.1
 */

import javax.swing.JOptionPane;

public class Driver
{
   public static void main(String [ ] args)
   {
       CurrencyConverter tc;
       tc = new CurrencyConverter( );
       
       System.out.println("The ammount of euros you have is " + tc.getCurrencyConverter('E') );
       System.out.println("The ammount of yen you have is " + tc.getCurrencyConverter('Y') );
       System.out.println("The ammount of great britain pounds  you have is " + tc.getCurrencyConverter('G') );

    }
}
