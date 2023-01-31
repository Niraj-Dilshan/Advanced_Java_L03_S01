package com.ictec.practical;
import java.sql.*;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3307/student";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection con;
    private static DBConnection instance = null;

    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected To The Database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection(){
        return con;
    }

    public ResultSet executeQuery(String query) throws SQLException {
        Statement st = con.createStatement();
        return st.executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException {
        Statement st = con.createStatement();
        return st.executeUpdate(query);
    }

    public PreparedStatement getPreparedStatement(String query) throws SQLException {
        return con.prepareStatement(query);
    }
}
