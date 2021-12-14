import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class struk {
        String nama_barang;
        int kode_barang, jumlah;
        double harga, uang, sub_total, total_bayar;

        public struk() {
            this.kode_barang = kode_barang;
            this.nama_barang = nama_barang;
            this.harga = harga;
            this.uang = uang;
            this.sub_total = sub_total;
            this.total_bayar = total_bayar;
        }

        public void setKode_barang(int kode_barang) {
            this.kode_barang = kode_barang;
        }

        public int getKode_barang() {
            return kode_barang;
        }

        public void setNama_barang(String nama_barang) {
            this.nama_barang = nama_barang;
        }

        public String getNama_barang() {
            return nama_barang;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public int getJumlah() {
            return jumlah;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }

        public double getHarga() {
            return harga;
        }

        public void setUang(double uang) {
            this.uang = uang;
        }

        public double getUang() {
            return uang;
        }

        public double total_bayar() {
            return this.getHarga() * this.getJumlah();
        }

        public double kembali() {
            return this.getUang() - this.total_bayar();
        }


        public void cetakStruk() {
            System.out.println("===== TOKO CAHAYA =====");
            Scanner input = new Scanner(System.in);

            System.out.print("Kode Barang: ");
            kode_barang = input.nextInt();
            System.out.println("Nama Barang: ");
            nama_barang = input.next();
            System.out.print("Jumlah: ");
            jumlah = input.nextInt();
            System.out.print("Harga: ");
            harga = input.nextDouble();
            DecimalFormat kurs_indonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kurs_indonesia.setDecimalFormatSymbols(formatRp);
            sub_total = jumlah * harga;
            System.out.print("Total: " + kurs_indonesia.format(sub_total));
        }

        public void hitungKembalian(){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Nominal Uang: ");
            uang = input2.nextDouble();
        }

    }

