import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class FDemo7 extends Frame implements ActionListener 
{  
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn=1;
    FDemo7()
    {  setTitle("TIC TAC TOE GAME");
      Font f = new Font("Elephant",Font.ITALIC,30);
       setFont(f);
       setLayout(null); 

       Label lb9=new Label("Let's Play!!");
             lb9.setSize(350,40);
             lb9.setLocation(100,50);
             add(lb9);

       b1=new Button();
       b1.setSize(100,100);
       b1.setLocation(100,100);
       add(b1);
       
       b2=new Button();
       b2.setSize(100,100);
       b2.setLocation(200,100);
       add(b2);
       
       b3=new Button();
       b3.setSize(100,100);
       b3.setLocation(300,100);
       add(b3);
       
       b4=new Button();
       b4.setSize(100,100);
       b4.setLocation(100,200);
       add(b4);
       
       b5=new Button();
       b5.setSize(100,100);
       b5.setLocation(200,200);
       add(b5);
       
       b6=new Button();
       b6.setSize(100,100);
       b6.setLocation(300,200);
       add(b6);
       
       b7=new Button();
       b7.setSize(100,100);
       b7.setLocation(100,300);
       add(b7);
       
       b8=new Button();
       b8.setSize(100,100);
       b8.setLocation(200,300);
       add(b8);
       
       b9=new Button();
       b9.setSize(100,100);
       b9.setLocation(300,300);
       add(b9);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
     { if (e.getSource()==b1) 
       { if(b1.getLabel()=="")
        {if(turn%2==0)
         { b1.setLabel("0"); }
         else
         { b1.setLabel("x"); }
         turn++;
       }
      }   

      if (e.getSource()==b2) 
       { if(b2.getLabel()=="")
        {if(turn%2==0)
         { b2.setLabel("0"); }
         else
         { b2.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b3) 
       { if(b3.getLabel()=="")
        {if(turn%2==0)
         { b3.setLabel("0"); }
         else
         { b3.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b4) 
       { if(b4.getLabel()=="")
        {if(turn%2==0)
         { b4.setLabel("0"); }
         else
         { b4.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b5) 
       { if(b5.getLabel()=="")
        {if(turn%2==0)
         { b5.setLabel("0"); }
         else
         { b5.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b6) 
       { if(b6.getLabel()=="")
        {if(turn%2==0)
         { b6.setLabel("0"); }
         else
         { b6.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b7) 
       { if(b7.getLabel()=="")
        {if(turn%2==0)
         { b7.setLabel("0"); }
         else
         { b7.setLabel("x"); }
         turn++;
       }
      }   
     if (e.getSource()==b8) 
       { if(b8.getLabel()=="")
        {if(turn%2==0)
         { b8.setLabel("0"); }
         else
         { b8.setLabel("x"); }
         turn++;
       }
      }   
      if (e.getSource()==b9) 
       { if(b9.getLabel()=="")
        {if(turn%2==0)
         { b9.setLabel("0"); }
         else
         { b9.setLabel("x"); }
         turn++;
       }
      }   
	  
	  
       if(b1.getLabel()==b2.getLabel()&&b1.getLabel()!="")
       {  if(b1.getLabel()==b3.getLabel())
          {
             Label lb1=new Label(" winner player="+b1.getLabel());
             lb1.setSize(250,40);
             lb1.setLocation(450,200);
             add(lb1);
          }  
        }
       if(b4.getLabel()==b5.getLabel()&&b4.getLabel()!="")
       {  if(b4.getLabel()==b6.getLabel())
          {
             Label lb2=new Label(" winner player="+b4.getLabel());
             lb2.setSize(250,40);
             lb2.setLocation(450,200);
             add(lb2);
          }  
        }
       if(b7.getLabel()==b8.getLabel()&&b7.getLabel()!="")
       {  if(b7.getLabel()==b9.getLabel())
          {
             Label lb3=new Label(" winner player="+b7.getLabel());
             lb3.setSize(250,40);
             lb3.setLocation(450,200);
             add(lb3);
          }  
        }
       if(b1.getLabel()==b4.getLabel()&&b1.getLabel()!="")
       {  if(b1.getLabel()==b7.getLabel())
          {
             Label lb4=new Label(" winner player="+b1.getLabel());
             lb4.setSize(250,40);
             lb4.setLocation(450,200);
             add(lb4);
          }  
        }
       if(b2.getLabel()==b5.getLabel()&&b2.getLabel()!="")
       {  if(b2.getLabel()==b8.getLabel())
          {
             Label lb5=new Label(" winner player="+b2.getLabel());
             lb5.setSize(250,40);
             lb5.setLocation(450,200);
             add(lb5);
          }  
        }
       if(b3.getLabel()==b6.getLabel()&&b3.getLabel()!="")
       {  if(b3.getLabel()==b9.getLabel())
          {
             Label lb6=new Label(" winner player="+b3.getLabel());
             lb6.setSize(250,40);
             lb6.setLocation(450,200);
             add(lb6);
          }  
        }
       if(b1.getLabel()==b5.getLabel()&&b1.getLabel()!="")
       {  if(b1.getLabel()==b9.getLabel())
          {
             Label lb7=new Label(" winner player="+b1.getLabel());
             lb7.setSize(250,40);
             lb7.setLocation(450,200);
             add(lb7);
          }  
        }
       if(b3.getLabel()==b5.getLabel()&&b3.getLabel()!="")
       {  if(b3.getLabel()==b7.getLabel())
          {
             Label lb8=new Label(" winner player="+b3.getLabel());
             lb8.setSize(250,40);
             lb8.setLocation(450,200);
             add(lb8);
          }  
        }
       
     }  
    
}
class Tictactoe {
    public static void main(String[] args) 
  { FDemo7 f =new FDemo7();
    f.setVisible(true);
    f.setSize(800,600);      
    f.setLocation(200,100); 
    f.setBackground(Color.CYAN);   
  }
}