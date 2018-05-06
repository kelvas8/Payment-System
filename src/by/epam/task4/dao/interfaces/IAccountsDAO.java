package by.epam.task4.dao.interfaces;

import by.epam.task4.properties.Account;

public interface IAccountsDAO {

    public int insertAccount();
    public boolean deleteAccount();
    public Account findAccount();
    public boolean updateAccount();
}
