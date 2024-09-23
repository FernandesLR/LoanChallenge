package com.example.Loans.controller;

import com.example.Loans.dto.CustomerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {



    @PostMapping
    public ResponseEntity<String> validateLoan(@RequestBody CustomerRequestDTO request){
        System.out.println(request);
        return ResponseEntity.ok("ok");
    }
}
