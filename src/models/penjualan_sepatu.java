package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class penjualan_sepatu extends BaseModel {

    public penjualan_sepatu() throws SQLException {
        super();
    }

    String tanggal_barang_terjual;

    public int addPenjualanSepatu(String tanggal_barang_terjual, int harga, int jumlah, int id_sepatu)
            throws SQLException {
        String query = "INSERT INTO penjualan_sepatu " +
                "(tanggal_barang_terjual, harga, jumlah, id_sepatu)" +
                "VALUES  (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, tanggal_barang_terjual);
        preparedStatement.setInt(2, harga);
        preparedStatement.setInt(3, jumlah);
        preparedStatement.setInt(4, id_sepatu);

        return preparedStatement.executeUpdate();
    }
    //PreparedStatement digunakan untuk manipulasi database yang menggunakan query – query dinamis(memiliki parameter)
    public ResultSet getPenjualanSepatu() throws SQLException {
        String query = "SELECT * FROM penjualan_sepatu";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    //Object ResultSet digunakan untuk menampung hasil eksekusi dari database
    public void deletePenjualanSepatu(int id_penjualan_sepatu) throws SQLException {
        String query = "delete from penjualan_sepatu where id_penjualan_sepatu = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_penjualan_sepatu);
        preparedStatement.executeUpdate();
    }
}

