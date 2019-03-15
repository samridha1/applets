package applets;

import java.applet.Applet;
import java.awt.*;

public class Apletpic extends Applet{
	MediaTracker mt;
	Image img1,img2;
	public void init()
	{
		mt=new MediaTracker(this);
		img1=getImage(getCodeBase(),"s1.gif");
		img2=getImage(getCodeBase(),"s2.gif");
	}
	public void paint(Graphics g)
	{
		mt.addImage(img1,0);
		mt.addImage(img2,0);
		g.drawImage(img1,20,40,300,200,this);
		//300 200 are height and width
		g.drawImage(img2,20,300,this);
	}
	
	
}
