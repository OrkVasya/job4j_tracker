package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    public void addAccount(String passport, Account account) {
        var user = findByPassport(passport);
        if (user == null) {
            return;
        }
        var accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (var user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        var user = findByPassport(passport);
        if (user != null) {
            var accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String soursePassport, String sourceRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        var sourceAcc = findByRequisite(soursePassport, sourceRequisite);
        var destAcc = findByRequisite(destPassport, destRequisite);
        if (sourceAcc == null || destAcc == null) {
            return false;
        }
        if (sourceAcc.getBalance() >= amount) {
            sourceAcc.setBalance(sourceAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            return true;
        }
        return false;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
