package applets;

import java.awt.*;

import javax.swing.*;
import javax.swing.JLabel;

public class animation extends JApplet implements Runnable{
	String[] img=new String[4];
	int index=-1;
	Thread imageThread;
	Label l1;
	JLabel jl1;
	TextField tf1;
	ImageIcon I;
	public void init()
	{
		l1=new Label("Enter name");
		tf1=new TextField(50);
		img[0]="s1.gif";
		img[1]="s2.gif";
		img[2]="s3.gif";
		img[3]="4.gif";
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(l1);
		getContentPane().add(tf1);
		I =new ImageIcon("5.gif");
		jl1=new JLabel(I);
		getContentPane().add(jl1);
		}
	public void start()
	{
		imageThread=new Thread(this);
		imageThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			index++;
			if(index>3)
			{
				index=0;
			}
			I=new ImageIcon(img[index]);
			jl1.setIcon(I);
			try
			{
				Thread.sleep(750);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}

}
