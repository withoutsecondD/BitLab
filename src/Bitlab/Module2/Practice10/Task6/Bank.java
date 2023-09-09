package Bitlab.Module2.Practice10.Task6;

import java.util.ArrayList;
import java.util.List;

public class Bank <T extends BankAccount> {
    List<T> accounts = new ArrayList<>();

    void addAccount(T account) {
        accounts.add(account);
    }

    void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) != null) {
                if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                    accounts.remove(i);
                    break;
                }
            }
        }
    }

    T getAccount(String accountNumber) {
        for (T i : accounts) {
            if (i != null) {
                if (i.getAccountNumber().equals(accountNumber)) {
                    return i;
                }
            }
        }

        return null;
    }

    public Bank() {
    }

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }
}
