import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Compare2TimeZoneDates {

	 public static void main(String[] args) throws InterruptedException {
	        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST
	        ZoneId estZone = ZoneId.of("America/New_York"); // EST

	        ZonedDateTime istTime = ZonedDateTime.now(istZone);
	        Thread.sleep(4000); // To introduce small difference
	        ZonedDateTime estTime = ZonedDateTime.now(estZone);

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a z");
	        System.out.println("Current IST Time  : " + istTime.format(formatter));
	        System.out.println("Current EST Time  : " + estTime.format(formatter));

	        Instant istInstant = istTime.toInstant();
	        Instant estInstant = estTime.toInstant();

	        System.out.println("IST Instant  : " + istInstant);
	        System.out.println("EST Instant  : " + estInstant);

	        Duration diff = Duration.between(istInstant, estInstant);

	        if (estInstant.isAfter(istInstant)) {
	            System.out.println("✅ EST is ahead of IST by " +
	                diff.toHoursPart() + " hours, " +
	                diff.toMinutesPart() + " minutes, " +
	                diff.toSecondsPart() + " seconds.");
	        } else if (estInstant.isBefore(istInstant)) {
	            System.out.println("❌ EST is behind IST by " +
	                diff.abs().toHoursPart() + " hours, " +
	                diff.abs().toMinutesPart() + " minutes, " +
	                diff.abs().toSecondsPart() + " seconds.");
	        } else {
	            System.out.println("⚠️ Both times are equal.");
	        }
	    }

}
