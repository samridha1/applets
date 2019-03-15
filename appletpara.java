package applets;
//at runtime how to provide value 

import java.applet.Applet;
import java.awt.Graphics;

public class appletpara extends Applet{
	String msg;
	int m1,m2,tot;
	public void init()
	{
		msg=this.getParameter("message");
		//here message is the argument passed what is therein that 
		if(msg==null)
		{
			msg="no parameter";
		}
		m1=Integer.parseInt(this.getParameter("num1"));
		m2=Integer.parseInt(this.getParameter("num2"));
		tot=m1+m2;
		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,40);
		g.drawString(String.valueOf(tot),20,60);
		
	}
}
