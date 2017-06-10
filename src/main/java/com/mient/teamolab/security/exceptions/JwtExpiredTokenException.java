package com.mient.teamolab.security.exceptions;

import org.springframework.security.core.AuthenticationException;

import com.mient.teamolab.security.model.token.JwtToken;

public class JwtExpiredTokenException extends AuthenticationException {
	
	private static final long serialVersionUID = -3715116625047373132L;
	
	private JwtToken token;

    public JwtExpiredTokenException(String msg) {
        super(msg);
    }

    public JwtExpiredTokenException(JwtToken token, String msg, Throwable t) {
        super(msg, t);
        this.token = token;
    }

    public String token() {
        return this.token.getToken();
    }
}