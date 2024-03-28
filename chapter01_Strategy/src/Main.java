public class Main {
    public static void main(String[] args) {
        double hargaAwal = 100000;

        PelangganBiasa pelangganBiasa = new PelangganBiasa();
        PelangganPremium pelangganPremium = new PelangganPremium();

        Penjualan penjualanBiasa = new Penjualan(hargaAwal, pelangganBiasa);
        Penjualan penjualanPremium = new Penjualan(hargaAwal, pelangganPremium);

        System.out.println("Harga akhir pelanggan biasa: Rp" + penjualanBiasa.hitungHargaAkhir());
        System.out.println("Harga akhir pelanggan premium: Rp" + penjualanPremium.hitungHargaAkhir());

        // Ubah strategi diskon untuk penjualan biasa
        penjualanBiasa.setDiskonStrategy(pelangganPremium);
        System.out.println("\nHarga akhir pelanggan biasa (dengan strategi premium): Rp" + penjualanBiasa.hitungHargaAkhir());
    }
}