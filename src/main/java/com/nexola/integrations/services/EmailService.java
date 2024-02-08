package com.nexola.integrations.services;

import com.nexola.integrations.dto.EmailDTO;

public interface EmailService {
    void sendEmail (EmailDTO dto);
}
