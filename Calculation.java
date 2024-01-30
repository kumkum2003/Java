import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	TextField tx1,tx2,tx3;
	FDemo()
	{
		Font f= new Font("Brush Script MT",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		
		Label u1=new Label("Enter No.1:");
		u1.setSize(180,50);
		u1.setLocation(100,100);
		add(u1);
		
		tx1=new TextField(10);
		tx1.setSize(100,50);
		tx1.setLocation(300,100);
		add(tx1);
		
		Label u2=new Label("Enter No.2:");
		u2.setSize(180,50);
		u2.setLocation(100,200);
		add(u2);
		
		tx2=new TextField(10);
		tx2.setSize(100,50);
		tx2.setLocation(300,200);
		add(tx2);
		
		
		b1= new Button("+");
		b1.setSize(60,50);
		b1.setLocation(100,300);
		add(b1);
		
		b2= new Button("-");
		b2.setSize(60,50);
		b2.setLocation(200,300);
		add(b2);
		
		b3= new Button("*");
		b3.setSize(60,50);
		b3.setLocation(300,300);
		add(b3);
		
		b4= new Button("/");
		b4.setSize(60,50);
		b4.setLocation(400,300);
		add(b4);
		
		Label u3=new Label("Output:");
		u3.setSize(180,50);
		u3.setLocation(100,450);
		add(u3);
		
		tx3=new TextField(20);
		tx3.setSize(200,50);
		tx3.setLocation(300,450);
		add(tx3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s1= tx1.getText();
		String s2= tx2.getText();
		int x= Integer.parseInt(s1);
		int y= Integer.parseInt(s2);
		if(e.getSource()==b1)
		{
			tx3.setText(""+(x+y));
			
		}
		if(e.getSource()==b2)
		{
			
			tx3.setText(""+(x-y));
		}
		
		if(e.getSource()==b3)
		{
			tx3.setText(""+(x*y));
		}
		
		if(e.getSource()==b4)
		{
			tx3.setText(""+(x/y));
		}
	}
}

class Calculation
{
	public static void main(String ar[])
	{
	FDemo f= new FDemo();
	f.setVisible(true);
	f.setSize(800,700);
	f.setLocation(200,100);
	//setResizable(false);
    }
}