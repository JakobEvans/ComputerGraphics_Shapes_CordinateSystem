// File: Circle.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Circle.

import static java.lang.Math.*;
import java.util.*;
import java.awt.*;


public final class Circle extends Shape
{

	private double diameter;




	public Circle ()
	{
    diameter = 0.0;
	}

	public Circle (Circle C)
	{
		diameter = C.diameter;
	}

  public String sides ()
	{
		return "infinite";
	}

	public Circle (double D)
	{
		diameter = D;
	}

	public void setDiameter (double D)
	{
		diameter = D;
	}

	public double getDiameter ()
	{
		return diameter;
	}

	public double perimeter ()
	{
		return (Math.PI) * (diameter);
	}

	public double area ()
	{
    //double radius = diameter;
		return Math.PI * (Math.pow(diameter/2, 2));
	}

	public String getName ()
	{
		return "Circle";
	}

	public void clone (Circle C)
	{
		diameter = C.diameter;
	}

	public Circle (double S, int X, int Y)
	{
	 side = S;
	 centerX = X;
	 centerY = Y;
	}
	public void paintComponent (Graphics2D g2)
	{
		//Oval function:
		// public abstract void drawOval(int x,
    //         int y,
    //         int width, // major ?
    //         int height) // minor?

			 g2.drawOval ((int) (centerX-side/2),
			(int) (centerY-side/2), (int) side, (int) side);

			 g2.drawOval ((int) centerX-1, (int) centerY-1, 2, 2);
	}




	public static void main (String [] args)
	{
		ArrayList <Circle> C = new ArrayList <Circle> ();

		Circle T = new Circle ();
		T.write ();
		System.out.println ();
		T = new Circle (3.5);
		C.add(T);
		T.write ();
		System.out.println ();
		Circle T2 = new Circle (T);
		T2.write ();
		System.out.println ();
		T2.setDiameter (5);
		T2.write ();
		C.add(T2);

		System.out.println ();
		T.clone (T2);
		T2.write ();
		System.out.println ();
		T.write ();
		System.out.println ();
		T2.setDiameter (15.55);
		T2.write ();
		C.add(T2);

		System.out.println ();
		T.write ();
		System.out.println ();

		for (int i = 0; i < C.size (); )
		{
				if (C.get(i).getName() == "Circle")
				{
			System.out.print ("Circle " + i + " is a ");
			C.get(i).write ();
			System.out.println ();
				}
		}




	}
}
