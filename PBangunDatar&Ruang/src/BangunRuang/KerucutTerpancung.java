package BangunRuang;

public class KerucutTerpancung extends Kerucut {
    private double r,t1, t2, s1;
    private double luasSelimutKecil, luasSelimutKerucutTerpancung, luasPermukaanKerucutTerpancung, volumeKerucutKecil, volumeKerucutTerpancung;

    public KerucutTerpancung(double R, double r, double T, double t1){
        super(R,T);
        this.r = r;
        this.t1 = t1;
        t2 = T - t1;
        s1 = Math.sqrt(Math.pow(r,2) + Math.pow(t1,2));
    }

    public double LuasSelimutKecil(){
        luasSelimutKecil = Math.PI * r * s1;
        return luasSelimutKecil;
    }

    public double LuasSelimutKerucutTerpancung(){
        luasSelimutKerucutTerpancung = LuasSelimut() - this.LuasSelimutKecil();
        return luasSelimutKerucutTerpancung;
    }

    public double LuasPermukaanKerucutTerpancung(){
        double R = getJari();
        luasPermukaanKerucutTerpancung = LuasSelimutKerucutTerpancung() + (Math.PI * Math.pow(R,2)) + (Math.PI * Math.pow(r,2));
        return luasPermukaanKerucutTerpancung;
    }

    public double VolumeKerucutKecil(){
        volumeKerucutKecil = (float)(1/3) * Math.PI * Math.pow(r,2);
        return volumeKerucutKecil;
    }

    public double VolumeKerucutTerpancung(){
        volumeKerucutTerpancung = VolumeKerucut() - this.VolumeKerucutKecil();
        return volumeKerucutTerpancung;
    }
}
