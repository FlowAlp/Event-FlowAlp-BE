package com.flowalp.event.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableMethodSecurity
@Profile("!local")
public class SecurityConfig {

  private static final String SWAGGER_UI = "/swagger-ui";
  private static final String API_DOCS = "/api-docs";
  private static final String API_V_1_GET_VERSION = "/api/v1/version";
  private static final String API_V_1_PUBLIC_OFFERS = "/api/v1/public/offers";
  private static final String AUTH_LOGIN = "/auth/login";
  private static final String AUTH_REFRESH_TOKEN = "/auth/refresh-token";
  private static final String AUTH_LOGOUT = "/auth/logout";

  @Bean
  public SecurityFilterChain filterChain(final HttpSecurity http) throws Exception {

    // Allow swagger and public endpoints
    allowSwaggerAndPublicEndPoint(http);

    // Apply JWT token validation
    http.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));

    // Ensure any request requires authentication
    http.authorizeHttpRequests(requests -> requests.requestMatchers(HttpMethod.GET, AUTH_LOGIN).permitAll().requestMatchers(HttpMethod.POST, AUTH_LOGOUT).authenticated()
        .requestMatchers(HttpMethod.POST, AUTH_REFRESH_TOKEN).permitAll().anyRequest().authenticated() // This should be the last call in the chain
    );

    return http.build();
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  private void allowSwaggerAndPublicEndPoint(final HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(
        requests -> requests.requestMatchers(HttpMethod.GET, SWAGGER_UI + "/**").permitAll().requestMatchers(HttpMethod.GET, API_V_1_GET_VERSION + "/**").permitAll()
            .requestMatchers(HttpMethod.GET, API_V_1_PUBLIC_OFFERS + "/**").permitAll().requestMatchers(HttpMethod.POST, API_V_1_PUBLIC_OFFERS + "/**").permitAll()
            .requestMatchers(HttpMethod.POST, AUTH_LOGIN).permitAll().requestMatchers(HttpMethod.POST, AUTH_REFRESH_TOKEN).permitAll().requestMatchers(HttpMethod.GET, API_DOCS + "/**")
            .permitAll());
  }
}
