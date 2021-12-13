package com.NotificationPreferencesService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationPreferencesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationPreferencesServiceApplication.class, args);
	}


//	@Bean(initMethod = "start", destroyMethod = "stop")
//	public Server inMemoryH2DatabaseServer() throws Exception  {
//		return Server.createTcpServer(
//				"-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
//
//	}


}
