/**
 * 
 */
package com.boot.eureka.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author magantilavakumar
 *
 */
@RestController
@RequestMapping(value = "/connector")
public class KafkaConnetorController {

	
	@GetMapping(value = "/get")
	public String getConnector() {
		return "Welcome Kafka Connector";
	}
}
