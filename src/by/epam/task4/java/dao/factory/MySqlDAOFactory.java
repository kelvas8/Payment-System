package by.epam.task4.java.dao.factory;

import by.epam.task4.java.dao.jdbc.AccountsDAO;
import by.epam.task4.java.dao.jdbc.CardsDAO;
import by.epam.task4.java.dao.jdbc.ClientsDAO;
import by.epam.task4.java.dao.jdbc.TransactionsDAO;


public class MySqlDAOFactory extends DAOFactory {





    @Override
    public CardsDAO getCardsDAO() {
        return new CardsDAO();
    }

    @Override
    public TransactionsDAO getTransactionsDAO() {
        return new TransactionsDAO();
    }

    @Override
    public ClientsDAO getClientDAO() {
        return new ClientsDAO();
    }

    @Override
    public AccountsDAO getAccountsDAO() {
        return new AccountsDAO();
    }
}
