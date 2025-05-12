package com.moldavets.eazy_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/balances")
    public String getBalanceDetails() {
        return "balances";
    }

}
