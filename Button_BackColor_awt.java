import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button r1,b1,g1;
	FDemo()
	{
		setTitle("Login Page");
		Font f=new Font("Brush Script MT",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		r1= new Button("REDD!!!");
		r1.setLocation(200,100);
		r1.setSize(120,40);
		add(r1);
		
		b1= new Button("BLUE!!!");
		b1.setLocation(200,200);
		b1.setSize(120,40);
		add(b1);
		
		g1= new Button("GREEN!!!");
		g1.setLocation(200,300);
		g1.setSize(120,40);
		add(g1);
		
		b1.addActionListener(this);
		g1.addActionListener(this);
		r1.addActionListener(this);
		
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==r1)
		{
			setBackground(Color.RED);
		}
		if(e.getSource()==g1)
		{
			setBackground(Color.GREEN);
		}
		if(e.getSource()==b1)
		{
			setBackground(Color.BLUE);
		}
	}
}
class Button_BackColor_awt
{
	public static void main(String ar[])
	{
	FDemo f= new FDemo();
	f.setVisible(true);
	f.setSize(800,600);
	f.setLocation(200,100);
	f.setBackground(Color.WHITE);
	}
}