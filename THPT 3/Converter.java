
/**
 * This program is made to convert numbers between 0 and 9 into a word format rather then keeping them in their number format
 * 
 * Christian Spratt-Wilks
 *  2/27/13
 */
public class Converter
{
   private String original; //the original string
   private StringBuilder converted; //the converted string
   
   public Converter(String input)
   {
       original = input; //input from file
       converted = new StringBuilder(input); //makes the string changable
   }
   
   public void convert()
   {
              for(int i = 0; i < converted.length(); i++) //for loop to go through all of the sentences
        {
            
            if(i != 0 && i < converted.length()-1){ //doesnt include 0 in whats going to happen in the if statement
                
            if(converted.charAt(i) == '0' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ') // checks if there is a space beside and before the number and if
                                                                                                           // there is then it doesnt change it to a word
            {
                converted.replace(i, i+1, "Zero");
            }
            
            if(converted.charAt(i) == '1' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "One"); 
            }
            
            if(converted.charAt(i) == '2' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Two");
            }
            
            if(converted.charAt(i) == '3' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Three");
            }
            
            if(converted.charAt(i) == '4' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Four");
            }
            
            if(converted.charAt(i) == '5' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Five");
            }
            
            if(converted.charAt(i) == '6' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Six");
            }
            
            if(converted.charAt(i) == '7' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Seven");
            }
            
            if(converted.charAt(i) == '8' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Eight"); 
            }
            
            if(converted.charAt(i) == '9' && converted.charAt(i-1) == ' ' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Nine");
            }
            
          }
          
           if(i == 0){
                
            if(converted.charAt(i) == '0' && converted.charAt(i+1) == ' ') //same as the if statement above but for only if the number is in front of the sentence 
            {
                converted.replace(i, i+1, "Zero");
            }
            
            if(converted.charAt(i) == '1' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "One"); 
            }
            
            if(converted.charAt(i) == '2' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Two");
            }
            
            if(converted.charAt(i) == '3' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Three");
            }
            
            if(converted.charAt(i) == '4' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Four");
            }
            
            if(converted.charAt(i) == '5' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Five");
            }
            
            if(converted.charAt(i) == '6' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Six");
            }
            
            if(converted.charAt(i) == '7' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Seven");
            }
            
            if(converted.charAt(i) == '8' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Eight"); 
            }
            
            if(converted.charAt(i) == '9' && converted.charAt(i+1) == ' ')
            {
                converted.replace(i, i+1, "Nine");
            }
            
          }
          
        }
   }
   
    public String getOriginal(){
        return original; //gets the file
    }
   
    public String getConverted(){
        return converted.toString(); //returns the changed txt to the driver for output
    }
   
}
