package applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class myapplet extends Applet {
	String n;
	public void init()
	{
		n="welcome to applets";
		setForeground(Color.BLUE);//changes text color
		setBackground(Color.GREEN);
	}
	public void start()
	{
		n=n+".........in java";
	}
	public void paint(Graphics g)
	{
		Font ft=new Font("Arial",Font.BOLD,18);
		g.setFont(ft);
		g.drawString(n,120,40);
		//g.setFont(new Font("Comic Sans MS",Font.ITALIC,42));
		//g.setColor(Color.RED);//change font colour
		//g.drawString(n,120,80);
	}
}