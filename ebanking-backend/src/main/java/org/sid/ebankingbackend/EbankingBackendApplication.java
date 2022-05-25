package org.sid.ebankingbackend;

import lombok.extern.slf4j.Slf4j;
import org.sid.ebankingbackend.dtos.CustomerDTO;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.exceptions.BalanceNotSufficientException;
import org.sid.ebankingbackend.exceptions.BankNotFoundException;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;
import org.sid.ebankingbackend.services.BankAccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@Slf4j
public class EbankingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankingBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAccountService bankAccountService) {
        return args -> {
            Stream.of("Amine", "Yasmin", "Mohammed").forEach(name -> {
                CustomerDTO customer = new CustomerDTO();
                customer.setName(name);
                customer.setEmail(name + "@gmail.com");
                bankAccountService.saveCustomer(customer);
            });

            bankAccountService.listCustomer().forEach(customer -> {
                try {
                    bankAccountService.saveCurrentBankAccount(Math.random() * 9000, 90000, customer.getId());
                    bankAccountService.saveSavingBankAccount(Math.random() * 12000, 5.5, customer.getId());
                    List<BankAccount> bankAccounts = bankAccountService.bankAccountList();

                    for (BankAccount account : bankAccounts) {
                        bankAccountService.credit(account.getId(), 1000 + Math.random() * 1200, "Credit");
                        bankAccountService.debit(account.getId(), 1000 + Math.random() * 9000, "Debit");
                    }

                } catch (CustomerNotFoundException e) {
                    e.printStackTrace();
                } catch (BalanceNotSufficientException e) {
                    e.printStackTrace();
                } catch (BankNotFoundException e) {
                    e.printStackTrace();
                }
            });

        };
    }

}
