package refapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application starter class
 */
@SpringBootApplication
public class Application 
{
	/**
	 * Main entry method
	 * @param args arguments
	 */
    public static void main(String[] args)
    {
    	SpringApplication.run(Application.class, args);
    }
}