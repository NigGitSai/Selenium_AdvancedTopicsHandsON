package Java8;

import java.io.File;
import java.io.FileFilter;

public class FindHiddenFilesInsideFolder {
	
	public static void main(String[] args) {
		
	File[] hiddenFiles =	new File("src/test/resources/").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
		});
	
	for(File file1 : hiddenFiles)
	{
		System.out.println(file1.getName());
		System.out.println(file1.getAbsolutePath());
	}
	}

}
