import javax.swing.*;
import java.awt.*;
class Border12
{	
	JFrame frmobj;
	GridLayout gr;
	JRadioButton rbm,rbf;
	JComboBox cbx;
	JTextField txtrn,txtn,txtadd;
	String[]stream={"SCIENCE","COMM","ARTS"};
	JLabel lblrn,lbln,lblgen,lbladd,lbleq;
	ButtonGroup bg;
	JPanel pnlbtn3,pnlbtn1,pnlbtn2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

	public void CreateComp()
	{
		frmobj=new JFrame("INFO");
		gr=new GridLayout(6,2);
		lblrn=new JLabel("enter roll no");
		txtrn=new JTextField(10);
		lbln=new JLabel("enter NAME");
		txtn=new JTextField(10);
		lbladd=new JLabel("enter ADDRESS");	
		lblgen=new JLabel("SELECT gender");
		rbm=new JRadioButton("mal");
		rbf=new JRadioButton("F");
		pnlbtn1=new JPanel();
		pnlbtn2=new JPanel();
		pnlbtn3=new JPanel();
		bg=new ButtonGroup();
		lbleq=new JLabel("Select Qualification");
		cbx=new JComboBox(stream);
		btn1=new JButton("FIRST");
		btn2=new JButton("NEXT");
		btn3=new JButton("PREV");
		btn4=new JButton("Last");
		btn5=new JButton("ADD");
		btn6=new JButton("UPDATE");
		btn7=new JButton("DELETE");
		btn8=new JButton("SUBMIT");
	}
	public void displaycomp()
	{
		frmobj.setLayout(gr);
		frmobj.add(lblrn);
		frmobj.add(txtrn);
		frmobj.add(lbln);
		frmobj.add(txtn);
		frmobj.add(lblgen);
		frmobj.add(pnlbtn3);
		pnlbtn3.add(rbm);
		pnlbtn3.add(rbf);
		frmobj.add(lbleq);
		frmobj.add(pnlbtn1);
		frmobj.add(pnlbtn2);
		frmobj.add(btn1);
		pnlbtn1.add(btn2);
		pnlbtn1.add(btn3);
		pnlbtn1.add(btn4);
		pnlbtn1.add(btn5);
		pnlbtn1.add(btn6);
		pnlbtn1.add(btn7);
		pnlbtn1.add(btn8);
		frmobj.setSize(300,300);
		frmobj.setVisible(true);
	}
	public static void main(String args[])
	{
		Border12 obj=new Border12();
		obj.CreateComp();
		obj.displaycomp();
	}
}

		
		
		
	
	
		
		