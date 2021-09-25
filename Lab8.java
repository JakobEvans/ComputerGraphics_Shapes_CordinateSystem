// File: Lab8.java
// Author: Jakob Evans
// Contents: This file contains the implementation of a small GUI
// application that uses the Shap cass heirachy developed in Lab 6.

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class Lab8 extends JPanel implements ActionListener, MouseMotionListener, MouseListener
{
    private JButton theButton;
    private int mouseX, mouseY;
    private int red, green, blue;
    private boolean inScreen = true;
    private ArrayList <Shape> S = new ArrayList <Shape> ();

    public Lab8 ()
    {
	      red = green = blue = 30;
        theButton = new JButton ("Change Color");
        add (theButton);
        theButton.addActionListener (this);
        addMouseMotionListener(this);
        addMouseListener(this);

	S.add (new Circle (20, 100, 150));
	S.add (new Circle (30, 200, 150));
	S.add (new Circle (40, 300, 150));

	S.add (new Square (20, 100, 200));
	S.add (new Square (30, 200, 200));
	S.add (new Square (40, 300, 200));

	S.add (new Rectangle (20, 40, 100, 250));
	S.add (new Rectangle (30, 30, 200, 250));
	S.add (new Rectangle (40, 20, 300, 250));

	S.add (new Equilateral (20, 100, 300));
	S.add (new Equilateral (30, 200, 300));
	S.add (new Equilateral (40, 300, 300));

	S.add (new Right (30, 40, 100, 350));
	S.add (new Right (30, 30, 200, 350));
	S.add (new Right (40, 20, 300, 350));

	S.add (new Scalene (50, 30, 40, 100, 400));
	S.add (new Scalene (40, 60, 50, 200, 400));
	S.add (new Scalene (40, 30, 60, 300, 400));

	S.add (new Polygon (5, 40, 100, 450));
	S.add (new Polygon (6, 30, 200, 450));
	S.add (new Polygon (9, 20, 300, 450));
	S.add (new Circle (50, 500, 500));
	S.add (new Square (60, 500, 500));
	S.add (new Equilateral (70, 500, 500));
	S.add (new Polygon (7, 40, 500, 500));

        repaint();
    }

    public void mouseDragged(MouseEvent e)
    {
	if (inScreen)
	{
            mouseX = e.getX();
            mouseY = e.getY();
	}
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e)
    {
	inScreen = true;
    }

    public void mouseExited(MouseEvent e)
    {
	inScreen = false;
    }

    public void mouseClicked(MouseEvent e) {}

    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint (new Color (red, green, blue));
	for (int i = 0; i < S.size(); i++)
	{
		S.get(i).paintComponent (g2);
	}
    }

    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource() == theButton)
        {
            red = (red * 29) % 254 + 2;
            green = (green * 31) % 254 + 2;
            blue = (blue * 53) % 254 + 2;
            repaint ();
        }
    }

    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Lab 8");
        Lab8 lab8 = new Lab8 ();
        frame.getContentPane().add (lab8);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (600,600);
        frame.setVisible (true);
        frame.setResizable (false);
        frame.setLocation (100, 100);
    }
}
