package com.flowalp.event.util;

import com.flowalp.event.exception.IdGenerationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Component
public class IdUtil {

    private final String SECRET_KEY;

    public IdUtil(@Value("${secure.key:YOUR_SECRET_KEY}") String secretKey) {
        this.SECRET_KEY = secretKey;
    }

    public String generateSecureId() {
        String uuidString = UUID.randomUUID().toString();
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            mac.init(keySpec);

            byte[] hmacBytes = mac.doFinal(uuidString.getBytes(StandardCharsets.UTF_8));

            String hex = bytesToHex(hmacBytes);

            return hex.substring(0, 8);
        } catch (Exception e) {
            throw new IdGenerationException("Errore durante la generazione del secure id", e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
