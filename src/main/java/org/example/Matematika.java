package org.example;

public class Matematika {
    public static double sinus(double ugao){
        double radijani = (ugao*Math.PI)/180.;
        double sinus = 0;
        int predznak = 1;
        for(int i=1; i<10; i+=2){
            sinus+=predznak*(Math.pow(radijani,i))/faktorijel(i);
            predznak*=-1;
        }
        return sinus;
    }

    public static int faktorijel(int n){
        int fakt = 1;
        for(int i=1; i<=n; i++){
            fakt*=i;
        }
        return fakt;
    }
}
