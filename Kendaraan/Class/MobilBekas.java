package Kendaraan.Class;

public class MobilBekas extends Mobil {
    private int tahun;
    private double harga;

    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " (" + tahun + ")");
    }
}

