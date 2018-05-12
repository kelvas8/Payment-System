package by.epam.task4.java.dao.interfaces;

import by.epam.task4.java.entity.Card;


public interface ICardsDAO {
    public int insertCard();
    public boolean deleteCard();
    public Card findCard();
    public boolean updateCard();
}
