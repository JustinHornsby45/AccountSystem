package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;

public interface CreateAccountTypeFlow {

    AccountTypeDto create(AccountTypeDto accountType);
}
