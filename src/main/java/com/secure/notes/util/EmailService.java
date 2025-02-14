package com.secure.notes.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendPasswordResetEmail(String to, String resetUrl){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("패스워드 리셋 요청");
        message.setText("링크를 클릭해 패스워드 리셋 : " + resetUrl);
        mailSender.send(message);
    }
}
