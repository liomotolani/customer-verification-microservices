package com.liomotolani.customer.service;

import com.liomotolani.customer.dto.CustomerRegistrationRequest;
import com.liomotolani.customer.model.Customer;
import com.liomotolani.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);

        //todo: check if email is valid
        //todo: check id email is not taken
    }
}
