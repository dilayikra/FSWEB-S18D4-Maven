package com.workintech.s18d1.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BurgerException extends RuntimeException {
    // Değişken adını status yerine httpStatus yapıyoruz
    private final HttpStatus httpStatus;

    public BurgerException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}