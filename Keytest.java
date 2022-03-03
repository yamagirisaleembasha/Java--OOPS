import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Keytest extends Applet implements KeyListener
{
	public void init()
	{
		Label l=new Label("enter char:");
		add(l);
		TextField tf=new TextField(20);
		tf.addKeyListener(this);
		add(tf);
	}
	public void keyPressed(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e)
	{
		showStatus("recently typed charcter in the text field is :"+e.getKeyChar());
	}
}
/*<applet code="Keytest.class" width="500" height="600">
</applet>*/
