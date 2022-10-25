package org.example;

public class Main {
        public static void main(String[] args) {
            if(args[0].equals("sinus"))
                System.out.println(Matematika.sinus(Double.parseDouble(args[1])));
            else if(args[0].equals("faktorijel")){
                System.out.println(Matematika.faktorijel(Integer.parseInt(args[1])));
            }
            else{
                System.out.println("Greska");
            }
        }
}