package ru.srqa.pft.sandbox;

/**
 * Created by vshvidler on 2/29/2016.
 */
public class Point {

  double x;
  double y;

  public Point(double x, double y) {

    this.x = x;
    this.y = y;

  }

  public double distance(Point p) {

    double deltaX = p.x - this.x;
    double deltaY = p.y - this.y;

    return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
  }

}

