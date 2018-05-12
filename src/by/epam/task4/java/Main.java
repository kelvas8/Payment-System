package by.epam.task4.java;

import by.epam.task4.java.dao.factory.DAOFactory;
import by.epam.task4.java.dao.interfaces.IClientsDAO;
import by.epam.task4.java.entity.Client;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        IClientsDAO clientDAO =   mysqlFactory.getClientDAO();
        /*ArrayList<Client> list = new ArrayList<Client>() {
            {
                add(new Client("uyref","popqwdw","qwd","1254-12-12"));
                add(new Client("12321","tpqwdw","qwt","2454-12-12"));
            }
        };
        PreparedStatement statement = null;
        for (Client client : list) { clientDAO.insertClient(client); }*/
        System.out.println(clientDAO.updateClient(1, new Client("Ylia","Nya","Nyaaa","1254-12-12")));
        System.out.println(clientDAO.deleteClient(2));
        System.out.println(clientDAO.getClients());
    }

}
