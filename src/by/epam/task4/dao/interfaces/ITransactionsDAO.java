package by.epam.task4.dao.interfaces;

import by.epam.task4.entity.Transaction;

public interface ITransactionsDAO {

    public boolean deleteTransaction();
    public Transaction findTransaction();
}
