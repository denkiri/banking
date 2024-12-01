package com.bankingDemo.banking.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private Double balance;
    private LocalDateTime createDate;
    private LocalDateTime lastModified;
    private Integer createdBy;
    private Integer lastModifiedBy;

}
