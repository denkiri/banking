package com.bankingDemo.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingDemo.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
    

}
