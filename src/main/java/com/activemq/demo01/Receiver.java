package com.activemq.demo01;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Receiver {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER, ActiveMQConnectionFactory.DEFAULT_PASSWORD, "tcp://localhost:61616");
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        MessageConsumer messageConsumer = session.createConsumer(session.createQueue("queue1"));
        while (true) {
            TextMessage msg = (TextMessage) messageConsumer.receive();
            if (msg == null) break;
            System.out.println("收到内容 : " + msg.getText());
        }

        if (connection != null) {
            connection.close();
        }





    }
}
