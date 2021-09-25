// File: Polygon.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Polygon.

import static java.lang.Math.*;
import java.awt.*;

public final class Polygon extends Quadrilateral
{

  private double side2;
  private int numSides;


	public Polygon ()
	{
    side = 0.0;
    numSides = 0;
	}

	public Polygon (Polygon P)
	{
		side = P.side;
    numSides = P.numSides;

	}

	public Polygon (int N,double V)
	{
		side = V;
    numSides = (int)N;

	}

	public void setSides (int N, double V)
	{
		side = V;
    numSides = N;

	}

	public double getSide ()
	{
		return side;
	}
  public double getnumSides ()
  {
    return numSides;
  }

	public double perimeter ()
	{
		return 0;//(side*2)+(numSides*2);
	}

	public double area ()
	{
    double area = side * numSides;

		return area;
	}

	public String getName ()
	{
		return "Polygon";
	}



	public void clone (Polygon P)
	{
		side = P.side;
    numSides = P.numSides;
	}


  /*******************************************************************
  * Function: 	public Polygon (double S1, double S2 int X, int Y)	 *
  * Precondition: constructor    												 					   *
  * Postcondition: sets inititial x/y values  			  			  			 *
  * Description: inititializes the center and numsides and the value *
  * of those sides                                      	           *
  ********************************************************************/
public Polygon (int N, double S2, int X, int Y) {
    numSides = N;
    side = S2;

    centerX = X;
    centerY = Y;
  }

  /*******************************************************************
  * Function: 	public void paintComponent (Graphics2D g2)					 *
  * Precondition: g2 graphic     												 					   *
  * Postcondition: paints the object using library draw function 		 *
  * Description:this will paint the Polygon object at  Cx,Cy       *
  * has number of sides and the side length of those sides           *
  ********************************************************************/
  public void paintComponent (Graphics2D g2)
  {
    int [] X = new int [numSides];
    int [] Y = new int [numSides];



    double shift = ( ((Math.PI * 2) / numSides) );
    double radius = (side / (2*Math.sin(Math.toRadians(180/numSides))));

    double initial = -(Math.PI / 2)-(Math.PI/numSides);

    for (int i = 0; i < numSides; i++)
    {

      X[i] = (int) (centerX + (radius * Math.cos(i*shift + initial)));
      Y[i] = (int) (centerY - (radius * Math.sin(i*shift + initial)));

      System.out.println("X[i] is " + X[i] + ", Y[i] is " + Y[i]);
      System.out.println("X[i] is " + X[i] + ", Y[i] is " + Y[i]);


    }

    g2.drawPolygon (X, Y, numSides);
    g2.drawOval ((int) centerX-1, (int) centerY-1, 2, 2);
  }


	public static void main (String [] args)
	{
		Polygon T = new Polygon ();
		T.write ();
		System.out.println ();
		T = new Polygon (5,6.6);
		T.write ();
		System.out.println ();
		Polygon T2 = new Polygon (T);
		T2.write ();
		System.out.println ();
		T2.setSides (7,17);
		T2.write ();
		System.out.println ();

    System.out.println(T2.getnumSides());
    System.out.println(T2.getSide());



		T.clone (T2);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
		T2.setSides (15,16.7);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
    T2.setSides (2,8.0);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();

	}
}
