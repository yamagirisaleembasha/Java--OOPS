import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Mousetest extends Applet implements MouseListener,MouseMotionListener
{
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		showStatus("Mouse clicked at "+e.getX()+" , "+e.getY());
	}
	public void mouseEntered(MouseEvent e)
	{
		showStatus("Mouse entered at "+e.getX()+" , "+e.getY());
	}
	public void mousePressed(MouseEvent e)
	{
		showStatus("Mouse pressed at "+e.getX()+" , "+e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		showStatus("Mouse released at "+e.getX()+" , "+e.getY());
	}
	public void mouseExited(MouseEvent e)
	{
		showStatus("Mouse exited at "+e.getX()+" , "+e.getY());
	}
	public void mouseDragged(MouseEvent e)
	{
		showStatus("Mouse Dragged at "+e.getX()+" , "+e.getY());
	}
	public void mouseMoved(MouseEvent e)
	{
		showStatus("Mouse moved at "+e.getX()+" , "+e.getY());
	}
}
/*<applet code="Mousetest.class" width="500" height="600">
</applet>
*/
