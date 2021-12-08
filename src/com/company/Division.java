package com.company;

import java.io.IOException;

public class Division {

  public double division1(int a, int b){
      return (double)a/b;
  }
  public double division2(int a, int b) {
      try {
          return a / b;
      } catch (ArithmeticException ex) {
          System.out.println("Division par zéro");
      }
      return 0;
  }

  public double division3(int a, int b) throws IOException{
    if (b==0){
        throw new IOException();
    }
    return a/b;
  }
}
