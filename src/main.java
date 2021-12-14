import models.penjualan_tas;
import models.penjualan_sepatu;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class main {
    static penjualan_sepatu penjualan_sepatu;
    static penjualan_tas penjualan_tas;

    public static void main (String [] args) {
        showMenu();
    }
    static void showMenu() {
        System.out.println("=====================================");
        System.out.println("              =TukuTuku=             ");
        System.out.println("=====================================");
        System.out.println("   [1] Insert Data Penjualan Sepatu");
        System.out.println("   [2] Insert Data Penjualan Tas");
        System.out.println("   [3] Show Data Penjualan Sepatu");
        System.out.println("   [4] Show Data Penjualan Tas");
        System.out.println("   [5] Delete Data Penjualan Sepatu");
        System.out.println("   [6] Delete Data Penjualan Tas");
        System.out.println("   [7] Show Struk Penjualan");
        System.out.println("   [0] Exit");
        System.out.println("Masukkan Angka > ");

        try {
            penjualan_sepatu = new penjualan_sepatu();
            penjualan_tas = new penjualan_tas();
            int pilihan;
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertPenjualanSepatu();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int a = input.nextInt();
                    showMenu();
                    break;
                case 2:
                    insertPenjualanTas();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int x = input.nextInt();
                    showMenu();
                    break;
                case 3:
                    showDataPenjualanSepatu();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int b = input.nextInt();
                    showMenu();
                    break;
                case 4:
                    showDataPenjualanTas();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int c = input.nextInt();
                    showMenu();
                    break;
                case 5:
                    showDataPenjualanSepatu();
                    deleteDataPenjualanSepatu();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int d = input.nextInt();
                    showMenu();
                    break;
                case 6:
                    showDataPenjualanTas();
                    deleteDataPenjualanTas();
                    System.out.println("> Inputkan '0' untuk kembali ke menu");
                    int e = input.nextInt();
                    showMenu();
                    break;
                case 7:
                    showStruk();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void insertPenjualanSepatu() throws SQLException {
        Scanner input = new Scanner(System.in);
        try {
            penjualan_sepatu = new penjualan_sepatu();
            System.out.println("Tanggal: ");
            String tanggal_barang_terjual = input.next();
            System.out.print("Harga: ");
            int harga = input.nextInt();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();
            System.out.print("Id Sepatu: ");
            int id_sepatu = input.nextInt();

            int result = penjualan_sepatu.addPenjualanSepatu(tanggal_barang_terjual, harga, jumlah, id_sepatu);

            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan " + e.getMessage());
        }
    }
    private static void insertPenjualanTas() throws SQLException {
        Scanner input = new Scanner(System.in);
        try {
            penjualan_tas penjualanTas = new penjualan_tas();
            System.out.println("Tanggal: ");
            String tanggal_barang_terjual = input.next();
            System.out.print("Harga: ");
            int harga = input.nextInt();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();
            System.out.print("Id Tas: ");
            int id_tas = input.nextInt();

            int result = penjualanTas.addPenjualanTas(tanggal_barang_terjual, harga, jumlah, id_tas);

            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan " + e.getMessage());
        }
    }
    public static void showDataPenjualanSepatu() throws SQLException {
        System.out.println("===============================================");
        System.out.println("       DATA PENJUALAN SEPATU TOKO CAHAYA       ");
        System.out.println("===============================================");
        System.out.println("Id_PS Tanggal        Harga    Jumlah  Id Sepatu");
        ResultSet daftarPenjualanSepatu = penjualan_sepatu.getPenjualanSepatu();
        while (daftarPenjualanSepatu.next()) {
            System.out.print(daftarPenjualanSepatu.getString("id_penjualan_sepatu"));
            System.out.print("     ");
            System.out.print(daftarPenjualanSepatu.getString("tanggal_barang_terjual"));
            System.out.print("     ");
            System.out.print(daftarPenjualanSepatu.getInt("harga"));
            System.out.print("     ");
            System.out.print(daftarPenjualanSepatu.getInt("jumlah"));
            System.out.print("     ");
            System.out.print(daftarPenjualanSepatu.getInt("id_sepatu"));
            System.out.print("     ");
            System.out.println();
        }
    }
    public static void showDataPenjualanTas() throws SQLException {
        System.out.println("===============================================");
        System.out.println("         DATA PENJUALAN TAS TOKO CAHAYA        ");
        System.out.println("===============================================");
        System.out.println("Id_PT Tanggal        Harga    Jumlah  Id Tas");
        ResultSet daftarPenjualanTas = penjualan_tas.getPenjualanTas();
        while (daftarPenjualanTas.next()) {
            System.out.print(daftarPenjualanTas.getString("id_penjualan_tas"));
            System.out.print("     ");
            System.out.print(daftarPenjualanTas.getString("tanggal_barang_terjual"));
            System.out.print("     ");
            System.out.print(daftarPenjualanTas.getInt("harga"));
            System.out.print("     ");
            System.out.print(daftarPenjualanTas.getInt("jumlah"));
            System.out.print("     ");
            System.out.print(daftarPenjualanTas.getInt("id_tas"));
            System.out.print("     ");
            System.out.println();
        }
    }
    public static void showStruk(){
        DecimalFormat kurs_indonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kurs_indonesia.setDecimalFormatSymbols(formatRp);

        Scanner input = new Scanner(System.in);
        int tambahTransaksi;
        System.out.println("===================== TOKO CAHAYA: SEPATU & TAS =====================");
        struk struk2 = new struk();
        struk2.cetakStruk();
        System.out.println(" ");
        struk2.hitungKembalian();
        System.out.println("                     TOKO CAHAYA: SEPATU & TAS ");
        System.out.println("              Jl. Mastrip 4 No. 58, Sumbersari, Jember ");
        System.out.println("                        No Tlp. 082140295750");
        System.out.println("=====================================================================");
        System.out.println("Kode    Barang              Jumlah      Harga");
        System.out.println("=====================================================================");
        System.out.println(struk2.getKode_barang() + "       " + struk2.getNama_barang() + "             "+ struk2.getJumlah() + "       " + kurs_indonesia.format(struk2.getHarga()));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                            Total Transaksi: " + "  " + kurs_indonesia.format(struk2.total_bayar()));
        System.out.println("                            CASH           : " + "  " + kurs_indonesia.format(struk2.getUang()));
        System.out.println("                            Kembali        : " + "  " + kurs_indonesia.format(struk2.kembali()));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("       Barang yang sudah dibeli tidak dapat ditukar/dikembalikan");
        System.out.println("                 Terima kasih Atas Kunjungan Anda");
    }
    public static void deleteDataPenjualanSepatu() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("> Masukan Id_PS (Id Penjualan Sepatu) yang Dihapus: ");
        int idTransaksi = input.nextInt();

        if (idTransaksi <= 0){
            System.out.println("Id yang Anda masukkan Salah");
        } else{
            penjualan_sepatu.deletePenjualanSepatu(idTransaksi);
            System.out.println("Data Penjualan Sepatu Berhasil Dihapus");
        }
    }
    public static void deleteDataPenjualanTas() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("> Masukan Id_PT (id Penjualan Tas) yang Dihapus: ");
        int idTransaksi = input.nextInt();

        if (idTransaksi <= 0){
            System.out.println("Id yang Anda masukkan Salah");
        } else{
            penjualan_tas.deletePenjualanTas(idTransaksi);
            System.out.println("Data Penjualan Tas Berhasil Dihapus");
        }
    }
}