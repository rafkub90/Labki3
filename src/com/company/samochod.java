package com.company;


public class samochod {
    public samochod(int moc, int cena, String color, double spalanie){
        this.moc = moc;
        this.cena = cena;
        this.color = color;
        this.spalanie = spalanie;

    }
    public double paliwo(int km, double cena){
        double tmp = (km*cena*this.spalanie)/100;
        return tmp;
    }
    public int moc;
    public int cena;
    public double spalanie;
    public String color;
}