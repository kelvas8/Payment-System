package by.epam.task4.dao.interfaces;

import by.epam.task4.entity.Card;


public interface ICardsDAO {
    public int insertCard();
    public boolean deleteCard();
    public Card findCard();
    public boolean updateCard();
}
