// File: Rectangle.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Rectangle.

import static java.lang.Math.*;
import java.awt.*;

public final class Rectangle extends Quadrilateral
{
  private double L;
  private double W;
  private double side2;

	public Rectangle ()
	{
    L = 0.0;
    W = 0.0;
	}

	public Rectangle (Rectangle R)
	{
		L = R.L;
    W = R.W;

	}

	public Rectangle (double Len,double Wid)
	{
		L = Len;
    W = Wid;

	}

	public void setSides (double Len, double Wid)
	{
		L = Len;
    W = Wid;

	}

	public double getLength ()
	{
		return L;
	}
  public double getWidth ()
  {
    return W;
  }

	public double perimeter ()
	{
		return (L*2)+(W*2);
	}

	public double area ()
	{
    double area = L * W;

		return area;
	}

	public String getName ()
	{
		return "Rectangle";
	}



	public void clone (Rectangle R)
	{
		L = R.L;
    W = R.W;
	}


  /*******************************************************************
  * Function: 	public Rectangle (double S1, double S2 int X, int Y)						 *
  * Precondition: constructor    												 					   *
  * Postcondition: sets inititial x/y values  			  			  			 *
  * Description: inititializes the center and L/W  value	           *
  ********************************************************************/
public Rectangle (double S1, double S2, int X, int Y) {
    side = S1; //L
    side2 = S2; // W

    centerX = X;
    centerY = Y;
  }

  /*******************************************************************
  * Function: 	public void paintComponent (Graphics2D g2)					 *
  * Precondition: g2 graphic     												 					   *
  * Postcondition: paints the object using library draw function 		 *
  * Description:this will paint the Rectangle object at  Cx,Cy       *
  * has two side lengths (L/W)														           *
  ********************************************************************/
  public void paintComponent (Graphics2D g2)
  {
    g2.drawRect((int) (centerX-side/2),
   (int) (centerY-side2/2), (int) side, (int) side2);
   g2.drawRect((int) (centerX-1),
  (int) (centerY-1), 2, 2);
  }



	public static void main (String [] args)
	{
		Rectangle T = new Rectangle ();
		T.write ();
		System.out.println ();
		T = new Rectangle (5.5,6.6);
		T.write ();
		System.out.println ();
		Rectangle T2 = new Rectangle (T);
		T2.write ();
		System.out.println ();
		T2.setSides (7,17);
		T2.write ();
		System.out.println ();

    System.out.println(T2.getWidth());
    System.out.println(T2.getLength());



		T.clone (T2);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
		T2.setSides (15.2,16.7);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
    T2.setSides (2.0,8.0);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();

	}
}
