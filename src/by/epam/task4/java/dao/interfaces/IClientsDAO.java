package by.epam.task4.java.dao.interfaces;


import by.epam.task4.java.entity.Client;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public interface IClientsDAO {

    public boolean insertClient(Client client);
    public ArrayList<Client> getClients();
    public boolean deleteClient(int id);
    public Client findClient();
    public boolean updateClient(int id, Client client);
}
