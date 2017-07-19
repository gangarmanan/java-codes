import javax.swing.*;
import java.awt.*;
public class example1
{
	JFrame frmobj;
	JLabel lblrn,lblname,lblgen,lblhobb,lblqual;
	JTextField txtrn,txtname;
	JRadioButton rbmale,rbfemale;
	JCheckBox cbxhobb1,cbxhobb2,cbxhobb3;
	JButton btnadd,btnup,btndl,btnser,btnsu,btnex;
	ButtonGroup bg;
	JComboBox cbx;
	String[]stream={"SCIENCE","COMM","ARTS"};
	FlowLayout flowobj;
	
	public void createcomp()
	{
		frmobj=new JFrame("Login");
		flowobj=new FlowLayout();
		lblrn=new JLabel("enter rollno");
		lblname=new JLabel("enter name"); 
		lblhobb=new JLabel("enter Hobby");	
		lblgen=new JLabel("SELECT gender");
		lblqual=new JLabel("Select Quality");
		txtrn=new JTextField(10);
		txtname=new JTextField(10);
		rbmale=new JRadioButton("male");
		rbfemale=new JRadioButton("Female");
		cbxhobb1=new JCheckBox("Cricket");
		cbxhobb2=new JCheckBox("Football");
		cbxhobb3=new JCheckBox("Chess");
		cbx=new JComboBox(stream);
		btnadd=new JButton("ADD");
		btnup=new JButton("UPDATE");
		btndl=new JButton("DELETE");
		btnser=new JButton("CANCEL");
		btnsu=new JButton("SAVE");
		btnex=new JButton("EXIT");
		bg=new ButtonGroup();
	}
	
	public void displaycomp()
	{
		frmobj.setLayout(flowobj);
		frmobj.add(lblrn);
		frmobj.add(txtrn);
		frmobj.add(lblname);
		frmobj.add(txtname);
		frmobj.add(lblgen);
		frmobj.add(rbmale);
		frmobj.add(rbfemale);
		bg.add(rbmale);
		bg.add(rbfemale);
		frmobj.add(cbx);
		frmobj.add(lblhobb);
		frmobj.add(cbxhobb1);
		frmobj.add(cbxhobb2);
		frmobj.add(cbxhobb3);
		frmobj.setSize(300,300);
		frmobj.setVisible(true);
	}
	
	public static void main(String args[])
	{
		example1 obj=new example1();
		obj.createcomp();
		obj.displaycomp();
	}
}