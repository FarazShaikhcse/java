import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class calc extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3;
	public void init()
{
	makegui();
}
private void makegui()
{
	setLayout(new FlowLayout());
	l1=new JLabel("input1");
	add(l1);
	t1=new JTextField(10);
	add(t1);
	
}
public void actionPerformed(ActionEvent e)
{}
}