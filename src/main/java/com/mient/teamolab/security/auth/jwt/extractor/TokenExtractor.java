package com.mient.teamolab.security.auth.jwt.extractor;

public interface TokenExtractor {
    public String extract(String payload);
}
