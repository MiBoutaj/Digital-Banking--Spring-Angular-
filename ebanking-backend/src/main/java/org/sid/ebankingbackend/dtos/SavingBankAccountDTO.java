package org.sid.ebankingbackend.dtos;


import lombok.Data;
import org.sid.ebankingbackend.enums.AccountStatus;
import java.util.Date;


@Data
public class SavingBankAccountDTO {


    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private  double interestRate;
}
