package com.example.rama.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Solo para APIs, no para todo
                .allowedOrigins("https://rama-app-parcial2web.onrender.com")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}