package com.example.rama.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                // ✅ Permitir rutas públicas y de OAuth2
                .requestMatchers("/", "/app", "/app/**", "/login**", "/error**", "/test", 
                                "/oauth2/**", "/login/oauth2/**", "/VAADIN/**", "/vaadinServlet/**").permitAll()
                .anyRequest().authenticated()
            )
            .oauth2Login(oauth2 -> oauth2
                // ✅ Redirigir a la ruta de Vaadin después del login
                .defaultSuccessUrl("/app/dashboard", true)
                .failureUrl("/app?error=true")
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/app").permitAll()
            )
            // ✅ Deshabilitar CSRF para desarrollo (opcional)
            .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
