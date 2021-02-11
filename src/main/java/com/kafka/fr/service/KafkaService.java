package com.kafka.fr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate <String, String> kafkaTemplate;
	
	String kafkaTopic = "newtopickafka2";
	
	public void send(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}
}
