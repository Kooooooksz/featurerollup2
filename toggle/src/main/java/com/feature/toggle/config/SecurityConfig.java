package com.feature.toggle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors() // CORS engedélyezése
            .and()
            .csrf().disable() // CSRF védelem kikapcsolása (ha nem használod)
            .authorizeHttpRequests(authorize -> authorize
                    .requestMatchers("/api/auth/**").permitAll() // Engedélyezd a regisztrációs és bejelentkezési végpontokat
                    .anyRequest().authenticated() // Minden más kérés hitelesítést igényel
            );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
