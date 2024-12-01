package com.bankingDemo.banking.mapper;

import com.bankingDemo.banking.dto.AccountDto;
import com.bankingDemo.banking.entity.Account;

public class AccountMapper {
public static Account mapToAccount(AccountDto accountDto){
Account account = new Account(
    accountDto.getId(),
    accountDto.getBalance(),
    accountDto.getCreateDate(),
    accountDto.getLastModified(),
    accountDto.getCreatedBy(),
    accountDto.getLastModifiedBy()
); 
return account;
    
}    
public static AccountDto mapToAccountDto(Account account){
    AccountDto accountDto = new AccountDto(
        account.getId(),
        account.getBalance() ,
        account.getCreateDate(),
        account.getLastModified(),
        account.getCreatedBy(),
        account.getLastModifiedBy()
    );
    return accountDto;
}

}
