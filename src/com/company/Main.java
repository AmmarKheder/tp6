package com.company;

import java.io.IOException;

public class Main {

    public static void ex1() {
        Division c = new Division();
        double resultat = c.division1(5,2);
        System.out.println(resultat);

    }
    public static void ex2(){
        Division div=new Division();
        double resultat=div.division2(10,0);
        System.out.println(resultat);
    }

    public static void ex3() {
        Division c = new Division();

        try { 
            double res = c.division3(10, 0);
            System.out.println(res);
        }catch (IOException e){
            System.out.println("division par zero");
        }

    }

    public static void main(String[] args) {
    //Ici on appelle l'excercice qu'on veut exécuter
	   // ex1();
        //  ex2();
        ex3();
    }
}
