import javax.swing.*;
import java.awt.*;
class calculator1
{	
	JFrame frmobj;
	BorderLayout borderobj;
	JButton btn1,btn2,btn3,btn4,btn5;
	public void CreateComp()
	{
		borderobj=new BorderLayout();
		frmobj=new JFrame("Calculator");
		btn1=new JButton("Addition");
		btn2=new JButton("Subtraction");
		btn3=new JButton("Multiplication");
		btn4=new JButton("Division");
		btn5=new JButton("Calculate");
	}
	public void displayComp()
	{
		frmobj.setLayout(borderobj);
		frmobj.add(btn1,BorderLayout.NORTH);
		frmobj.add(btn2,BorderLayout.SOUTH);
		frmobj.add(btn3,BorderLayout.WEST);
 		frmobj.add(btn4,BorderLayout.EAST);
		frmobj.add(btn5,BorderLayout.CENTER);
		frmobj.setSize(200,200);
		frmobj.setVisible(true);
	}
	public static void main(String args[])
	{
		calculator1 c1=new calculator1();
		c1.CreateComp();
		c1.displayComp();
	}


}