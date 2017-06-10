package com.mient.teamolab.security.auth.jwt.verifier;

public interface TokenVerifier {
	public boolean verify(String jti);
}
