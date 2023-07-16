package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));

	}

}