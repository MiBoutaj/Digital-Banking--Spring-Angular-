package org.sid.ebankingbackend.services;

import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.sid.ebankingbackend.exceptions.BalanceNotSufficientException;
import org.sid.ebankingbackend.exceptions.BankNotFoundException;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {

    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<Customer> listCustomer();
    BankAccount getBankAccount(String accountId) throws BankNotFoundException;
    void debit(String accountId,double amount,String description) throws BankNotFoundException, BalanceNotSufficientException;
    void credit(String accountId,double amount,String description) throws BankNotFoundException, BalanceNotSufficientException;
    void transfer(String accountIdSource,String accountIdDestination,double amount) throws BalanceNotSufficientException, BankNotFoundException;
    List<BankAccount> bankAccountList();
}
