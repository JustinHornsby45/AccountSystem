package za.ac.nwu.ac.translator.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.repo.persistence.AccountTransactionRepository;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTransactionTranslatorImpl implements AccountTransactionTranslator {

    private AccountTransactionRepository repo;

    @Override
    public AccountTransaction save(AccountTransaction accountTransaction) {
        try{
            return repo.save(accountTransaction);
        }catch (Exception e){
            throw new RuntimeException("could not save to Database",e);
        }

    }

    @Override
    public List<AccountTransaction> getAllAccountTransactions(){
        List<AccountTransaction> accountTransactions;
        try{
            accountTransactions = new ArrayList<>(repo.findAll());
        }catch (Exception e){
            throw new RuntimeException("Unable to get all transactins form database",e );
        }

        return accountTransactions;
    }


    @Override
    public AccountTransaction getAccountTransactionByPk(Long transactionId) {
        try{
            return repo.findById(transactionId).orElse(null);
        }catch (Exception e){
            throw new RuntimeException("Error when getting PK from database",e);
        }
    }
}
