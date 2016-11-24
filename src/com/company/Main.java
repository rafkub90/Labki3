package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = "";
        try {
            System.out.print("podaj cene samochodu: ");
            n=scanner.nextLine();
            int cena = Integer.parseInt(n);
            n="";
            System.out.print("podaj moc samochodu: ");
            n=scanner.nextLine();
            int moc = Integer.parseInt(n);
            n="";
            System.out.print("podaj spalanie samochodu: ");
            n=scanner.nextLine();
            double spalanie = Double.parseDouble(n);
            n="";
            System.out.print("podaj kolor samochodu: ");
            n=scanner.nextLine();
            String kolor = n;
            samochod vw = new samochod(moc, cena,kolor,spalanie);

            System.out.println("VW cena: "+vw.cena);
            System.out.println("Koszt przy 234 km: "+vw.paliwo(100,4.56));
            PrintWriter file = new PrintWriter("plik.txt");
            file.println("Cena: "+cena+", Moc: "+moc+"spalanie: "+spalanie+"Koszt przy 100 km: "+vw.paliwo(100,4.56));
            file.close();
        }
        catch (Exception e) {
            System.out.println("podales zle dane");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }



    }
}