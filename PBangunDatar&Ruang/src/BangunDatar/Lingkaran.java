package BangunDatar;

public class Lingkaran {
    protected double jari;
    protected static double luasLingkaran;
    protected double kelilingLingkaran;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public double LuasLingkaran(){
        luasLingkaran = (Math.PI * Math.pow(this.jari,2));
        return luasLingkaran;
    }

    public double KelilingLingkaran(){
        kelilingLingkaran = (Math.PI*(jari+jari));
        return kelilingLingkaran;
    }

}
