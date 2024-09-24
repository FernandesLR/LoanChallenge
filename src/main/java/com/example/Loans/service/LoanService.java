package com.example.Loans.service;

import com.example.Loans.dto.CustomerRequestDTO;
import com.example.Loans.dto.LoanResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public List<LoanResponseDTO> validateLoanRequest(CustomerRequestDTO client){
        List<LoanResponseDTO> loanList = new ArrayList<>();


        if(client.getIncome() <= 3000){
            loanList.add(new LoanResponseDTO("PERSONAL", 4));
            loanList.add(new LoanResponseDTO("GUARANTEED", 3));
        }if(client.getIncome() <=5000 && client.getAge() < 30 && client.getLocation() == "SP"){
            loanList.add(new LoanResponseDTO("PERSONAL", 4));
            loanList.add(new LoanResponseDTO("GUARANTEED", 3));
        }if(client.getIncome() >= 5000){
            loanList.add(new LoanResponseDTO("CONSIGNMENT", 2));
        }
        System.out.println(loanList.get(0));

        return loanList;
    }
}
