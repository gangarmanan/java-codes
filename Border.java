import javax.swing.*;
import java.awt.*;
class Border
{	
	JFrame frmobj;
	BorderLayout borderobj;
	JLabel lbln,lble,lblw,lblc;
	JPanel btnpanel;
	JButton btn1,btn2,btn3;
	public void CreateComp()
	{
		borderobj=new BorderLayout();
		frmobj=new JFrame("Form");
		lbln=new JLabel("Aptech");
		lble=new JLabel("Reebok");
		lblw=new JLabel("Nike");
		lblc=new JLabel("Calculate");
		btn1=new JButton("Add");
		btn2=new JButton("Sub");
		btn3=new JButton("Next");
		btnpanel=new JPanel();
	}
	public void displayComp()
	{
		frmobj.setLayout(borderobj);
		frmobj.add(lbln,BorderLayout.NORTH);
		frmobj.add(lblw,BorderLayout.WEST);
 		frmobj.add(lble,BorderLayout.EAST);
		frmobj.add(lblc,BorderLayout.CENTER);
		frmobj.add(btnpanel,BorderLayout.SOUTH);
		btnpanel.add(btn1);
		btnpanel.add(btn2);
		btnpanel.add(btn3);
		frmobj.setSize(300,300);
		frmobj.setVisible(true);
	}
	public static void main(String[] args)
	{
		Border p12=new Border();
		p12.CreateComp();
		p12.displayComp();
	}


}