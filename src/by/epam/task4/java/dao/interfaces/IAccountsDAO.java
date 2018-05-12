package by.epam.task4.java.dao.interfaces;

import by.epam.task4.java.entity.Account;

public interface IAccountsDAO {

    public int insertAccount();
    public boolean deleteAccount();
    public Account findAccount();
    public boolean updateAccount();
}
