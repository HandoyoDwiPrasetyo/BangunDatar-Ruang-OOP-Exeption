package BangunRuang;

import BangunDatar.Lingkaran;

public class Tabung extends Lingkaran {
    private double tinggi;
    private double luasPermukaanTabung, volumeTabung;

    public Tabung(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }

    public double LuasPermukaanTabung(){
        double jari = getJari();
        luasPermukaanTabung = (2 * Lingkaran.luasLingkaran) + (super.kelilingLingkaran * tinggi);
        return luasPermukaanTabung;
    }

    public double VolumeTabung(){
        volumeTabung = Lingkaran.luasLingkaran*tinggi;
        return volumeTabung;
    }
}
