package StreamsAPI_FunctionsPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AnyMatch_PracticeMedium {

	@Test
	public void checkPasswordLessThan8Char()
	{
		List<String> passwords = Arrays.asList("password1", "admin", "12345678", "qwerty");
		// Use anyMatch to check if any password is too short
		boolean blFlag =  passwords.stream().anyMatch(pw->pw.length()<8);
		System.out.println("Password length less than 8 char : "+blFlag);
		
	}
	
	@Test
	public void checkProductExpiry()
	{
		List<Products> products = Arrays.asList(
			    new Products("Milk", LocalDate.of(2025, 4, 20)),
			    new Products("Bread", LocalDate.of(2025, 4, 25))
			);
		  boolean blFlag = products.stream().anyMatch(p->p.getExpiryDate().isBefore(LocalDate.now()));
		  System.out.println("Is there any expired product : "+blFlag);
	}
	
	@Test
	public void checkOrdersPendingStatus()
	{
		List<Orders> orders = Arrays.asList(
			    new Orders("O1", "Delivered"),
			    new Orders("O2", "Pending"),
			    new Orders("O3", "Cancelled")
			);
		
		boolean blFlag = orders.stream().anyMatch(o -> o.getStatus().equals("Pending"));
		System.out.println("is there any order with pending status : "+blFlag);
	}
}
