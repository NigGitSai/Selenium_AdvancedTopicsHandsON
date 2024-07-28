package PDFValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PDFValidationTest {
	
static ChromeDriver driver;	
PDDocument pdfDocument;
PDFTextStripper pdfText;

	
	
	@Test(enabled = false)
	public void pdfValidationTestOffline() throws IOException
	{
		File file = new File("./src/test/resources/TestPDF.pdf");
		
		FileInputStream ip = new FileInputStream(file);
		
		 pdfDocument = PDDocument.load(ip);
		int pageCount = pdfDocument.getNumberOfPages();
		System.out.println("PDF page count : "+pageCount );
		
		 pdfText =  new PDFTextStripper();
		
		String pdfTextString = pdfText.getText(pdfDocument);
		System.out.println("PDF Text");
		System.out.println(pdfTextString);
		
		Assert.assertTrue(pdfTextString.startsWith("Lorem ipsum"));
		Assert.assertTrue(pdfTextString.contains("Etiam vehicula luctus fermentum"));
	}

	@Test(enabled = true)
	public void pdfValidationTestOnline() throws IOException
	{
		
		URL url = new URL("https://file-examples.com/storage/fe3f15b9da66a36baa1b51a/2017/10/file-example_PDF_500_kB.pdf");
		pdfDocument = PDDocument.load(url.openStream());
		pdfText = new PDFTextStripper();
		//To read text from 1 and 2 pages
		pdfText.setStartPage(1);
		pdfText.setEndPage(2);
		
		String strippedText = pdfText.getText(pdfDocument);
		System.out.println(strippedText);
		
		System.out.println("==============================================");
		
		//To read only page 3
		pdfText.setStartPage(3);
		pdfText.setEndPage(3);
		strippedText = pdfText.getText(pdfDocument);
		System.out.println(strippedText);
		
	}

}
