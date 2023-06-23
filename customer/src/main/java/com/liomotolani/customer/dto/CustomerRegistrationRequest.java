package com.liomotolani.customer.dto;

// Used record to get string mutability for free so one can use tostring, equals
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
