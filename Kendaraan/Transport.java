package Kendaraan;

import Kendaraan.Class.Dealer;
import Kendaraan.Class.MobilBaru;
import Kendaraan.Class.MobilBekas;

public class Transport {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Avanza", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Civic", 2018, 200000000);
        Dealer dealer = new Dealer("Mobilindo", mobilBaru, mobilBekas);
        dealer.info();
    }
}