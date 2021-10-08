package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountType",
            description = "DTO that represents the account type")

public class AccountTypeDto implements Serializable {
    private static final long serialVersionUID = -5346853206480289868L;

    private Long accountTypeId;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto(){

    }

    public AccountTypeDto(String mnemonic, String accountType, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountType;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(Long accountTypeId, String mnemonic, String accountType, LocalDate creationDate) {
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountType;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType){
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());

    }

    @ApiModelProperty(position = 1,
        value = "AccountType mnemonic",
        name = "mnemonic",
        notes = "primary key",
        dataType = "java.lang.String",
        example = "Miles",
        required = true)

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "Name",
            notes = "Name of the Account Type",
            dataType = "java.lang.String",
            example = "Miles",
            allowEmptyValue = false,
            required = true)

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountType) {
        this.accountTypeName = accountType;
    }

    @ApiModelProperty(position = 3,
            value = "AccountType Creation Date",
            name = "Creation Date",
            notes = "Contains the date when the accountType was created",
            dataType = "java.lang.String",
            example = "2020-01-01",
            allowEmptyValue = true,
            required = false)
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @JsonIgnore
    public AccountType getAccountType(){
        return new AccountType(getMnemonic(),getAccountTypeName(),getCreationDate());
    }
    @Override
    public int hashCode() {
        return Objects.hash(mnemonic, accountTypeName, creationDate);
    }


    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

}
