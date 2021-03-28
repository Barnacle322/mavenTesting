package com.comapny.Payments.service;
import com.comapny.Payments.entity.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account getById(Long id);
    Account save(Account account);
    Account update(Long id, BigDecimal amount);
}
