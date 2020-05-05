package BangunDatar;

public class Tembereng2D extends Lingkaran{
    private double sudut;
    private double kelilingTembereng2D, luasTembereng2D;

    public Tembereng2D(double jari, double sudut){
        super(jari);
        this.sudut = sudut;
    }

    public double KelilingTembereng2D(){
        kelilingTembereng2D = ((sudut/360) * super.kelilingLingkaran) + (2 * getJari() * Math.sin(sudut/2));
        System.out.println("Keliling : " + KelilingLingkaran());

        return kelilingTembereng2D;
    }

    public double LuasTembereng2D(){
        System.out.println("Luas : " + Lingkaran.luasLingkaran);
        luasTembereng2D = ((sudut/360) * Lingkaran.luasLingkaran) - (0.5 * Math.pow(getJari(),2) * Math.sin(sudut));
        return luasTembereng2D;
    }
}
