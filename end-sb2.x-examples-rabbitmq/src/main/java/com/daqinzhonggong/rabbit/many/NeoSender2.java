package com.daqinzhonggong.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NeoSender2 {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot daqinzhonggong queue"+" ****** "+i;
		System.out.println("Sender2 : " + context);
		this.rabbitTemplate.convertAndSend("daqinzhonggong", context);
	}

}