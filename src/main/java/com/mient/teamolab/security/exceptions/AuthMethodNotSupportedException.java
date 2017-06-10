package com.mient.teamolab.security.exceptions;

import org.springframework.security.authentication.AuthenticationServiceException;

public class AuthMethodNotSupportedException extends AuthenticationServiceException {

	private static final long serialVersionUID = 4002852573336583706L;

	public AuthMethodNotSupportedException(String msg) {
        super(msg);
    }
}
