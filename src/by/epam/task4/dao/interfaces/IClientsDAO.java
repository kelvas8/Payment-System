package by.epam.task4.dao.interfaces;

import by.epam.task4.properties.Client;

public interface IClientsDAO {

    public int insertClient();
    public boolean deleteClient();
    public Client findClient();
    public boolean updateClient();


}
