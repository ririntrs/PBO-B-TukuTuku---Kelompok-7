package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tas extends BaseModel{


    public tas() throws SQLException {
        super();
    }
    public void addTas(String warna, int stok, int harga, int id_jenis, int id_merk) throws SQLException {
        String query = "INSERT into tas " +
                "(ukuran, stok, harga, id_jenis, id_merk) " +
                "VALUES (?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,warna);
        preparedStatement.setInt(2,stok);
        preparedStatement.setInt(3,harga);
        preparedStatement.setInt(4,id_jenis);
        preparedStatement.setInt(5,id_merk);
        preparedStatement.executeUpdate();
    }
    public ResultSet getTas() throws SQLException {
        String query = "SELECT * FROM tas";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    public void deleteTas(int id_tas) throws SQLException {
        String query = "delete from tas where id_tas = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_tas);
        preparedStatement.executeUpdate();
    }
}
