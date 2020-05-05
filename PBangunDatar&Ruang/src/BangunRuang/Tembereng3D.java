package BangunRuang;

public class Tembereng3D extends Bola {
    private double tinggiAir;
    private double luasPermukaanTembereng3D, volumeTembereng3D;

    public Tembereng3D(double jari, double tinggiAir){
        super(jari);
        this.tinggiAir = tinggiAir;
    }

    public double LuasPermukaanTembereng3D(){
        luasPermukaanTembereng3D = LuasPermukaanBola() * tinggiAir;
        return luasPermukaanTembereng3D;
    }

    public double VolumeTembereng3D(){
        double jari = getJari();
        volumeTembereng3D = VolumeBola() - ((float)(1/3) * Math.PI * Math.pow(tinggiAir,2) * (3*jari - tinggiAir));
        return volumeTembereng3D;
    }

}
