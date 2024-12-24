package com.codegym.realestatemanagement.repository;


import com.codegym.realestatemanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
}
