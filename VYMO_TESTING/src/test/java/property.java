import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property {
	public static String propertyfile(String input) throws IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\gomat\\eclipse-workspace\\VYMO_TESTING\\src\\test\\resources\\property file\\credentials");
Properties p=new Properties();
 p.load(f);
return p.getProperty(input);

	}
}
