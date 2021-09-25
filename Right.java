// File: Right.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Right.
import static java.lang.Math.*;
import java.awt.*;

public final class Right extends Triangle
{
	private double side2;

		// used for side lengths
	private double s1;
	private double s2;


	public Right ()
	{
		side2 = 0.0;
	}

	public Right (Right R)
	{
		side = R.side;
		side2 = R.side2;
	}

	public Right (double S1, double S2)
	{
		side = S1;
		side2 = S2;
	}

	public void setSide1 (double S1)
	{
		side = S1;
	}

	public double getSide1 ()
	{
		return side;
	}

	public void setSide2 (double S2)
	{
		side2 = S2;
	}

	public double getSide2 ()
	{
		return side2;
	}

	public double perimeter ()
	{
		return (side + side2 + sqrt (side * side + side2 * side2));
	}

	public double area ()
	{
		return side * side2 / 2;
	}

	public String getName ()
	{
		return "Right";
	}

public Right (double S1, double S2, int X, int Y)	{
	 s1 = S1;
	 s2 = S2;
	 centerX = X;
	 centerY = Y;
	}
	public void paintComponent (Graphics2D g2)
	{

			 // public abstract void drawPolygon(int[] xPoints,
				//            int[] yPoints,
				//            int nPoints)
				int [] X = {0, (int) s1, 0};
				int [] Y = {0, (int) s2, (int) s2};
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
		//ArrayList <Right> C = new ArrayList <Right> ();

		Right T = new Right ();
		T.write (); System.out.println ();
		T = new Right (3, 4);
		T.write (); System.out.println ();
		Right T2 = new Right (T);
		T2.write (); System.out.println ();
		T2.setSide1 (123.45);
		T2.setSide2 (123.02);
		T2.write (); System.out.println ();
	}
}
