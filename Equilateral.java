// File: Equilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Equilateral.

import static java.lang.Math.*;
import java.awt.*;


public final class Equilateral extends Triangle
{

//	private double side3;

	public Equilateral ()
	{
		side = 0.0;
	}

	public Equilateral (Equilateral E)
	{
		side = E.side;
	}

	public Equilateral (double S)
	{
		side = S;
	}

	public void setSide (double S)
	{
		side = S;
	}

	public double getSide ()
	{
		return side;
	}

	public double perimeter ()
	{
		return 3 * side;
	}

	public double area ()
	{
		return sqrt(3) * side * side / 4;
	}

	public String getName ()
	{
		return "Equilateral";
	}



	public void clone (Equilateral E)
	{
		side = E.side;
	}
	/*******************************************************************
	* Function: public Equilateral (double S, int X, int Y)						*
	*																																	 *
	* Precondition: constructor    												 					   *
		* Postcondition: sets inititial x/y values and side value        *		  			  			 *
	* Description: inititializes the center and L/W  value	           *
	********************************************************************/

	public Equilateral (double S, int X, int Y)
	{
		side = S;
		centerX = X;
		centerY = Y;
	}
	public void paintComponent (Graphics2D g2)
	{

		// public abstract void drawPolygon(int[] xPoints,
    //            int[] yPoints,
    //            int nPoints)
		 int [] X = {0, (int) side, (int) (side / 2)};
		 int [] Y = {0, 0, (int) (sqrt(3) * side / -2)};
		 int dx = (int) centerX - (X[0] + X[1] + X[2]) / 3;
		 int dy = (int) centerY - (Y[0] + Y[1] + Y[2]) / 3;
		 for (int i = 0; i < 3; i++)
		 {
			 X[i] += dx;
			 Y[i] += dy;
		 }
		 g2.drawPolygon (X, Y, 3);
		 g2.drawOval ((int) centerX-1, (int) centerY-1, 2, 2);
	}

public static void main (String [] args)
{
	Equilateral T = new Equilateral ();
	T.write ();
	System.out.println ();
	T = new Equilateral (3.0);
	T.write ();
	System.out.println ();
	Equilateral T2 = new Equilateral (T);
	T2.write ();
	System.out.println ();
	T2.setSide (5);
	T2.write ();
	System.out.println ();
	T.clone (T2);
	T2.write ();
	System.out.println ();
	T.write ();
	System.out.println ();
	T2.setSide (8.1);
	T2.write ();
	System.out.println ();
	T.write ();
	System.out.println ();
	}
}
