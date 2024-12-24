package com.codegym.realestatemanagement.service;

import com.codegym.realestatemanagement.model.Transaction;
import com.codegym.realestatemanagement.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TransactionService implements ITransactionService {
    @Autowired
    private ITransactionRepository iTransactionRepository;

    @Override
    public Iterable<Transaction> findAll() {
        return iTransactionRepository.findAll();
    }

    @Override
    public Optional<Transaction> findById(Long id) {
        return iTransactionRepository.findById(id);
    }

    @Override
    public void save(Transaction transaction) {
        iTransactionRepository.save(transaction);
    }

    @Override
    public void remove(Long id) {
        iTransactionRepository.deleteById(id);
    }
}
