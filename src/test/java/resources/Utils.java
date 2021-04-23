package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("/Users/juthika/eclipse-workspace/apitest-framework/src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
	}
}
