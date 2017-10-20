package com.turreta.spring.multiple.properties.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaSpringMultiplePropertiesDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(ComTurretaSpringMultiplePropertiesDemoApplication.class, args);

		AllConfig allConfig = ctxt.getBean(AllConfig.class);

		System.out.println(allConfig.getConfig001Field001());
		System.out.println(allConfig.getConfig001Field002());
		System.out.println(allConfig.getConfig001Field003());

		System.out.println(allConfig.getConfig002Field001());
		System.out.println(allConfig.getConfig002Field002());
		System.out.println(allConfig.getConfig002Field003());

		System.out.println(allConfig.getAppDescription());
	}
}
