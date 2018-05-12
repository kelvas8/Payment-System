package by.epam.task4.java;

import by.epam.task4.java.dao.factory.DAOFactory;
import by.epam.task4.java.dao.interfaces.IClientsDAO;
import by.epam.task4.java.entity.Client;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Client> list = new ArrayList<Client>() {
            {
                add(new Client());
                add(new Client());
            }
        };
        DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        IClientsDAO clientDAO =   mysqlFactory.getClientDAO();
        PreparedStatement statement = null;
        statement = clientDAO.getPreparedStatement();
        for (Client client : list) { clientDAO.insertClient(statement, client); }

    }

}
