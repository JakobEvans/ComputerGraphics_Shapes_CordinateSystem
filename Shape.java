// File: Shape.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a virtual class called Shape. 

import java.text.NumberFormat;
import java.awt.*;

public class Shape implements Comparable<Shape>
{
	protected double side;
	protected double centerX;
	protected double centerY;

	public Shape ()
	{
		side = 0;
	}
	
	public Shape (Shape S)
	{
		side = S.side;
	}

	public void paintComponent (Graphics2D g2)
	{
	}

	public double area ()
	{
		return 0;
	}
	
	public double perimeter ()
	{
		return 0;
	}
	
	public String sides ()
	{
		return "0";
	}
	
	public void write ()
	{
    		NumberFormat nf = NumberFormat.getInstance();
    		nf.setMinimumFractionDigits(2);
    		nf.setMaximumFractionDigits(2);
		System.out.print (sides () + " sided shape; ");
		System.out.print (" with perimeter = " + nf.format(perimeter ()));
		System.out.print (" and area = " + nf.format(area ()));
/*
		System.out.println();
		System.out.print (sides () + " sided shape; ");
		System.out.print (" with perimeter = " + perimeter ());
		System.out.print (" and area = " + area ());
		System.out.println();
		System.out.print(this.toString());
*/
	}

	public String toString ()
	{
		String string = new String ();
    		NumberFormat nf = NumberFormat.getInstance();
    		nf.setMinimumFractionDigits(2);
    		nf.setMaximumFractionDigits(2);
		string += (sides () + " sided shape; ");
		string += (" with perimeter = " + nf.format(perimeter ()));
		string += (" and area = " + nf.format(area ()));
		return string;
	}

	public int compareTo (Shape S)
	{
		double a1 = area (), a2 = S.area ();
		double p1 = perimeter (), p2 = S.perimeter ();
		if (a1 < a2) return -1;
		if (a1 > a2) return 1;
		if (p1 < p2) return -2;
		if (p1 > p2) return 2;
		return 0;
	}

	public String getName ()
	{
		return "Shape";
	}

	public static void main (String [] args)
	{
		Shape S = new Shape ();
		S.write ();
		System.out.println ();
	}
}
