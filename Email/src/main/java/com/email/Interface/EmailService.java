package com.email.Interface;

import com.email.Entity.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);
}
