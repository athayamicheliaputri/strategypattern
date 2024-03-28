public interface DiskonStrategy {
    double hitungDiskon(double hargaAwal);
}

class PelangganBiasa implements DiskonStrategy {

    @Override
    public double hitungDiskon(double hargaAwal) {
        return 0; // Pelanggan biasa tidak mendapat diskon
    }
}

class PelangganPremium implements DiskonStrategy {

    private static final double DISKON_PREMIUM = 0.1; // Diskon 10%

    @Override
    public double hitungDiskon(double hargaAwal) {
        return hargaAwal * DISKON_PREMIUM;
    }
}

class Penjualan {

    private DiskonStrategy diskonStrategy;
    private double hargaAwal;

    public Penjualan(double hargaAwal, DiskonStrategy diskonStrategy) {
        this.hargaAwal = hargaAwal;
        this.diskonStrategy = diskonStrategy;
    }

    public double hitungHargaAkhir() {
        double diskon = diskonStrategy.hitungDiskon(hargaAwal);
        return hargaAwal - diskon;
    }

    public void setDiskonStrategy(DiskonStrategy diskonStrategy) {
        this.diskonStrategy = diskonStrategy;
    }
}