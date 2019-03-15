package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apltcontrols extends Applet implements ActionListener{
	//declaration
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	Choice ch1;
	Checkbox cb1,cb2;
	Button b1;
	TextArea ta1;
	Panel p1;
	public void init()
	{
		l1=new Label ("roll  number",Label.RIGHT);
		l2=new Label ("subject",Label.RIGHT);
		l3=new Label ("session",Label.RIGHT);
		l4=new Label ("reg fee",Label.RIGHT);
		l5=new Label ("exam fee",Label.RIGHT);
		t1=new TextField(25);//25 is length
		t2=new TextField(25);
		t3=new TextField(25);
		ch1=new Choice();
		ch1.add("physics");
		ch1.add("chemistry");
		ch1.add("maths");
		cb1=new Checkbox("Theory");
		cb2=new Checkbox("prac");
		b1=new Button ("submit");
		ta1=new TextArea(100,50);
		p1=new Panel();
	}
	public void start()
	{
		
		//setLayout(new GridLayout(6,2,1,1));
		//when we put set when we maximize and minimize it doesnt change
		setLayout(null);
		l1.setBounds(20,20,120,30);t1.setBounds(180,20,120,30);
		l2.setBounds(20,70,120,30);ch1.setBounds(180,70,120,30);
		l3.setBounds(20,120,120,30);p1.setBounds(180,120,120,30);
		l4.setBounds(20,170,120,30);t2.setBounds(180,170,120,30);
		l5.setBounds(20,220,120,30);t3.setBounds(180,220,120,30);
		b1.setBounds(20,300,120,30);ta1.setBounds(180,300,150,130);
		p1.add(cb1);p1.add(cb2);
		add(l1);add(t1);
		add(l2);add(ch1);
		add(l3);add(p1);
		add(l4);add(t2);
		add(l5);add(t3);
		add(b1);add(ta1);
		b1.addActionListener(this);
		//t3.setEditable(false)
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String s1,s2="",s3;int tot=0;
		
		s1=t1.getText()+"\n"+ch1.getSelectedItem()+"\n";
		if(cb1.getState())
			s2=s2+cb1.getLabel();
		
		if(cb2.getState())
			s2=s2+"\t"+cb2.getLabel();
		tot=Integer.parseInt(t2.getText())+Integer.parseInt(t3.getText());
		s3=t2.getText()+"\n"+t3.getText()+"\n";
		ta1.setText(s1+s2+"\n"+s3);
		ta1.append(String.valueOf(tot));// will add it to ta1 if not it will get overwritten
	}

}
