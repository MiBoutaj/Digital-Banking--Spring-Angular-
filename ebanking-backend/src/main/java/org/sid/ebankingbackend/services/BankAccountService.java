package org.sid.ebankingbackend.services;

import org.sid.ebankingbackend.dtos.*;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.sid.ebankingbackend.exceptions.BalanceNotSufficientException;
import org.sid.ebankingbackend.exceptions.BankNotFoundException;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customer);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;

    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;

    List<CustomerDTO> listCustomer();

    BankAccountDTO getBankAccount(String accountId) throws BankNotFoundException;

    void debit(String accountId, double amount, String description) throws BankNotFoundException, BalanceNotSufficientException;

    void credit(String accountId, double amount, String description) throws BankNotFoundException, BalanceNotSufficientException;

    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BalanceNotSufficientException, BankNotFoundException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long id) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);
    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws  BankNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}
