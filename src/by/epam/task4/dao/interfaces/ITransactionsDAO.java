package by.epam.task4.dao.interfaces;

import by.epam.task4.properties.Transaction;

public interface ITransactionsDAO {

    public boolean deleteTransaction();
    public Transaction findTransaction();
}
