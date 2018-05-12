package by.epam.task4.java.dao.jdbc;

import by.epam.task4.java.dao.interfaces.ITransactionsDAO;
import by.epam.task4.java.entity.Transaction;

public class TransactionsDAO implements ITransactionsDAO {
    @Override
    public boolean deleteTransaction() {
        return false;
    }

    @Override
    public Transaction findTransaction() {
        return null;
    }
}
