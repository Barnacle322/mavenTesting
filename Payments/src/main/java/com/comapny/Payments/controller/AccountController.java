package com.comapny.Payments.controller;
import com.comapny.Payments.entity.Account;
import com.comapny.Payments.entity.Client;
import com.comapny.Payments.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @GetMapping({"/{id}"})
    public Account getById(@PathVariable("id") Long id) {
        return accountService.getById(id);
    }

    @PostMapping
    public Account save(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PostMapping
    public Account update(@RequestBody Long id, BigDecimal amount) {
        return accountService.update(id, amount);
    }
}
