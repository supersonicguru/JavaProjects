
/**
 * This class holds all the methods and fields to calculate the discount price,tax price, and the final price of a customer's item.
 * 
 * @author Christian Spratt-Wilks
 * @version 2/22/14
 */
public class THPT2
{
  private double priceOfItem; //the price of the item
  private double discountPercent; //the discount percent
  private double taxRate; //the tax
  private double finalPrice; //the final price
  private double discountPrice; //the discount price
  private double taxPrice; //the tax price
  
  /**
   * This method sets the discountPercent and taxRate to a certain number
   * @param discountPercent is the discount percent for the item
   * @param taxRate is the tax for the item
   */
  public THPT2(){
      discountPercent = 0.10;
      taxRate = 0.075;
    }
  
   /**
    * this method does the math for the discount price
    * @return discountPrice is the item price with the discount applied
    */
  public double calcDiscountPrice(){
      discountPrice = priceOfItem - (priceOfItem*discountPercent);
      return discountPrice;
    }
    
    /**
     * this method does the math for the tax price
     * @return taxPrice is the item price with the discount and tax applied
     */
  public double calcTaxPrice(){
      taxPrice = discountPrice * taxRate;
      return taxPrice;
    }
    
    /**
     * this method does the math for the final price
     * @return finalPrice is the item price with everything applied
     */
  public double calcFinalPrice(){
      finalPrice = discountPrice + taxPrice;
      return finalPrice;
    }
    
    /**
     * this method just returns the price that the customer entered
     * @return the price of the item
     */
  public double setPrice(double newPrice){
      priceOfItem = newPrice;
      return newPrice;
    }
    
    /**
     * this method just returns the discount that the customer entered
     * @return the discount of the item
     */
  public double setDiscountPercent(double newDiscount){
        discountPercent = newDiscount;
        return newDiscount;
    }

    /**
     * this method just returns the orginal price of the item
     * @return the original price of the item
     */
  public double getPrice(){
      return priceOfItem;
    }
    
    /**
     * this method just returns the original discount of the item
     * @return the original discount of the item
     */
  public void getDiscountPercent(double newDiscount){
        discountPercent = newDiscount;
    }
   
    
 
}
