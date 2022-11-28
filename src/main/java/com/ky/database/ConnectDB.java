package com.ky.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String db = "myblog";
    private static final String dbuser = "root";
    private static final String dbpass = "";
    private static Connection cn;

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, dbuser, dbpass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
        return cn;
    }
}
