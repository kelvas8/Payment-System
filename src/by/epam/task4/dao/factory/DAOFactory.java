package by.epam.task4.dao.factory;

import by.epam.task4.dao.jdbc.AccountsDAO;
import by.epam.task4.dao.jdbc.CardsDAO;
import by.epam.task4.dao.jdbc.ClientsDAO;
import by.epam.task4.dao.jdbc.TransactionsDAO;

public abstract class DAOFactory {
    public static final int MYSQL = 1;

    public abstract CardsDAO getCardsDAO();
    public abstract TransactionsDAO getTransactionsDAO();
    public abstract ClientsDAO getClientDAO();
    public abstract AccountsDAO getAccountsDAO();


    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
        case MYSQL:
            return new MySqlDAOFactory();
        default:
            return null;    }  }
}
