package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class FindTheFirstNonRepeatedChar {

	
	@Test (enabled = false)
	public void findTheFirstNonRepeatedChar()
	{
		String text ="opposite";
		boolean flag = true;  
		  
        for(char i :text.toCharArray())  
        {  
        	System.out.println("index of "+text.indexOf(i));
        	System.out.println("last index of "+text.lastIndexOf(i));
            if (text.indexOf(i) == text.lastIndexOf(i))  
            {  
                System.out.println("The first character which is not repeating is: "+ i);  
                flag = false;  
                break;  
            }  
        }  
        if(flag== true){  
            System.out.println("There is no non-repeating character in the input string");  
}  
	}
	
	
	@Test
	public void method2()
	{
		String string = "geeksforgeeks";  
        Set<Character> repeatingChar = new HashSet<>();  
        List<Character> nonRepeatingChar = new ArrayList<>();  
        for (int i = 0; i < string.length(); i++) {  
            char ch = string.charAt(i);  
            if (repeatingChar.contains(ch)) {  
                continue;  
            }  
            if (nonRepeatingChar.contains(ch)) {  
                nonRepeatingChar.remove((Character) ch);  
                repeatingChar.add(ch);  
            } else {  
                nonRepeatingChar.add(ch);  
            }  
        }  
        if (!nonRepeatingChar.isEmpty()) {  
            char firstChar = nonRepeatingChar.get(0);  
            System.out.println("The first character which is not repeating is:" + firstChar);  
        } else {  
            System.out.println("There is no non-repeating character in the input string.");  
        }  
    }  
	
}
