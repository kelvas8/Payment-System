package by.epam.task4.java.dao.interfaces;

import by.epam.task4.java.entity.Transaction;

public interface ITransactionsDAO {

    public boolean deleteTransaction();
    public Transaction findTransaction();
}
