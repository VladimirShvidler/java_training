package ru.srqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");

    double l = 5;
    System.out.println("Square's area with side " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Rectangle's are with sides " + a + " and " + b + " = " + area(a, b));



  }

  public static void hello(String somebody){
        System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len){
    return len*len;
  }

  public static double area(double a, double b){
    return a * b;
  }

}
