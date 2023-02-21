package com.ictec.rmi.stu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.ArrayList;

public class DepartmentStudent extends UnicastRemoteObject implements Department {
    public DepartmentStudent() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Student> getStudents() throws RemoteException {

        ArrayList<Student> students = new ArrayList<Student>();

        String url = "jdbc:mysql://localhost:3306/student"; // table details
        String username = "root"; // MySQL credentials
        String password = "Admin@1234!";
        String query = "select * from basicdata"; // query to be run
        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query); // Execute query

            while (rs.next()) {
                Student stu =  new Student();
                stu.setId(rs.getNString(1));
                stu.setStu_name(rs.getString(2));
                stu.setStu_address(rs.getString(3));
                students.add(stu);
            }

            st.close(); // close statement
            con.close(); // close connection
            System.out.println("Connection Closed....");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
