package geniuss;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Magic {
	static Logger logger=Logger.getLogger(Magic.class);

	public static void main(String[] args) {
     String str="Magician's Paradise";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("i am not a magician"  +str);

	}

}
