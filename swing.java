package guidemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3;
JButton b1,b2,b3;
demo(){
	setLayout(new FlowLayout());
	setSize(500,200);
	l1=new JLabel("input1");
	add(l1);	
	t1=new JTextField(10);
	add(t1);
	l2=new JLabel("input2");
	add(l2);
	t2=new JTextField(10);
	add(t2);
	System.out.println();
	l3=new JLabel("input3");
	add(l3);
	t3=new JTextField(10);
	add(t3);
	System.out.println();
	setVisible(true);
	b1=new JButton("Sum");
     b1.setActionCommand("sum");
     b1.addActionListener(this);
     add(b1);
	b2=new JButton("Average");

     b2.setActionCommand("average");
     b2.addActionListener(this);
     add(b2);
     b3=new JButton("largest");
     b3.setActionCommand("largest");
     b3.addActionListener(this);
     add(b3);
     l5=new JLabel("");
		add(l5);
	
}
public void actionPerformed(ActionEvent e)
{
	Float a = Float.valueOf(t1.getText());	
	Float b = Float.valueOf(t2.getText());	
	Float c = Float.valueOf(t3.getText());	
	
	if(e.getActionCommand()=="sum")
	{
		Float d=a+b+c;
		l5.setText("Sum is "+d);
	}
	else if(e.getActionCommand()=="average")
	{
		Float av=(a+b+c)/3;
		l5.setText("Average is "+av);
	}
	else
	{
		Float m1=Math.max(a,b);
		Float m2=Math.max(m1,c);
		l5.setText("Largest is "+m2);
	}
}
}
