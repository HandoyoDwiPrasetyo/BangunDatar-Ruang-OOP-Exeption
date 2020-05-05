import BangunDatar.Busur;
import BangunDatar.Juring2D;
import BangunDatar.Lingkaran;
import BangunDatar.Tembereng2D;
import BangunRuang.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner inputScan = new Scanner(System.in);
        int pilih = 0, pilihDatar = 0, pilihRuang = 0;
        char kembali;
        do {
            System.out.println(" == Menu");
            System.out.println(" 1. Bangun Datar");
            System.out.println(" 2. Bangun Ruang");
            System.out.println(" 3. Keluar");
            System.out.print(" Pilih Menu : ");
            pilih = inputScan.nextInt();
            switch (pilih){
                case 1 :
                    System.out.println("\n == Menu Bangun Datar");
                    System.out.println(" 1. Lingkaran ( Luas )");
                    System.out.println(" 2. Tembereng 2D ( Luas & Keliling )");
                    System.out.println(" 3. Juring 2D ( Luas & Keliling )");
                    System.out.println(" 4. Panjang Busur ( Juring 2D & Tembereng 2D )");
                    System.out.print(" Pilih Menu : ");
                    pilihDatar = inputScan.nextInt();
                    switch (pilihDatar){
                        case 1 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                new ValidateNilai(jari);
                                //Lingkaran
                                System.out.println("\n == Lingkaran  ");
                                Lingkaran lingkaran = new Lingkaran(jari);
                                System.out.println("Luas Lingkaran : " + lingkaran.LuasLingkaran());
                            } catch (InputMismatchException ex) {
                                System.err.println(" Input Harus Angka !");
                            } catch (Exception e){
                                System.err.println(e);
                            }
                            break;
                        case 2 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Besar Sudut : ");
                                double sudut = inputScan.nextDouble();
                                new ValidateNilai(jari, sudut);
                                //Tembereng 2D
                                System.out.println("\n == Tembereng 2D");
                                Tembereng2D tembereng2D = new Tembereng2D(jari, sudut);
                                System.out.println("Keliling Tembereng 2D : " + tembereng2D.KelilingTembereng2D());
                                System.out.println("Luas Tembereng 2D : " + tembereng2D.LuasTembereng2D());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 3 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Besar Sudut : ");
                                double sudut = inputScan.nextDouble();
                                new ValidateNilai(jari, sudut);
                                //Juring 2D
                                System.out.println("\n == Juring 2D");
                                Juring2D juring2D = new Juring2D(jari, sudut);
                                System.out.println("Keliling Juring 2D : " + juring2D.KelilingJuring2D());
                                System.out.println("Luas Juring 2D : " + juring2D.LuasJuring2D());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 4 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Besar Sudut : ");
                                double sudut = inputScan.nextDouble();
                                new ValidateNilai(jari, sudut);
                                //Busur
                                System.out.println("\n == Busur");
                                Busur busur = new Busur(jari, sudut);
                                System.out.println("Panjang Busur Tembereng 2D : " + busur.hitungPanjangBusur());
                                System.out.println("Panjang Busur Juring 2D : " + busur.hitungPanjangBusur());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        default:
                            System.out.println(" Pilihan yang anda maukkan tidak ditemukan!");
                            break;
                    }
                    break;
                case 2 :
                    System.out.println("\n == Menu Bangun Ruang");
                    System.out.println(" 1. Bola ( Volume )");
                    System.out.println(" 2. Tembereng 3D ( Luas & Volume )");
                    System.out.println(" 3. Juring 3D ( Luas & Volume )");
                    System.out.println(" 4. Kerucut ( Luas & Volume )");
                    System.out.println(" 5. Kerucut terpancung ( Luas & Volume )");
                    System.out.println(" 6. Tabung ( Luas & Volume )");
                    System.out.print(" Pilih Menu : ");
                    pilihRuang = inputScan.nextInt();
                    switch (pilihRuang){
                        case 1 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                new ValidateNilai(jari);
                                //Bola
                                System.out.println("\n == Bola");
                                Bola bola = new Bola(jari);
                                System.out.println("Volume Bola : " + bola.VolumeBola());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 2 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Tinggi air : ");
                                double tinggiAir = inputScan.nextDouble();
                                new ValidateNilai(jari, tinggiAir);
                                //Tembereng 3D
                                Tembereng3D tembereng3D = new Tembereng3D(jari, tinggiAir);
                                System.out.println("\n == Tembereng 3D");
                                System.out.println("Luas Permukaan Tembereng 3D : " + tembereng3D.LuasPermukaanTembereng3D());
                                System.out.println("Volume Tembereng 3D : " + tembereng3D.VolumeTembereng3D());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 3 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Jari-jari Tinggi : ");
                                double jariTinggi = inputScan.nextDouble();
                                new ValidateNilai(jari, jariTinggi);
                                //Juring 3D
                                Juring3D juring3D = new Juring3D(jari, jariTinggi);
                                System.out.println("\n == Juring 3D");
                                System.out.println("Luas Permukaan Juring 3D : " + juring3D.LuasPermukaanJuring3D());
                                System.out.println("Volume Juring 3D : " + juring3D.VolumeJuring3D());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 4 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Tinggi Kerucut : ");
                                double tinggiKerucutBesar = inputScan.nextDouble();
                                new ValidateNilai(jari, tinggiKerucutBesar);
                                //Kerucut
                                System.out.println("\n == Kerucut  ");
                                Kerucut kerucut = new Kerucut(jari, tinggiKerucutBesar);
                                System.out.println("Luas Permukaan Kerucut : " + kerucut.LuasPerMukaanKerucut());
                                System.out.println("Volume Kerucut : " + kerucut.VolumeKerucut());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 5 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Tinggi Kerucut : ");
                                double tinggiKerucutBesar = inputScan.nextDouble();
                                System.out.print(" Masukkan Tinggi Kerucut Yang akan di potong untuk kerucut terpancung : ");
                                double tinggiKerucutKecil = inputScan.nextDouble();
                                System.out.print(" Masukkan Jari Kerucut Yang akan di potong untuk kerucut terpancung : ");
                                double jariKecil = inputScan.nextDouble();
                                new ValidateNilai(jari, jariKecil, tinggiKerucutBesar, tinggiKerucutKecil);
                                //Kerucut Terpancung
                                System.out.println("\n == Kerucut Terpancung ");
                                KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(jari, jariKecil, tinggiKerucutBesar, tinggiKerucutKecil);
                                System.out.println("Luas Permukaan Kerucut Terpancung : " + kerucutTerpancung.LuasPermukaanKerucutTerpancung());
                                System.out.println("Volume Kerucut Terpancung : " + kerucutTerpancung.VolumeKerucutTerpancung());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        case 6 :
                            try {
                                System.out.print(" Masukkan Jari-jari : ");
                                double jari = inputScan.nextDouble();
                                System.out.print(" Masukkan Tinggi Tabung : ");
                                double tinggiTabung = inputScan.nextDouble();
                                //Tabung
                                new ValidateNilai(jari, tinggiTabung);
                                System.out.println("\n == Tabung ");
                                Tabung tabung = new Tabung(jari, tinggiTabung);
                                System.out.println("Luas Permukaan Tabung : " + tabung.LuasPermukaanTabung());
                                System.out.println("Volume Tabung : " + tabung.VolumeTabung());
                            } catch (Exception e) {
                                System.err.println(e);
                            }
                            break;
                        default:
                            System.out.println(" Pilihan yang anda maukkan tidak ditemukan!");
                            break;
                    }
                    break;
                case 3 :
                       System.exit(0);
                       break;
                default:
                    System.out.println(" Pilihan yang anda masukkan tidak ditemukan!");
                    break;
            }
            System.out.print("\n\nInput Ulang ? (y/n) : ");
            kembali = inputScan.next().charAt(0);
        }while ( kembali == 'y' || kembali =='Y' );
    }
}
