package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jenis {
    private Connection connection;

    public jenis() throws SQLException {
        super();
    }
    public void addJenis(String nama_jenis) throws SQLException {
        String query = "INSERT into jenis " +
                "(nama_jenis) " +
                "VALUES (?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,nama_jenis);
        preparedStatement.executeUpdate();
    }
    public ResultSet getJenis() throws SQLException {
        String query = "SELECT * FROM jenis";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    public void deleteJenis(int id_jenis) throws SQLException {
        String query = "delete from jenis where id_jenis = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_jenis);
        preparedStatement.executeUpdate();
    }
}
