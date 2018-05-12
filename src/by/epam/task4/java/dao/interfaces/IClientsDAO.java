package by.epam.task4.java.dao.interfaces;


import by.epam.task4.java.entity.Client;

import java.sql.PreparedStatement;

public interface IClientsDAO {

    public boolean insertClient(PreparedStatement ps, Client client);
    public boolean deleteClient();
    public Client findClient();
    public boolean updateClient();
    public PreparedStatement getPreparedStatement();

}
