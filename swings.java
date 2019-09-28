import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
import java.awt.*;
public class swings implements ActionListener,ListSelectionListener{
	JLabel l1,l2,l3,l4,l5; 
	JButton b1,b2;
	JCheckBox c1,c2,c3,c4;
	JRadioButton rb1,rb2; 
	JTextField t1,t2;
	JList<String>jlist;

	JScrollPane jp;
	JLabel jlb;
	String
	cities[]={"Delhi","Bangalore","Mumbai"}; 
	swings()
	{
	JFrame jf=new JFrame("Choices");
	jf.setSize(300,300);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	jf.setLayout(new FlowLayout());
	t1=new JTextField(10);
	t2=new JTextField(10);
	l1=new JLabel("Enter name");
	l2=new JLabel("Enter Contact no"); 
	jf.add(l1);
	jf.add(t1);
	jf.add(l2);
	jf.add(t2);
	l3=new JLabel("Choose gender"); 
	jf.add(l3);
	rb1=new JRadioButton("Male"); 
	rb2=new JRadioButton("Female");
	rb1.addActionListener(this);
	rb2.addActionListener(this);
	jf.add(rb1);

	jf.add(rb2);
	ButtonGroup bg=new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);
	l4=new JLabel("Choose Hobbies\n");
	jf.add(l4);
	c1=new JCheckBox("Singing");
	c2=new JCheckBox("Reading Books"); 
	c3=new JCheckBox("Dancing");
	c4=new JCheckBox("Playing");
	c1.addActionListener(this);
	c2.addActionListener(this);
	c3.addActionListener(this);
	c4.addActionListener(this);
	jf.add(c1);
	jf.add(c2);
	jf.add(c3);
	jf.add(c4);
	jlist=new JList<String>(cities);
	jp=new JScrollPane(jlist);
	jp.setPreferredSize(new Dimension(100,120));
	jlist.addListSelectionListener(this);
	jf.add(jp);
	jlb=new JLabel("Select a city");
	jf.add(jlb);
	b1=new
	JButton("Submit");

	b1.addActionListener(this); 
	jf.add(b1);
	jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("Submit"))
	{
	String a=t1.getText();
	String b=t2.getText();
	String c="";
	String d="";
	String g="";
	if(rb1.isSelected())
	{
	c="Male";
	}
	if(rb2.isSelected())
	{
	c="Female";
	}
	if(c1.isSelected())
	{
	d="Singing";
	}

	if(c2.isSelected())
	{
	d="Reading Books";
	}
	if(c3.isSelected())
	{
	d="Dancing";
	}
	if(c4.isSelected())
	{
	d="Playing";
	}
	int i=jlist.getSelectedIndex(); 
	if(i!=-1)
	{
	g=cities[i];
	}
	String tot="Name is "+a+"\n"+"Contact is "+b+"\n"+"Gender :"+c+"\n"+"Hobbies:"+d+"\n City :"+g;
	JOptionPane.showMessageDialog(null,tot);
	}  }
	public void valueChanged(ListSelectionEvent le)
	{
	int i=jlist.getSelectedIndex();
	if(i!=-1)
	{
	jlb.setText("city is "+cities[i]);

	}
	}

	
	public static void main(String[] args) {
	new swings();

	}

}
