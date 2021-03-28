package com.comapny.Payments.service;

import com.comapny.Payments.entity.Account;
import com.comapny.Payments.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;


    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Long id) {
        Optional<Account> op = accountRepository.findById(id);
        return op.orElse(new Account());
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account update(Long id, BigDecimal amount) {
        Optional<Account> op = accountRepository.findById(id);
        Account account = op.get();
        account.setBalance(amount);
        return op.orElse(new Account());
    }
}
