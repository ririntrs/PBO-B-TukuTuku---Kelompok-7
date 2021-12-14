package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class penjualan_tas extends BaseModel {
    public penjualan_tas() throws SQLException {
        super();
    }
    String tanggal_barang_terjual;

    public int addPenjualanTas(String tanggal_barang_terjual, int harga, int jumlah, int id_tas)
            throws SQLException {
        String query = "INSERT INTO penjualan_tas " +
                "(tanggal_barang_terjual, harga, jumlah, id_tas)" +
                "VALUES  (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, tanggal_barang_terjual);
        preparedStatement.setInt(2, harga);
        preparedStatement.setInt(3, jumlah);
        preparedStatement.setInt(4, id_tas);

        return preparedStatement.executeUpdate();
    }

    public ResultSet getPenjualanTas() throws SQLException {
        String query = "SELECT * FROM penjualan_tas";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public void deletePenjualanTas(int id_penjualan_tas) throws SQLException {
        String query = "delete from penjualan_tas where id_penjualan_tas = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id_penjualan_tas);
        preparedStatement.executeUpdate();
    }
}
