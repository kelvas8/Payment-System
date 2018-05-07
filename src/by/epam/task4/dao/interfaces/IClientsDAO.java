package by.epam.task4.dao.interfaces;


import by.epam.task4.entity.Client;

import java.sql.PreparedStatement;

public interface IClientsDAO {

    public boolean insertClient(PreparedStatement ps, Client client);
    public boolean deleteClient();
    public Client findClient();
    public boolean updateClient();
    public PreparedStatement getPreparedStatement();

}
