package com.daniel_wizer.libraryapplication.config.security;

import lombok.Getter;


@Getter
public class UnauthorizedResponse {
    private final String error;

    public UnauthorizedResponse() {
        this.error = "Unauthorized";
    }
}
