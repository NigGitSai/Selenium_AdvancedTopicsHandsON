package JavaFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingusingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("./FileReadtest.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line ="";
		while((line=bf.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
