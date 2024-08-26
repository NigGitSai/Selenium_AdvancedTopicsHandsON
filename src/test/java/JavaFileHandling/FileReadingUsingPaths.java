package JavaFileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class FileReadingUsingPaths {
	
	@Test
	public void fileReadingTest() throws IOException
	{
		String filePath = "./FileReadtest.txt";
		
		Stream<String> lines = Files.lines(Paths.get(filePath));
		lines.forEach(System.out::println);
		{
			
		}
	}

}
