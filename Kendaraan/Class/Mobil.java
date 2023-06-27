package Kendaraan.Class;

import Kendaraan.Interface.Kendaraan;

class Mobil implements Kendaraan {
    private String merek;
    private String model;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}