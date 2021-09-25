// File: Quadrilateral.java
// Author: Jakob Evans
// Contents: This file contains the description and implementation
// of a class called Quadrilateral.
//This is the master class.
public class Quadrilateral extends Shape
{
	Quadrilateral ()
	{
	}

	public String sides ()
	{
		return "4";
	}

	public String getName ()
	{
		return "Quadrilateral";
	}



	public static void main (String [] args)
	{
		Quadrilateral T = new Quadrilateral ();
		T.write ();
		System.out.println ();
	}
}
