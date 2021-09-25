// File: Square.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Square.

import static java.lang.Math.*;

import java.awt.*;

public final class Square extends Quadrilateral
{
	public Square ()
	{
	}

	public Square (Square R)
	{
		side = R.side;
	}

	public Square (double S)
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
		return side*4;
	}

	public double area ()
	{
		return side * side;
	}

	public String getName ()
	{
		return "Square";
	}



	public void clone (Square R)
	{
		side = R.side;
	}
	/*******************************************************************
	* Function: 	public Square (double S, int X, int Y)							 *
	* Precondition: constructor    												 					   *
	* Postcondition: sets inititial x/y values  			  			  			 *
	* Description: inititializes the center and side value	           *
	********************************************************************/
	public Square (double S, int X, int Y){
		side = S;
		centerX = X;
		centerY = Y;
	}

	/*******************************************************************
	* Function: 	public void paintComponent (Graphics2D g2)					 *
	* Precondition: g2 graphic     												 					   *
	* Postcondition: paints the object using library draw function 		 *
	* Description:this will paint the square object at(centerX,centerY)*
	* side lengths are the same (square)															 *
	********************************************************************/
	public void paintComponent (Graphics2D g2)
	{
		g2.drawRect((int) (centerX-side/2),
	 (int) (centerY-side/2), (int) side, (int) side);
	 g2.drawRect((int) (centerX-1),
	(int) (centerY-1), 2, 2);
	}


	public static void main (String [] args)
	{
		Square T = new Square ();
		T.write ();
		System.out.println ();
		T = new Square (7);
		T.write ();
		System.out.println ();
		Square T2 = new Square (T);
		T2.write ();
		System.out.println ();
		T2.setSide (4.1);
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
