package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class merk extends BaseModel {

    public merk() throws SQLException {
        super();
    }
    public void addMerk(String nama_merk) throws SQLException {
        String query = "INSERT into merk " +
                "(nama_merk) " +
                "VALUES (?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,nama_merk);
        preparedStatement.executeUpdate();
    }
    public ResultSet getMerk() throws SQLException {
        String query = "SELECT * FROM merk";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    public void deleteMerk(int id_merk) throws SQLException {
        String query = "delete from merk where id_merk = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_merk);
        preparedStatement.executeUpdate();
    }
}