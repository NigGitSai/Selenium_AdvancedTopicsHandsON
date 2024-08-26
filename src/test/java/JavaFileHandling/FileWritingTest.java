package JavaFileHandling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;



public class FileWritingTest {
	String content = "Selenium WebDriver, a collection of language specific bindings to drive a browser - the way it is meant to be driven.";
	@Test
	public void usingFileWriter() throws IOException
	{
		
		
		FileWriter fw = new FileWriter("./UsingFileWriter.txt");
		fw.write(content);
		fw.close();
	}
	
	@Test
	public void usingBufferedWriter() throws IOException
	{
		
		
		FileWriter fw = new FileWriter("./UsingBufferedWriter.txt");
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write(content);
		bf.close();
		fw.close();
	}

	@Test
	public void usingFileOutputStream() throws IOException
	{
		
		
		FileOutputStream fos = new FileOutputStream("./UsingFOS.txt");
		
		byte[] byteArrContent= content.getBytes();
		fos.write(byteArrContent);
		fos.close();
	}
	
	@Test
	public void usingPath() throws IOException
	{
		
		Path path = Paths.get("./UsingPaths.txt");
		Files.write(path, content.getBytes());
	}
}	
