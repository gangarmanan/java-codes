import javax.swing.*;
import java.awt.*;
class Border1
{	
	JFrame frm;
	JRadioButton rbm,rbf;
	JComboBox cbstream;
	JTextField txtfno,txtsno;
	JLabel lblfno,lblsno,lblgen,lblhobb,lblstudy;
	FlowLayout flowobj;
	JCheckBox cbxhobb1,cbxhobb2,cbxhobb3;
	public void CreateComp()
	{
		frm=new JFrame("INFO");
		txtfno=new JTextField(10);
		txtsno=new JTextField(10);
		lblfno=new JLabel("enter First name");
		lblsno=new JLabel("enter Second name"); 
		lblhobb=new JLabel("enter Hobby");	
		lblgen=new JLabel("SELECT gender");
		lblstudy=new JLabel("Select Qualification");
		rbm=new JRadioButton("mal");
		rbf=new JRadioButton("F");
		cbxhobb1=new JCheckBox("Cricket");
		cbxhobb2=new JCheckBox("Football");
		cbxhobb3=new JCheckBox("Chess");
		String[]stream={"SCIENCE","COMM","ARTS"};
		cbstream=new JComboBox(stream);
		flowobj=new FlowLayout();
	}
	
	public void displaycomp()
	{
		frm.setLayout(flowobj);
		frm.add(lblfno);
		frm.add(txtfno);
		frm.add(lblsno);
		frm.add(txtsno);
		frm.add(lblgen);
		frm.add(rbm);
		frm.add(rbf);
		frm.add(lblstudy);
		frm.add(cbstream);
		frm.add(cbxhobb1);
		frm.add(cbxhobb2);
		frm.add(cbxhobb3);
		frm.setSize(200,200);
		frm.setVisible(true);
	}

	public static void main(String args[])
	{
		Border1 obj=new Border1();
		obj.CreateComp();
		obj. displaycomp();
	}
}
		
	