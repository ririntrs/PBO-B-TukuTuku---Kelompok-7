package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseModel {
    private String dbUrl;
    private String dbUser;
    private String dbPassword;
    public Connection connection;

    public BaseModel() throws SQLException {
        dbUrl = "jdbc:postgresql://localhost/TukuTuku";
        dbUser = "postgres";
        dbPassword = "Silvi0209";

        connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        System.out.println("Koneksi Berhasil");

    }
}
