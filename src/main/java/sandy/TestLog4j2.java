package sandy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j2 {
	
	private static Logger logger=LogManager.getLogger(TestLog4j2.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		// starting logs
		
		logger.debug("this is debug message");
		logger.info("this is the information");
		logger.trace("this is trace message");
		logger.error("this is error logs");
		logger.fatal("this is fatal logs");
		

	}

}
