package SeleniumFileManagement;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.io.Zip;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZipAndUnZipFile {
	
	
	@Test
	public void zipFile() throws IOException
	{
		String src = Zip.zip(new File("./src/test/resources/TestWebSite.pdf"));
		
		byte[] byteArr = Base64.getDecoder().decode(src);
		
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("./src/test/resources/TestZip.zip")),10000);
		
		stream.write(byteArr);
		stream.close();
		
		
	}
	
	@Test
	public void unzipFile() throws FileNotFoundException, IOException
	{
		Zip.unzip(new FileInputStream("./src/test/resources/LoginTest.zip"), new File("./src/test/resources/unzipFolder"));
	}
	
	
}
