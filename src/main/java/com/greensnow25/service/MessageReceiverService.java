package com.greensnow25.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Class MessageReciver.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 30.12.18
 */
@Service
//@EnableRabbit
public class MessageReceiverService {

    @RabbitListener(queues = "app1-queue")
    public void receiveMessage(final Message message) {
        System.out.println("Message    =   " + message.toString());
    }

}
