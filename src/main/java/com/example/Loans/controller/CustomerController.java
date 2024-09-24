package com.example.Loans.controller;

import com.example.Loans.dto.CustomerRequestDTO;
import com.example.Loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {

    @Autowired
    LoanService loan = new LoanService();

    @PostMapping
    public ResponseEntity<Map<String, Object>> validateLoan(@RequestBody CustomerRequestDTO request){
        var loanList = loan.validateLoanRequest(request);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("customer", request.getName());
        response.put("loans", loanList);


        return ResponseEntity.ok(response);
    }
}
