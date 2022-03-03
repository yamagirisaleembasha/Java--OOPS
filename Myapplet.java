import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	Font f1;
	public void  init()    
        {    
		f1 = new Font("Arial",Font.BOLD,24);      
        }  
	public void paint(Graphics g)
	{
		g.setColor(Color.black); 
		setBackground(Color.red);
		g.setFont(f1);
		g.drawString("Welcome SALEEMBASHA",30,40); 
		g.drawLine(20,30,20,300);  
		g.drawRect(70,100,30,30);
		g.fillRect(170,100,30,30);  
		g.drawOval(70,200,20,30);  
		g.setColor(Color.pink);
		g.fillOval(170,200,30,20);  
		g.drawArc(90,150,30,30,30,270);  
		g.fillArc(270,150,30,30,0,180);
	}  
}
/*<applet code="Myapplet.class" width="300" height="200">
</applet>*/
