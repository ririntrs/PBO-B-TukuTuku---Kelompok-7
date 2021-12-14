package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sepatu extends BaseModel{

    public sepatu() throws SQLException {
        super();
    }
    public void addSepatu(String ukuran, int stok, int harga, int id_jenis, int id_merk) throws SQLException {
        String query = "INSERT into sepatu " +
                "(ukuran, stok, harga, id_jenis, id_merk) " +
                "VALUES (?,?,?,?,?)";
   
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,ukuran);
        preparedStatement.setInt(2,stok);
        preparedStatement.setInt(3,harga);
        preparedStatement.setInt(4,id_jenis);
        preparedStatement.setInt(5,id_merk);
        preparedStatement.executeUpdate();
    }
    //PreparedStatement digunakan untuk manipulasi database yang menggunakan query – query dinamis(memiliki parameter)
    public ResultSet getSepatu() throws SQLException {
        String query = "SELECT * FROM sepatu";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    //Object ResultSet digunakan untuk menampung hasil eksekusi dari database
    public void deleteSepatu(int id_sepatu) throws SQLException {
        String query = "delete from sepatu where id_sepatu = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_sepatu);
        preparedStatement.executeUpdate();
    }
}
