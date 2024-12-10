package org.ies.bank.components;

package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankApp3 {
    // Se necesita el Scanner para hacer el menu
    private final Scanner scanner;
    // Se necesita el BankReader para pedir un banco al usuario
    private final BankReader bankReader;

    public BankApp3(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }

    public void run(){

        Bank bank = bankReader.read();
        bank.showAccount();

        Account account = bank.findAccount("ES0003");
        account.deposit(-50);

        account.getCustomer().equals("000x")
    }
}

