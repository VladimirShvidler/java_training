package ru.srqa.pft.sandbox;

import static java.lang.Math.*;

/**
 * Created by vshvidler on 2/29/2016.
 */
public class Runner {
  public static void main(String[] args) {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);

    double distance = p1.distance(p2);
    System.out.println("Distance between " + "point1 with coordinate " + "x = " + p1.x + " and y = " + p1.y +
            " and point2 with coordinate " + "x = " + p2.x + " and y = " + p2.y + " is " + distance);


  }


}

