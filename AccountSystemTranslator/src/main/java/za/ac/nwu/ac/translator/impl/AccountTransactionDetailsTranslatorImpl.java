package za.ac.nwu.ac.translator.impl;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.ac.repo.persistence.AccountTransactionDetailsRepository;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

import java.util.List;

public class AccountTransactionDetailsTranslatorImpl implements AccountTransactionTranslator {

    private AccountTransactionDetailsRepository repo;

    public AccountTransactionDetailsTranslatorImpl(AccountTransactionDetailsRepository accountTransactionDetailsRepository) {
        this.repo = accountTransactionDetailsRepository;
    }

    public AccountTransaction save(AccountTransactionDetails accountTransactionDetails) {
        try{
            return repo.save(accountTransactionDetails);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to the database", e);
        }
    }

    @Override
    public AccountTransaction save(AccountTransaction accountTransaction) {
        return null;
    }

    @Override
    public List<AccountTransaction> getAllAccountTransactions() {
        return null;
    }

    @Override
    public AccountTransaction getAccountTransactionByPk(Long transactionId) {
        return null;
    }
}
