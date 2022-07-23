package com.assignment.assignment01;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.assignment.assignment01.Util.IOUtil.*;

//Main method - To read and get the directory
@SpringBootApplication
public class Assignment01Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Assignment01Application.class);

	public static void main(String[] args) {
		//To read the input directory
		SpringApplication app = new SpringApplication(Assignment01Application.class);
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
		List<String> opsVal = appArgs.getOptionValues("dataDir");
		System.out.println(opsVal);
		if (opsVal != null) {
			logger.info("" + (String) opsVal.get(0));
			createDir((String) opsVal.get(0));
		} 
		else {
			logger.warn("No data directory was provided");
			System.exit(1);
		}
		app.run(args);
	}
}
