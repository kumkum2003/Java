import java.awt.*;
class FDemo extends Frame
{
FDemo()
{
Font f=new Font("Forte",Font.ITALIC,30); 
setFont(f);
}
public void paint(Graphics g)
{
int i,j;
int x=100;
int y=100;
for(i=1;i<=10;i++)
{
for(j=1;j<=10;j++)
{
try{Thread.sleep(30);}catch(Exception e){}
int r1=(int)Math.round(Math.random()*255);
int g1=(int)Math.round(Math.random()*255);
int b1=(int)Math.round(Math.random()*255);

Color c1=new Color(r1,g1,b1);
g.setColor(c1);
g.drawString(""+i*j,x,y);
x=x+50;
}
y=y+50;
x=100;
}
}
}

class Table_1to10awt
{
public static void main(String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(800,600);
f.setLocation(200,100);
f.setBackground(Color.BLACK);
}
}