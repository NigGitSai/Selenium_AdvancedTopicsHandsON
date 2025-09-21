import java.time.ZonedDateTime;
		import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.ZoneId;
		
public class ConvertISTToGMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  // Step 1: Define the formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a 'IST'", Locale.ENGLISH);
	
		        String input = "June 12, 2025 11:32:00 am IST";
		     // Step 2: Parse the string as ZonedDateTime
		        
		       // LocalDateTime localDateTime = LocalDateTime.parse(input,formatter);
		        
		        ZonedDateTime istTime = ZonedDateTime.parse(input, formatter);

		      

		        
		       

		        // Step 3: Convert to GMT
		        ZonedDateTime gmtTime = istTime.withZoneSameInstant(ZoneId.of("GMT"));

		        System.out.println("IST Time: " + istTime);
		        System.out.println("GMT Time: " + gmtTime);
		        
		        System.out.println("String input IST date "+input);
		        System.out.println("String input GMT date "+gmtTime.format(formatter));
		    }
		


	

}

