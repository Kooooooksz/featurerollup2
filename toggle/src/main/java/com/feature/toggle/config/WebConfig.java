package com.feature.toggle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Minden végpont
                .allowedOrigins("http://localhost:4200") // Angular alkalmazás URL-je
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Engedélyezett HTTP metódusok
                .allowedHeaders("*") // Minden fejléctípus
                .allowCredentials(true); // Ha szükséges a sütik engedélyezése
    }
}
