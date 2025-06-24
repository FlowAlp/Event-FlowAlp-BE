package com.flowalp.event.config;

import com.nimbusds.jose.JWSAlgorithm;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "spring.security.jwt")
public class JwtConfiguration {

  private RSAPublicKey publicKey;
  private RSAPrivateKey privateKey;
  private JWSAlgorithm algorithm;
  private String issuer;
  private Duration expirationTime;
}
