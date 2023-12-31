package com.liomotolani.customer.controller;

import com.liomotolani.customer.dto.CustomerRegistrationRequest;
import com.liomotolani.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest){
        log.info("new customer registration {}", customerRequest);
        customerService.register(customerRequest);

    }
}
