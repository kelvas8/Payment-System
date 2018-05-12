package by.epam.task4.java.dao.jdbc;


import by.epam.task4.java.dao.interfaces.IClientsDAO;
import by.epam.task4.java.dao.connection.PoolConnection;
import by.epam.task4.java.entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientsDAO implements IClientsDAO {

    protected Connection connect;
    private final static String SQL_INSERT = "INSERT INTO clients (name, patronymic, surname, birthday) VALUES (?,?,?,?)";


    public ClientsDAO() {
        connect = (Connection) PoolConnection.getConnection();
        System.out.println("succefull");
    }


    @Override
    public boolean insertClient(PreparedStatement ps, Client client) {
        boolean flag = false;
        try {
            ps.setString(1, "Pop");
            ps.setString(2, "Opa");
            ps.setString(3, "Insdef");
            ps.setDate(4, java.sql.Date.valueOf("2000-11-01"));
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
