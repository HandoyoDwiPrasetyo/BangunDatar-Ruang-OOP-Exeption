package BangunRuang;

import BangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {
    protected double tinggi;
    protected double s; // s = garis pelukis
    protected double luasSelimut, luasPermukaanKerucut, volumeKerucut;

    public Kerucut(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
        s = Math.sqrt(Math.pow(jari,2) + Math.pow(tinggi,2));
    }
    public double getTinggi() {
        return tinggi;
    }

    public double LuasSelimut(){
        double jari = getJari();
        luasSelimut = Math.PI * jari * this.s;
        return luasSelimut;
    }

    public double LuasPerMukaanKerucut(){
        luasPermukaanKerucut = Lingkaran.luasLingkaran + this.luasSelimut;
        return luasPermukaanKerucut;
    }

    public double VolumeKerucut(){
        volumeKerucut = ((float)1/3) * Lingkaran.luasLingkaran * tinggi;
        return volumeKerucut;
    }


}
