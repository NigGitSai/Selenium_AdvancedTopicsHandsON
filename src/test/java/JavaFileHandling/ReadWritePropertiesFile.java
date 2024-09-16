package JavaFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		
		
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		System.out.println("Browser Name :"+browser);
		
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/config.properties");
		prop.setProperty("browser", "firefox");
		prop.store(fos,null);
		fis.close();
		fos.close();
		
	}

}
