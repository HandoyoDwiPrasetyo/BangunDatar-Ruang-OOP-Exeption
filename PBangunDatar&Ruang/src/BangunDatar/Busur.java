package BangunDatar;

public class Busur extends Lingkaran{
    private double sudut;
    private double panjangBusur ;

    public Busur(double jari, double sudut){
        super(jari);
        this.sudut = sudut;
    }

    public double hitungPanjangBusur(){
        panjangBusur = (sudut/360) * super.kelilingLingkaran;
        return panjangBusur;
    }
}
