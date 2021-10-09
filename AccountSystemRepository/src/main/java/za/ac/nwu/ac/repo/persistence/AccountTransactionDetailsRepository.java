package za.ac.nwu.ac.repo.persistence;

import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;

@Repository
public interface AccountTransactionDetailsRepository {
    AccountTransaction save(AccountTransactionDetails accountTransactionDetails);
}
