package by.epam.task4.dao.jdbc;


import by.epam.task4.dao.interfaces.IClientsDAO;
import by.epam.task4.dao.resources.PoolConnection;
import by.epam.task4.entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientsDAO implements IClientsDAO {

    protected Connection connect;
    private final static String SQL_INSERT = "INSERT INTO clients (id, name, patronymic, surname, birthday) VALUES (?,?,?,?,?)";


    public ClientsDAO() {
        connect = (Connection) PoolConnection.getInsert();

    }


    @Override
    public boolean insertClient(PreparedStatement ps, Client client) {
        boolean flag = false;
        try {
            ps.setString(2, "Pop");
            ps.setString(3, "Opa");
            ps.setString(4, "Insdef");
            ps.setInt(5, 1);
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteClient() {
        return false;
    }

    @Override
    public Client findClient() {
        return null;
    }

    @Override
    public boolean updateClient() {
        return false;
    }

    @Override
    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
}
