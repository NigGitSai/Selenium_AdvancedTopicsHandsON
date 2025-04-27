package YamlFileReading;

import java.io.InputStream;
import java.util.Map;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

public class ReadServerYamlFile {

	@Test
	public void readYamlFile()
	{
		Yaml yaml = new Yaml();
		InputStream ip =   ReadServerYamlFile.class.getClassLoader().getResourceAsStream("Server.yaml");
	     Map<String,Object> yamlMDataInMap =	yaml.load(ip);
	     Map<String,Object> obj =  (Map<String,Object>)   yamlMDataInMap.get("server");
	     System.out.println("Host name :"+obj.get("host"));
	     
	     System.out.println("Port name :"+obj.get("port"));
		
	}

}
