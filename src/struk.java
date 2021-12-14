import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class struk {
    String nama_barang;
    int kode_barang;
    int jumlah;
    double harga;
    double uang;
    double sub_total;
    double total_bayar;

    public struk() {
        this.kode_barang = this.kode_barang;
        this.nama_barang = this.nama_barang;
        this.harga = this.harga;
        this.uang = this.uang;
        this.sub_total = this.sub_total;
        this.total_bayar = this.total_bayar;
    }

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public int getKode_barang() {
        return this.kode_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getNama_barang() {
        return this.nama_barang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    public double getUang() {
        return this.uang;
    }

    public double total_bayar() {
        return this.getHarga() * (double)this.getJumlah();
    }

    public double kembali() {
        return this.getUang() - this.total_bayar();
    }

    public void cetakStruk() {
        System.out.println("===== TOKO CAHAYA =====");
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Barang: ");
        this.kode_barang = input.nextInt();
        System.out.println("Nama Barang: ");
        this.nama_barang = input.next();
        System.out.print("Jumlah: ");
        this.jumlah = input.nextInt();
        System.out.print("Harga: ");
        this.harga = input.nextDouble();
        DecimalFormat kurs_indonesia = (DecimalFormat)DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kurs_indonesia.setDecimalFormatSymbols(formatRp);
        this.sub_total = (double)this.jumlah * this.harga;
        System.out.print("Total: " + kurs_indonesia.format(this.sub_total));
    }

    public void hitungKembalian() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Nominal Uang: ");
        this.uang = input2.nextDouble();
    }
}
