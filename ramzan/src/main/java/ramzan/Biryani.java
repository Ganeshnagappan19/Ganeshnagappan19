package ramzan;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Biryani {
	static Logger logger=Logger.getLogger(Biryani.class);

	public static void main(String[] args) {
      String str="Biryani ready";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("chicken biryani");
		logger.warn("biryani yet to empty");
		logger.error("biryani empty");

	}

}
