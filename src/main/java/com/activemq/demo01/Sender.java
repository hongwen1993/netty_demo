package com.activemq.demo01;

import org.apache.activemq.ActiveMQConnectionFactory;


import javax.jms.*;

public class Sender {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory("hongwen1993", "hongWEN0928", "tcp://localhost:61616");
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        MessageProducer messageProducer = session.createProducer(session.createQueue("Test.MySQLQueue"));
        messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);
        for (int i = 0; i < 5; i++) {
            TextMessage textMessage = session.createTextMessage("Message : " + i);
            messageProducer.send(textMessage);
        }
        connection.close();




    }
}
