
/**
 * This uses the THPT2 class that is made.
 * 
 * @author Christian Spratt-Wilks 
 * @version 2/22/14
 */

import java.util.*;

public class Driver
{
    public static void main(String [] args)
 {
    THPT2 sale;
    double paidFor; //holds the amount of money the customer used to pay for the item
    double changeBack; //the amount of money the customeer get back
    char ask; //ask the customer to pay for another item
   
    Scanner input = new Scanner(System.in);
    do{
        sale = new THPT2();
        
    System.out.println("Please enter the price of the item you bought: ");
    sale.setPrice(input.nextDouble());
    
    System.out.println("How many dollars did you spend to pay for this item?: ");
    paidFor = input.nextDouble();
    
    sale.calcDiscountPrice();
    
    sale.calcTaxPrice();
    
    changeBack = paidFor - sale.calcFinalPrice();
    
    System.out.println("The original price of the item you bought is $" + sale.getPrice());
    
    System.out.println("The discount price of the item you bought is $" + sale.calcDiscountPrice());
    
    System.out.println("The final price for your item is: $" + sale.calcFinalPrice());
    
    System.out.println("You get $" + changeBack + " is your change back");
    
    System.out.println("Now enter a different discount percent for your item");
    sale.setDiscountPercent(input.nextDouble());
    
    System.out.println("How many dollars did you spend to pay for this item?: ");
    paidFor = input.nextDouble();
    
    sale.calcDiscountPrice();
    
    sale.calcTaxPrice();
    
    changeBack = paidFor - sale.calcFinalPrice();
    
    System.out.println("The original price of the item you bought is $" + sale.getPrice());
    
    System.out.println("The discount price of the item you bought is $" + sale.calcDiscountPrice());
    
    System.out.println("The final price for your item is: $" + sale.calcFinalPrice());
    
    System.out.println("You get $" + changeBack + " is your change back");
    
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Would you like to buy another item? y for yes and n for");
    ask = reader.next().charAt(0);
    
}while(ask == 'y');
}


}
