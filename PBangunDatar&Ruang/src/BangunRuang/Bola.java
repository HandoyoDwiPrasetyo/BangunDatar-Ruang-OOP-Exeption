package BangunRuang;

import BangunDatar.Lingkaran;

public class Bola extends Lingkaran {
    protected double volumeBola, luasPermukaanBola;

    public Bola(double jari){
        super(jari);
    }

    public double LuasPermukaanBola(){
        volumeBola = 4*Lingkaran.luasLingkaran;
        return volumeBola;
    }

    public double VolumeBola(){
        luasPermukaanBola = (float)(4/3)*Lingkaran.luasLingkaran * getJari();
        return luasPermukaanBola;
    }
}
