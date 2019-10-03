package com.john.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.john.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
