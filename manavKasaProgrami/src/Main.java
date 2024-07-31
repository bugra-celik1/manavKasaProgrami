import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double armut,elma,muz,domates,patlican,toplamTutar;
double armutTutar = 2.14,elmaTutar = 3.67, muzTutar = 0.95 ,domatesTutar =1.11 , patlicanTutar =5 ;
Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armut = inp.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elma = inp.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        domates = inp.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        muz = inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        patlican = inp.nextDouble();


        toplamTutar =armut * armutTutar + elma * elmaTutar + domates * domatesTutar +muz * muzTutar + patlican * patlicanTutar;

        System.out.println("Toplam tutar : " +toplamTutar + " TL");

    }
}