import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.time.format.DateTimeParseException;
	import java.util.*;
public class CheckDateFormat {
	



	    // Define possible formats
	    private static final List<String> DATE_PATTERNS = Arrays.asList(
	        "dd-MM-yyyy",
	        "dd/MM/yyyy",
	        "yyyy-MM-dd",
	        "MM/dd/yyyy"
	        // add more patterns as needed
	    );

	    public static String detectFormat(String dateStr) {
	        for (String pattern : DATE_PATTERNS) {
	            try {
	                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
	                LocalDate date = LocalDate.parse(dateStr, formatter);
	                // Successfully parsed
	                return pattern;
	            } catch (DateTimeParseException e) {
	                // Ignore and try next
	            }
	        }
	        return null; // Unknown format
	    }

	    public static void main(String[] args) {
	        String date1 = "20-05-2022";
	        String date2 = "20/05/2022";

	        System.out.println("Detected format for '" + date1 + "': " + detectFormat(date1));
	        System.out.println("Detected format for '" + date2 + "': " + detectFormat(date2));
	    }
	}

}
