package haniff.ruang;

import haniff.bidang.Persegi;

public class Balok extends Persegi implements MenghitungRuang{
    
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return getPanjang() * getLebar() * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (getPanjang() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    }
}
