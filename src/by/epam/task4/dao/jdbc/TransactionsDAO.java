package by.epam.task4.dao.jdbc;

import by.epam.task4.dao.interfaces.ITransactionsDAO;
import by.epam.task4.entity.Transaction;

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
