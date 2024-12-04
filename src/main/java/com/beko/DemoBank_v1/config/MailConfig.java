package com.beko.DemoBank_v1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public static JavaMailSender getMailConfig(){
        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();

        // Set SMTP server properties
        Properties props = emailConfig.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        // Set mail credentials
        emailConfig.setHost("smtp.gmail.com");  // Example: Gmail SMTP server
        emailConfig.setPort(587);  // Port for Gmail
        emailConfig.setUsername("your-email@gmail.com");  // Your email
        emailConfig.setPassword("your-email-password");  // Your email password

        return emailConfig;
    }
}

