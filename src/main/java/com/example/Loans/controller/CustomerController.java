package com.example.Loans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {



    @PostMapping(name = "/customer-loans")
    public ResponseEntity<CustomerRequest> validateLoan(@RequestBody CustomerRequest data){
        System.out.println(data);
        return ResponseEntity.ok(data);
    }
}
