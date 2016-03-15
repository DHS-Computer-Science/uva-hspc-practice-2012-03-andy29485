//Andriy Zasypkin
//2016-03-15
//Practice 2014 - 06: Spawn of Ungoliant

import java.io.*;

class Rect {
  private double width;
  private double height;

  public Rect(double x1, double y1, double x2, double y2) {
    this.width  = x2-x1;
    this.height = y2-y1;
  }

  public static Rect gen(double... points) {
    double minx = Double.MAX_VALUE;
    double miny = Double.MAX_VALUE;
    double maxx = Double.MIN_VALUE;
    double maxy = Double.MIN_VALUE;

    for(int i=0; i<points.length; i++) {
      if(i%2==0) {
        if(points[i] < minx)
          minx = points[i];
        if(points[i] > maxx)
          maxx = points[i];
      }
      else {
        if(points[i] < miny)
          miny = points[i];
        if(points[i] > maxy)
          maxy = points[i];
      }
    }

    return new Rect(minx, miny, maxx, maxy);
  }

  public double perimeter() {
    return width*2 + height*2;
  }

  public double area() {
    return width*height;
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    int nCases = Integer.valueOf(input.readLine());
    for(int i=1; i<=nCases; i++) {
      int   nAnts      = Integer.valueOf(input.readLine());
      double[] points  = new double[nAnts*2];
      for(int j=0; j<nAnts; j++) {
        String[] point = input.readLine().split("\\s+");
        points[2*j]    = Double.valueOf(point[0]);
        points[2*j+1]  = Double.valueOf(point[1]);
      }
      Rect rect = Rect.gen(points);
      System.out.println("Case "+i+": Area "+rect.area()+
                         ", Perimeter "+rect.perimeter());
    }

    //close stream
    input.close();

    System.exit(0);
  }
}
