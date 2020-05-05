package BangunRuang;

public class Juring3D extends Bola{
    private double jariTinggi;
    private double luasPermukaanJuring3D, volumeJuring3D;

    public Juring3D(double jari, double jariTinggi){
        super(jari);
        this.jariTinggi = jariTinggi;
    }

    public double LuasPermukaanJuring3D(){
        double jari = getJari();
        luasPermukaanJuring3D = (2 * Math.PI * jariTinggi) + (Math.PI * jari);
        return luasPermukaanJuring3D;
    }

    public double VolumeJuring3D(){
        double jari = getJari();
        volumeJuring3D = (2 * Math.PI * Math.pow(jari,2) * jariTinggi) / 3;
        return volumeJuring3D;
    }
}
