package com.rd.spring.auth.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class AuthResponse {

    private String accessToken;
    private String refreshToken;
}
