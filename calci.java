package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class calci extends Applet implements ActionListener {
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	public void init()
	{
		l1=new Label("Number_1");
		l2=new Label("Number_2");
		l3=new Label("result");
		t1=new TextField("hello",5);
		t2=new TextField("hello",5);
		t3=new TextField(5);
		b1=new Button("Add");
		b2=new Button("Sub");
		b3=new Button("Mul");
		b4=new Button("Div");
		t1.addFocusListener(new FocusListener()
		{

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				t1.setText("");
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		t2.addFocusListener(new FocusListener()
		{

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				t2.setText("");
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		//setBackground(Color.lightGray);
	}
	public void start()
	{
		setLayout(new FlowLayout());
		//l1.setBounds(20,20,120,30);t1.setBounds(180,20,120,30);
		//l2.setBounds(20,100,120,30);t2.setBounds(180,100,120,30);
		//l3.setBounds(20,180,120,30);t3.setBounds(180,180,120,30);
		//b1.setBounds(20,250,60,30);b2.setBounds(90,250,60,30);b3.setBounds(160,250,60,30);b4.setBounds(230,250,60,30);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = 0;
		if(e.getSource()==b1)
			x=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		else if(e.getSource()==b2)
			x=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
		else if(e.getSource()==b3)
			x=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
		else if(e.getSource()==b4)
			x=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
		t3.setText(String.valueOf(x));
	}
	

}
