package lk.ijse.gdse.aad67.NoteCollector_V2.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {
    String extractUserName(String jwt);

    String generateToken(UserDetails userDetails);

    boolean validateToken(String token, UserDetails userDetails);

    String refreshToken(String prevToken);
}
