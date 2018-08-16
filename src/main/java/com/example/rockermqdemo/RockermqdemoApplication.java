package com.example.rockermqdemo;

import com.example.rockermqdemo.rocketmq.RocketMQConsumer;
import com.example.rockermqdemo.rocketmq.RocketMQProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RockermqdemoApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(RockermqdemoApplication.class, args);
		RocketMQProvider rocketMQProvider=applicationContext.getBean(RocketMQProvider.class);
		rocketMQProvider.defaultProducer();

		RocketMQConsumer rocketMQConsumer=applicationContext.getBean(RocketMQConsumer.class);
		rocketMQConsumer.defaultMQPushConsumer();
	}
}
