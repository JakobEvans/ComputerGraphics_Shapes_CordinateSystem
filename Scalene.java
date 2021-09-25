// File: Scalene.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Scalene.

import static java.lang.Math.*;
import java.awt.*;


public final class Scalene extends Triangle
{

  private double side2;
  private double side3;

  private double s1;
  private double s2;
	private double s3;

	public Scalene ()
	{
    side2 = 0.0;
    side3 = 0.0;
	}

	public Scalene (Scalene sumSides)
	{ // copy constructor
		side = sumSides.side;
    side2 = sumSides.side2;
    side3 = sumSides.side3;
	}

	public Scalene (double sumSides, double S2, double S3)
	{
		side = sumSides;
    side2 = S2;
    side3 = S3;
	}

	public void setSides (double sumSides, double S2, double S3)
	{
		side = sumSides;
    side2 = S2;
    side3 = S3;
	}

	public double getSide ()
	{
		return side;
	}
  public double getSide2 ()
  {
    return side2;
  }
  public double getSide3 ()
  {
    return side3;
  }

	public double perimeter ()
	{
		return side + side2 + side3;
	}

	public double area ()
	{
    if ((side > side2 + side3) || (side2 > side + side3) || (side3 > side + side2)){
      System.out.println();

        System.out.println(side);
        System.out.println ();
        System.out.println(side2);
        System.out.println ();
        System.out.println(side3);

        System.out.println ();

        System.out.println("TESTING");
        System.out.println();

    }
    double sumSides = (side + side2 + side3)/2;
  	return (Math.sqrt(sumSides*(sumSides-side)*(sumSides-side2)*(sumSides-side3)));
	}

	public String getName ()
	{
		return "Scalene";
	}



	public void clone (Scalene sumSides)
	{
		side = sumSides.side;
    side2 = sumSides.side2;
    side3 = sumSides.side3;

	}




  public Scalene (double S1, double S2, double S3, int X, int Y)	{
  	 s1 = S1;
  	 s2 = S2;
     s3 = S3;
  	 centerX = X;
  	 centerY = Y;
  	}
  	public void paintComponent (Graphics2D g2)
  	{
  			 // public abstract void drawPolygon(int[] xPoints,
  				//            int[] yPoints,
  				//            int nPoints)

          //Must CHANGE FOR SCALENE FORMULA

          double sumSides = (s1 + s2 + s3)/2;

          double height = ((2 / s1) * sqrt((sumSides-s1)*(sumSides-s2)*
                                            (sumSides-s3)*sumSides));

          double distance = sqrt(abs( Math.pow(s2,2) - Math.pow(height,2) ));

  				int [] X = {0, (int) distance,(int) s1};
  				int [] Y = {0, (int) -height, 0};

          //cos(C) = (a2 + b2 – c2) ÷ 2_ab_
          double temp = (Math.pow(s1,2)+Math.pow(s2,2)-Math.pow(s3,2))/(2*s1*s2);
          //(change from acute to obtuse)
          if(Math.acos(temp) >= (Math.PI/2)){
            X[1] = (int)-distance;
          }

  				int dx = (int) centerX - (X[0] + X[1] + X[2]) / 3;
  				int dy = (int) centerY - (Y[0] + Y[1] + Y[2]) / 3;
  				for (int i = 0; i < 3; i++)
  				{

  					X[i] += dx;
  					Y[i] += dy;
  				}

  				g2.drawPolygon (X, Y, 3);
  				g2.drawOval ((int) centerX-1, (int) centerY-1, 2, 2);
          //g2.fillPolygon (X, Y, 3);
  				//g2.fillOval ((int) centerX-1, (int) centerY-1, 2, 2);
  	}

	public static void main (String [] args)
	{
		Scalene T = new Scalene ();
		T.write ();
		System.out.println ();
		T = new Scalene (3,3,2);
		T.write ();
		System.out.println ();
		Scalene T2 = new Scalene (T);
		T2.write ();
		System.out.println ();
		T2.setSides (3,4,5);
    System.out.println (T2.getSide());
    System.out.println (T2.getSide2());
    System.out.println (T2.getSide3());

		T2.write ();
		System.out.println ();
		T.clone (T2);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
		T2.setSides (14.2,15.3,6.8);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
	}
}
