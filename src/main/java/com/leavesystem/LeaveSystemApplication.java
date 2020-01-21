package com.leavesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Ankit
 *
 */

@SpringBootApplication
@ComponentScan("com.leavesystem")
@Import(GatewayWebConfig.class)
public class LeaveSystemApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LeaveSystemApplication.class, args);
	}

}
