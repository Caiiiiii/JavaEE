package test;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class log4jTest {
 @Test
 public void log4jTest(){
//	 PropertyConfigurator.configure("log4j.properties");
     Logger logger = Logger.getLogger(log4jTest.class);
     logger.debug("debug");
     logger.error("error");
 }
}
