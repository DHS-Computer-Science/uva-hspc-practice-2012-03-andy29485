//Andriy Zasypkin
//2016-03-15
//Practice 2014 - 06: Spawn of Ungoliant

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nCases = input.nextInt();
    for(int i=1; i<=nCases; i++) {
      int    nAnts = input.nextInt();
      double dMinX = Double.MAX_VALUE;
      double dMinY = Double.MAX_VALUE;
      double dMaxX = -Double.MAX_VALUE;
      double dMaxY = -Double.MAX_VALUE;

      for(int j=0; j<nAnts; j++) {
        double tmpX = input.nextDouble();
        double tmpY = input.nextDouble();

        dMinX = Math.min(tmpX, dMinX);
        dMinY = Math.min(tmpY, dMinY);
        dMaxX = Math.max(tmpX, dMaxX);
        dMaxY = Math.max(tmpY, dMaxY);
      }
      double a =   (dMaxX-dMinX) *   (dMaxY-dMinY);
      double p = 2*(dMaxX-dMinX) + 2*(dMaxY-dMinY);
      System.out.println("Case "+i+": Area "+a+", Perimeter "+p);
    }

    System.exit(0);
  }
}
