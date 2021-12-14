package models;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pegawai extends  BaseModel{
    public pegawai() throws SQLException {
        super();
    }
    public void addPegawai(String nama, String jenis_kelamin) throws SQLException {
        String query = "INSERT into pegawai " +
                "(nama, jenis_kelamin) " +
                "VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,nama);
        preparedStatement.setString(2,jenis_kelamin);
        preparedStatement.executeUpdate();
    }
    public ResultSet getPegawai() throws SQLException {
        String query = "SELECT * FROM pegawai";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

}
