package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.time.LocalDate;

public interface ModifyAccountTypeFlow {
    AccountTypeDto deleteAccountTypeByMnemonic(String mnemonic);
    AccountTypeDto updateAccountType(AccountTypeDto accountType);

    AccountTypeDto deleteAccountType(String anyString);

}
