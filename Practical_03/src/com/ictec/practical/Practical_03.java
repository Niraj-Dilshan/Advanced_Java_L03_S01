package com.ictec.practical;
import java.sql.*;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practical_03 {
    public static void main(String[] args) {

        ResultSet rs = null;
        try {
            DBConnection connection = DBConnection.getInstance();
            rs = connection.executeQuery("SELECT * FROM basicdata JOIN marks ON basicdata.stu_id = marks.stu_id;");
            while (rs.next()) {
                String stu_id = rs.getString("stu_id");
                String stu_name = rs.getString("stu_name");
                String stu_address = rs.getString("stu_address");
                float chemistry = rs.getFloat("chemistry");
                float physics = rs.getFloat("physics");
                float maths = rs.getFloat("maths");
                System.out.println(stu_id + "    " + stu_name + "    " + stu_address + "    " + chemistry + "    " + physics + "    " + maths);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
