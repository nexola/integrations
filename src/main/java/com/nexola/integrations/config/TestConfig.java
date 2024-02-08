package com.nexola.integrations.config;

import com.nexola.integrations.services.EmailService;
import com.nexola.integrations.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    EmailService emailService() {
        return new MockEmailService();
    }
}
