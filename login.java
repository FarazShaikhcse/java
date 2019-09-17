import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class login extends JFrame implements ActionListener {
JButton jb;
JLabel l1,l2,l3;
JTextField t1,t2;
login(){
	setLayout(new FlowLayout());
	setSize(250,200);
	l1=new JLabel("Username");
	add(l1);
	t1=new JTextField(10);
	add(t1);
	l2=new JLabel("Password");
	add(l2);
	t2=new JTextField(10);
	add(t2);
	l3=new JLabel("");
	add(l3);
	setVisible(true);
	jb=new JButton("Submit");
    jb.setActionCommand("submit");
    jb.addActionListener(this);
    add(jb);
    
}
public void actionPerformed(ActionEvent e)
{
	String uname=t1.getText();
	String pass=t2.getText();
	if(uname.equals("4nm17cs061")&&pass.equals("faraz123"))
	{
		setVisible(false);
		dispose();
		Nextpage np=new Nextpage();
		np.setVisible(true);
		JLabel l4=new JLabel("Welcome:"+uname);
		np.getContentPane().add(l4);
	}
	else
	{
		l3.setText("enter valid username and password");
	}
	
}
public static void main(String args[])
{
	new login();
}
}
class Nextpage extends JFrame{
	
	Nextpage()
	{
		setLayout(new FlowLayout());
		setSize(200,200);
		
	}
}
