import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeZoneComparisonFixed {
    public static void main(String[] args) {
        // Zone definitions
    	
        String inputDateTimeStr = "June 23, 2025 10:30:00 AM America/New_York";

        // ✅ Split the string to extract datetime and zone
        String[] parts = inputDateTimeStr.split(" (?=\\S+$)"); // splits before last space
        String dateTimePart = parts[0];                        // "June 23, 2025 10:30:00 AM"
        String zonePart = parts[1];                            // "America/New_York"

        // ✅ Prepare formatter
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a", Locale.ENGLISH);

        // ✅ Parse LocalDateTime
        LocalDateTime inputLocalDateTime = LocalDateTime.parse(dateTimePart, inputFormatter);

        // ✅ Attach input time zone
        ZoneId inputZone = ZoneId.of(zonePart);
        ZonedDateTime inputZonedDateTime = inputLocalDateTime.atZone(inputZone);

        // ✅ Convert to IST
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime inputInIST = inputZonedDateTime.withZoneSameInstant(istZone);

        // ✅ Get current IST time
        ZonedDateTime currentIST = ZonedDateTime.now(istZone);

        // ✅ Formatter for output
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a z", Locale.ENGLISH);

        // ✅ Display times
        System.out.println("Input Time Converted to IST : " + inputInIST.format(outputFormatter));
        System.out.println("Current IST Time            : " + currentIST.format(outputFormatter));

        // ✅ Compare
        if (inputInIST.isAfter(currentIST)) {
            System.out.println("🟢 Input time is in the FUTURE (after current IST).");
        } else if (inputInIST.isBefore(currentIST)) {
            System.out.println("🔴 Input time is in the PAST (before current IST).");
        } else {
            System.out.println("🟡 Input time is EXACTLY same as current IST.");
        }
    }
        
}