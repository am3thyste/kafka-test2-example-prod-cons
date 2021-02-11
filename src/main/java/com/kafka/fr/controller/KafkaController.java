package com.kafka.fr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.fr.service.KafkaService;

@RestController
@RequestMapping(value="/kafkamessage")
public class KafkaController {
	
	@Autowired
	KafkaService kafkaService;

	@GetMapping(value="/producer")
	public String producer (@RequestParam("message")String message) {
		kafkaService.send(message);
		
		return "OK";
	}
	
}
