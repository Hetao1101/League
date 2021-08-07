package org.hetao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcutils {


    public static String url,user,pwd;

    public static Connection getCon()
    {
         Connection con=null;
        url="jdbc:mysql://localhost:3306/txdb";
        pwd="123";
        user="root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pwd);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
         return con;
    }
    public static Statement getStatement()
    {
          Statement statement=null;
        try {
            statement= getCon().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
    public static void close(Statement statement,Connection connection)
    {
        if(statement!=null)
        {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
