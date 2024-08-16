package StringPrograms;

public class RemoveDuplicatesEx4 {
	
	public static void removeDuplicates(String str)   
    {   
        //Create an empty string   
        String newstr = new String();   
          
        //calculate length of the original string  
        int length = str.length();   
            
        // Traverse the string and check for the repeated characters   
        for (int i = 0; i < length; i++)    
        {   
            // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                System.out.println("charAtPosition :"+charAtPosition);
                System.out.println("newstr.indexOf(charAtPosition) :"+newstr.indexOf(charAtPosition));
            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
            	
                newstr += charAtPosition; 
                
            }   
        }   
        //Print string after removing duplicate characters   
        System.out.println(newstr);  
    }   
    
    // main() method start  
    public static void main(String[] args)   
    {   
        // Create a string variable with default value   
        String str = "JavaTpoint";   
        //call removeDuplicates() method for removing duplicate characters    
        removeDuplicates(str.toLowerCase());   
    }   

}
