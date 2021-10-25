package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogs {
	
	

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		
		Logger log = Logger.getLogger("devpinoyLogger");
		
		log.info("This is the information log");
		
		log.error("Here the error logs will be printed");
		log.info("another ");
		
		

		
		
	}

}
