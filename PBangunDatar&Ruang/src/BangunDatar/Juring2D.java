package BangunDatar;

public class Juring2D extends Lingkaran{
    private double sudut;
    protected double kelilingJuring2D, luasJuring2D;

    public Juring2D(double jari, double sudut){
        super(jari);
        this.sudut = sudut;
    }
    public double KelilingJuring2D(){
        kelilingJuring2D = (sudut/360) * super.kelilingLingkaran + 2 * getJari();
        return kelilingJuring2D;
    }

    public double LuasJuring2D(){
        luasJuring2D = (sudut/360) * super.luasLingkaran;
        return luasJuring2D;
    }
}
