package com.comapny.Payments.service;

import com.comapny.Payments.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAll();
    Transaction getById(Long id);
    Transaction save(Transaction transaction);
}
