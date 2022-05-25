package org.sid.ebankingbackend.web;

import lombok.AllArgsConstructor;
import org.sid.ebankingbackend.services.BankAccountService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BankAccountRestApi {
    private BankAccountService bankAccountService;


}
